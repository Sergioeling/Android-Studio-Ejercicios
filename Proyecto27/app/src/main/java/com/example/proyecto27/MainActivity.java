package com.example.proyecto27;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ejecutar(View v) {

        //Uri datos = Uri.parse(getExternalFilesDir(null).toString() + "gato.mp3");
       try {
           Uri datos =Uri.parse(Environment.getExternalStoragePublicDirectory
                   (Environment.DIRECTORY_RINGTONES).getPath()+"/gatito.mp3");

        MediaPlayer mp = MediaPlayer.create(this, datos);
        mp.start();
    }catch (Exception e){
        Toast.makeText(this,"error", Toast.LENGTH_LONG).show();
    }
    }
}