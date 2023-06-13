package com.example.proyecto28;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ejecutar(View v) {
        MediaPlayer mp = new MediaPlayer();
        try {
            mp.setDataSource("https://altacapacidad.com/wp-content/uploads/2020/08/se-creativo.mp3");
            mp.prepare();
            mp.start();
        } catch (IOException e) {
        }
    }
}