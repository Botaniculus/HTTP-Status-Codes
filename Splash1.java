package com.botaniculus.http_status_codes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Splash1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash1);

        final ImageView splashImg = (ImageView) findViewById(R.id.splashImg);

        Thread welcomeThread = new Thread(){
            @Override
            public void run() {
                try{
                    super.run();
                    sleep(4000);

                } catch (Exception e){

                } finally {
                    Intent intent1 = new Intent(Splash1.this, MainActivity.class);
                    startActivity(intent1);

                }
            }
        };

        welcomeThread.start();
    }
}
