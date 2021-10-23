package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    //    private Button btnHitung1;

    public EditText txt_alas;
    public EditText txt_tinggi;
    public TextView txtHasil1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//
        attributSegitiga();




    }

    public void attributSegitiga(){
        txt_tinggi = findViewById(R.id.txtTinggi);
        txt_alas = findViewById(R.id.txtAlas);
        txtHasil1 = findViewById(R.id.txtHasil1);
    }

    public void hitungSegitigaLuas(View v){
        int alas = Integer.parseInt(txt_alas.getText().toString());
        int tinggi = Integer.parseInt(txt_tinggi.getText().toString());
        double hasil2 = 0.5 * (double)alas * (double)tinggi;
        txtHasil1.setText(("Luas Segitiga : " + hasil2 ));

    }
    public  void hitungSegitigaKeliling(View v){
        int alas = Integer.parseInt(txt_alas.getText().toString());
        double hasil2 = 3 * (double)alas ;
        txtHasil1.setText(("Keliling Segitiga : " + hasil2  ));

    }

    public void pindah1(View view){
        Intent intent = new Intent( MainActivity2.this, MainActivity3.class);
        startActivity(intent);
    }

}