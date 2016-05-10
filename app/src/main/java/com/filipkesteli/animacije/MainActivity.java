package com.filipkesteli.animacije;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnTranslate;
    private Button btnAlpha;
    private Button btnScale;
    private Button btnRotate;

    private final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.anim_translate);
    private final Animation animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
    private final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
    private final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        setupListeners();



//        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.property_animator);
//        set.setTarget(R.id.translate);
//        set.start();
    }

    private void initWidgets() {
        btnAlpha = (Button) findViewById(R.id.btnAlpha);
        btnScale = (Button) findViewById(R.id.btnScale);
        btnTranslate = (Button) findViewById(R.id.btnTranslate);
        btnRotate = (Button) findViewById(R.id.btnRotate);
    }

    private void setupListeners() {
        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);
            }
        });
        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animRotate);
            }
        });
        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
            }
        });
        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animTranslate);
            }
        });
    }
}

