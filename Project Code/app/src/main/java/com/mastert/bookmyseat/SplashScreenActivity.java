package com.mastert.bookmyseat;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash_screen);


            Thread background = new Thread() {
                public void run() {

                    try {
                        // Thread will sleep for 3 seconds
                        sleep(3*1000);

                        Intent intent = new Intent(SplashScreenActivity.this,Registration.class);
                        startActivity(intent);

                        // After 3 seconds redirect to another intent
                        //Remove activity

                        finish();
                    } catch (Exception e) {

                    }
                }
            };

            // start thread
            background.start();

        }
        @Override
        protected void onDestroy() {

            super.onDestroy();

        }
    }
