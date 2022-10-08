package com.example.praktikum;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        final EditText Alas =
                (EditText)findViewById(R.id.alas);
        final EditText Tinggi =
                (EditText)findViewById(R.id.tinggi);
        final EditText Luas_segitiga =
                (EditText)findViewById(R.id.luas);
        final Button tampil =
                (Button)findViewById(R.id.btn_hasil);
        tampil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String alas= Alas.getText().toString();
                float alas_sgt=Float.parseFloat(alas);
                String tinggi= Tinggi.getText().toString();
                float tinggi_sgt=Float.parseFloat(tinggi);
                // L = 1/2 x a x t
                float luas_sgt= (float) (0.5*alas_sgt*tinggi_sgt);
                String luas = String.valueOf(luas_sgt);
                Luas_segitiga.setText(luas);
            }
        });
    }


}