package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

   //declare variables y un vector y agregue imagenes
    private static final Random generador =new Random();
    private static final Integer [] imagenesID=
            {R.drawable.a, R.drawable.aa, R.drawable.bb, R.drawable.cc, R.drawable.dd, R.drawable.p, R.drawable.q,R.drawable.r, R.drawable.u, R.drawable.x};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Integer q = imagenesID[generador.nextInt(imagenesID.length)];
        final ImageView iv = (ImageView) findViewById(R.id.imgRandom);

        View nextButton = findViewById(R.id.btnImagen);
        nextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int resource = imagenesID[generador.nextInt(imagenesID.length)];
                iv.setImageResource(resource);
            }
        });
    }}
