package com.example.shreehanumanchalisa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    MediaPlayer backgroundMusic;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        backgroundMusic = MediaPlayer.create(MainActivity.this,R.raw.hanuman_chalisa_background_music);


    }

    public void change(View view){
        Intent intent = new Intent(MainActivity.this, Content.class);
        startActivity(intent);
        backgroundMusic.start();
    }


}
