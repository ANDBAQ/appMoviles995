package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Principiio extends AppCompatActivity {
    private View btnPrincipio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principiio);

        btnPrincipio =(Button) findViewById(R.id.buttonPrincipio);
        Intent intent = new Intent(Principiio.this, MenuPrincipal.class);
        intent.putExtra("Grett","Bienvenido.");
        startActivity(intent);

    }
}
