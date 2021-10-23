package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //    private Button btnHitung1;
    public EditText txt_panjang, txt_lebar;
    public TextView txtHasil;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
        attributPersgi();




    }
    public void attributPersgi(){
        txt_panjang = findViewById(R.id.txtPanjang);
        txt_lebar = findViewById(R.id.txtLebar);
        txtHasil = findViewById(R.id.txtHasil);
    }
    public void hitungPersegiluas(View v){
        int panjang = Integer.parseInt(txt_panjang.getText().toString()) * Integer.parseInt((txt_lebar.getText().toString()));
//        int hasil = panjang;
        txtHasil.setText(("Luas Persegi :  " + panjang));
    }

    public void hitungPersegiKeliling(View v){
        int panjang = Integer.parseInt(txt_panjang.getText().toString());
        int lebar = Integer.parseInt((txt_lebar.getText().toString()));
        int hasil = 2*panjang + 2*lebar;
        txtHasil.setText(("Keliling Persegi : "+ hasil));
    }

    public void pindah(View view){
        Intent intent = new Intent( MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }

}