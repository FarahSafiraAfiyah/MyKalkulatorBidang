package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    public EditText txtDiameter;
    public TextView txtHasil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        attributLingkaran();
    }


    public void attributLingkaran(){
        txtDiameter = findViewById(R.id.txtDiameter);
        txtHasil2 = findViewById(R.id.txtHasil2);
    }
    public void hitungLingkaranLuas(View v){
        float desimal = Float.parseFloat(txtDiameter.getText().toString());
        float hasil3 = (float)3.14 * ((float) desimal * (float) desimal);
        txtHasil2.setText(("Luas Lingakaran : " + hasil3  ));
    }

    public  void hitungLingkaranKeliling(View  v){
        float desimal = Float.parseFloat(txtDiameter.getText().toString());
        float hasil3 = 2 *(float)3.14 * (float) desimal ;
        txtHasil2.setText(("Keliling Lingakaran : " + hasil3 ));
    }
}