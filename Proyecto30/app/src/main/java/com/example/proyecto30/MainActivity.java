package com.example.proyecto30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ejecutar(View v)
    {
        /*Intent intent = new Intent(android.content.Intent.ACTION_VIEW);
        Uri data = Uri.parse("file:///sdcard" + "/gato.mp3");
        intent.setDataAndType(data, "audio/mp3");
        startActivity(intent);*/

        if(android.os.Build.VERSION.SDK_INT>=15){
            Intent intent=Intent.makeMainSelectorActivity(Intent.ACTION_MAIN,
                    Intent.CATEGORY_APP_MUSIC);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);//Min SDK 15
            startActivity(intent);
        }else{
            Intent intent = new Intent("android.intent.action.MUSIC_PLAYER");//Min SDK 8
            startActivity(intent);
        }
    }
}