package com.example.proyecto35;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout layout1 = findViewById(R.id.layout1);
        Lienzo fondo = new Lienzo(this);
        layout1.addView(fondo);
    }


    class Lienzo extends View {

        public Lienzo(Context context) {
            super(context);
        }

        protected void onDraw(Canvas canvas) {
            canvas.drawRGB(255, 255, 255);
            int ancho = canvas.getWidth();
            int alto = canvas.getHeight();

            Paint pincel1 = new Paint();
            pincel1.setARGB(255, 255, 0, 0);
            canvas.drawLine(70, 0, 70, alto, pincel1);
            canvas.drawLine(73, 0, 73, alto, pincel1);
            pincel1.setARGB(255, 0, 0, 0);

            int cantLineas = alto / 30 - 2;

            //compara las lineas a imprimir y tamaño
            for (int fila = 0; fila < cantLineas; fila++) {
                canvas.drawLine(0, fila * 50 + 60, ancho, fila * 50 + 60, pincel1);
            }
        }
    }
}