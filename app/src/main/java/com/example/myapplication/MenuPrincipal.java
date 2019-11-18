package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuPrincipal extends AppCompatActivity {
    private TextView taxtV;
    private View btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuprincipal);
        Bundle bundle= getIntent().getExtras();
        String Grett  = bundle.getString("Grett");
        taxtV.setText(Grett);

        btn2 =  findViewById(R.id.btnScanM);
        btn2.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent intent = new Intent (v.getContext(),ScanImages.class);
            startActivityForResult(intent, 0);
        }
        });
    }
}
