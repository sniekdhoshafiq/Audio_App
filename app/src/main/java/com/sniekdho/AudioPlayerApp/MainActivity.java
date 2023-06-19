package com.sniekdho.AudioPlayerApp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView   surah_nas, surah_falaq, surah_iqlas, surah_lahab, surah_nasr,
                surah_kafiroon, surah_kauther, surah_maun, surah_quraish, surah_fil;
    MediaPlayer mediaPlayer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        surah_nas = findViewById(R.id.surah_nas);
        surah_falaq = findViewById(R.id.surah_falaq);
        surah_iqlas = findViewById(R.id.surah_iqlas);
        surah_lahab = findViewById(R.id.surah_lahab);
        surah_nasr = findViewById(R.id.surah_nasr);
        surah_kafiroon = findViewById(R.id.surah_kafiroon);
        surah_kauther = findViewById(R.id.surah_kauther);
        surah_maun = findViewById(R.id.surah_maun);
        surah_quraish = findViewById(R.id.surah_quraish);
        surah_fil = findViewById(R.id.surah_fil);


        //== Surah Nas
        surah_nas.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View v) {


                    //== Checking The TAG is not Empty & Matching the TAG
                if (surah_nas.getTag()!=null && surah_nas.getTag().toString().contains("NOT_PLAYING")){

                    if (mediaPlayer!= null) mediaPlayer.release();
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.surah_nas);
                    mediaPlayer.start();
                    surah_nas.setImageResource(R.drawable.stop_icon);
                    surah_nas.setTag("PLAYING");
                    //== Checking The TAG is not Empty & Matching the TAG


                    //== After Completely Playing One Music
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            surah_nas.setImageResource(R.drawable.play_icon);
                            surah_nas.setTag("NOT_PLAYING");
                        }
                    });
                    //== After Completely Playing One Music



                    //== Changing Icon's
                }else {
                    if (mediaPlayer!= null) mediaPlayer.release();
                    surah_nas.setImageResource(R.drawable.play_icon);
                    surah_nas.setTag("NOT_PLAYING");
                }
                    //== Changing Icon's

            }

        });
        //== Surah Nas



        //== Surah Falaq
        surah_falaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    //== Checking The TAG is not Empty & Matching the TAG
                if (surah_falaq.getTag()!=null && surah_falaq.getTag().toString().contains("NOT_PLAYING")){

                    if (mediaPlayer!=null) mediaPlayer.release();
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.surah_falaq);
                    mediaPlayer.start();
                    surah_falaq.setImageResource(R.drawable.stop_icon);
                    surah_falaq.setTag("PLAYING");
                    //== Checking The TAG is not Empty & Matching the TAG



                    //== After Completely Playing One Music
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            surah_falaq.setImageResource(R.drawable.play_icon);
                            surah_falaq.setTag("NOT_PLAYING");
                        }
                    });
                    //== After Completely Playing One Music



                    //== Changing Icon's
                }else {

                    if (mediaPlayer!=null) mediaPlayer.release();
                    surah_falaq.setImageResource(R.drawable.play_icon);
                    surah_falaq.setTag("NOT_PLAYING");

                }
                    //== Changing Icon's


            }
        });
        //== Surah Falaq



        //=Surah Iqlas
        surah_iqlas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    //== Checking The TAG is not Empty & Matching the TAG
                if (surah_iqlas.getTag()!=null && surah_iqlas.getTag().toString().contains("NOT_PLAYING")){

                    if (mediaPlayer!=null) mediaPlayer.release();
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.surah_iqlas);
                    mediaPlayer.start();
                    surah_iqlas.setImageResource(R.drawable.stop_icon);
                    surah_iqlas.setTag("PLAYING");
                    //== Checking The TAG is not Empty & Matching the TAG



                    //== After Completely Playing One Music
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            surah_iqlas.setImageResource(R.drawable.play_icon);
                            surah_iqlas.setTag("NOT_PLAYING");
                        }
                    });
                    //== After Completely Playing One Music



                    //== Changing Icon's
                }else {
                    if (mediaPlayer!=null) mediaPlayer.release();
                    surah_iqlas.setImageResource(R.drawable.play_icon);
                    surah_iqlas.setTag("NOT_PLAYING");

                }
                    //== Changing Icon's


            }
        });
        //=Surah Iqlas



        //Surah Lahab
        surah_lahab.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View v) {


                //== Checking The TAG is not Empty & Matching the TAG
                if (surah_lahab.getTag()!=null && surah_lahab.getTag().toString().contains("NOT_PLAYING")){

                    if (mediaPlayer!= null) mediaPlayer.release();
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.surah_lahab);
                    mediaPlayer.start();
                    surah_lahab.setImageResource(R.drawable.stop_icon);
                    surah_lahab.setTag("PLAYING");
                    //== Checking The TAG is not Empty & Matching the TAG


                    //== After Completely Playing One Music
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            surah_lahab.setImageResource(R.drawable.play_icon);
                            surah_lahab.setTag("NOT_PLAYING");
                        }
                    });
                    //== After Completely Playing One Music



                    //== Changing Icon's
                }else {
                    if (mediaPlayer!= null) mediaPlayer.release();
                    surah_lahab.setImageResource(R.drawable.play_icon);
                    surah_lahab.setTag("NOT_PLAYING");
                }
                //== Changing Icon's

            }

        });
        //Surah Lahab



        //== Surah Nasr
        surah_nasr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //== Checking The TAG is not Empty & Matching the TAG
                if (surah_nasr.getTag()!=null && surah_nasr.getTag().toString().contains("NOT_PLAYING")){

                    if (mediaPlayer!=null) mediaPlayer.release();
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.surah_nasr);
                    mediaPlayer.start();
                    surah_nasr.setImageResource(R.drawable.stop_icon);
                    surah_nasr.setTag("PLAYING");
                    //== Checking The TAG is not Empty & Matching the TAG



                    //== After Completely Playing One Music
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            surah_nasr.setImageResource(R.drawable.play_icon);
                            surah_nasr.setTag("NOT_PLAYING");
                        }
                    });
                    //== After Completely Playing One Music



                    //== Changing Icon's
                }else {

                    if (mediaPlayer!=null) mediaPlayer.release();
                    surah_nasr.setImageResource(R.drawable.play_icon);
                    surah_nasr.setTag("NOT_PLAYING");

                }
                //== Changing Icon's


            }
        });
        //== Surah Nasr



        //== Surah Kafiroon
        surah_kafiroon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //== Checking The TAG is not Empty & Matching the TAG
                if (surah_kafiroon.getTag()!=null && surah_kafiroon.getTag().toString().contains("NOT_PLAYING")){

                    if (mediaPlayer!=null) mediaPlayer.release();
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.surah_kafiroon);
                    mediaPlayer.start();
                    surah_kafiroon.setImageResource(R.drawable.stop_icon);
                    surah_kafiroon.setTag("PLAYING");
                    //== Checking The TAG is not Empty & Matching the TAG



                    //== After Completely Playing One Music
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            surah_kafiroon.setImageResource(R.drawable.play_icon);
                            surah_kafiroon.setTag("NOT_PLAYING");
                        }
                    });
                    //== After Completely Playing One Music



                    //== Changing Icon's
                }else {
                    if (mediaPlayer!=null) mediaPlayer.release();
                    surah_kafiroon.setImageResource(R.drawable.play_icon);
                    surah_kafiroon.setTag("NOT_PLAYING");

                }
                //== Changing Icon's


            }
        });
        //== Surah Kafiroon



        //== Surah Kauther
        surah_kauther.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View v) {


                //== Checking The TAG is not Empty & Matching the TAG
                if (surah_kauther.getTag()!=null && surah_kauther.getTag().toString().contains("NOT_PLAYING")){

                    if (mediaPlayer!= null) mediaPlayer.release();
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.surah_kauther);
                    mediaPlayer.start();
                    surah_kauther.setImageResource(R.drawable.stop_icon);
                    surah_kauther.setTag("PLAYING");
                    //== Checking The TAG is not Empty & Matching the TAG


                    //== After Completely Playing One Music
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            surah_kauther.setImageResource(R.drawable.play_icon);
                            surah_kauther.setTag("NOT_PLAYING");
                        }
                    });
                    //== After Completely Playing One Music



                    //== Changing Icon's
                }else {
                    if (mediaPlayer!= null) mediaPlayer.release();
                    surah_kauther.setImageResource(R.drawable.play_icon);
                    surah_kauther.setTag("NOT_PLAYING");
                }
                //== Changing Icon's

            }

        });
        //== Surah Kauther



        //== Surah Maun
        surah_maun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //== Checking The TAG is not Empty & Matching the TAG
                if (surah_maun.getTag()!=null && surah_maun.getTag().toString().contains("NOT_PLAYING")){

                    if (mediaPlayer!=null) mediaPlayer.release();
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.surah_maun);
                    mediaPlayer.start();
                    surah_maun.setImageResource(R.drawable.stop_icon);
                    surah_maun.setTag("PLAYING");
                    //== Checking The TAG is not Empty & Matching the TAG



                    //== After Completely Playing One Music
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            surah_maun.setImageResource(R.drawable.play_icon);
                            surah_maun.setTag("NOT_PLAYING");
                        }
                    });
                    //== After Completely Playing One Music



                    //== Changing Icon's
                }else {

                    if (mediaPlayer!=null) mediaPlayer.release();
                    surah_maun.setImageResource(R.drawable.play_icon);
                    surah_maun.setTag("NOT_PLAYING");

                }
                //== Changing Icon's


            }
        });
        //== Surah Maun



        //== Surah Quraish
        surah_quraish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //== Checking The TAG is not Empty & Matching the TAG
                if (surah_quraish.getTag()!=null && surah_quraish.getTag().toString().contains("NOT_PLAYING")){

                    if (mediaPlayer!=null) mediaPlayer.release();
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.surah_quraish);
                    mediaPlayer.start();
                    surah_quraish.setImageResource(R.drawable.stop_icon);
                    surah_quraish.setTag("PLAYING");
                    //== Checking The TAG is not Empty & Matching the TAG



                    //== After Completely Playing One Music
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            surah_quraish.setImageResource(R.drawable.play_icon);
                            surah_quraish.setTag("NOT_PLAYING");
                        }
                    });
                    //== After Completely Playing One Music



                    //== Changing Icon's
                }else {
                    if (mediaPlayer!=null) mediaPlayer.release();
                    surah_quraish.setImageResource(R.drawable.play_icon);
                    surah_quraish.setTag("NOT_PLAYING");

                }
                //== Changing Icon's


            }
        });
        //== Surah Quraish



        //== Surah Fil
        surah_fil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //== Checking The TAG is not Empty & Matching the TAG
                if (surah_fil.getTag()!=null && surah_fil.getTag().toString().contains("NOT_PLAYING")){

                    if (mediaPlayer!=null) mediaPlayer.release();
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.surah_fil);
                    mediaPlayer.start();
                    surah_fil.setImageResource(R.drawable.stop_icon);
                    surah_fil.setTag("PLAYING");
                    //== Checking The TAG is not Empty & Matching the TAG



                    //== After Completely Playing One Music
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            surah_fil.setImageResource(R.drawable.play_icon);
                            surah_fil.setTag("NOT_PLAYING");
                        }
                    });
                    //== After Completely Playing One Music



                    //== Changing Icon's
                }else {
                    if (mediaPlayer!=null) mediaPlayer.release();
                    surah_fil.setImageResource(R.drawable.play_icon);
                    surah_fil.setTag("NOT_PLAYING");

                }
                //== Changing Icon's


            }
        });
        //== Surah Fil


    }

}