package br.com.perimobileapps.nestapp;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;




public class SplashScreenActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        StartAnimations();

        new Timer().schedule(new TimerTask() {


            @Override
            public void run() {
                finish();

                Intent intent = new Intent();
                intent.setClass(SplashScreenActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }, 2015);
    }

    private void StartAnimations() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        anim.reset();
        FrameLayout l = (FrameLayout) findViewById(R.id.lin_lay);
        l.clearAnimation();
        l.startAnimation(anim);

      /*  anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim.reset();
        FrameLayout l2 = (FrameLayout) findViewById(R.id.lin_lay);
        l2.setVisibility(View.VISIBLE);
        l2.clearAnimation();
        l2.startAnimation(anim); */
    }

}
