package com.stefanee.meowtion;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 5000; // 5 second interval
    ImageView imageViewContainer;
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // xml
        imageViewContainer = (ImageView)findViewById(R.id.image_container);

        // set images
        imageViewContainer.setBackgroundResource(R.drawable.splash_cat_anim);

        //prepare and start animation
        animationDrawable = (AnimationDrawable)imageViewContainer.getBackground();
        animationDrawable.start();

        // LOADING SCREEN
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // Starts HomeActivity
                Intent home = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(home);

                // Close MainActivity
                finish();
            }
        },SPLASH_TIME_OUT);

    }
}
