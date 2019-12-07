package com.example.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class HasilPerhitunganMahasiswaActivity extends AppCompatActivity {

    private TextView tvPelajaran;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_perhitungan_mahasiswa);

        String nama = getIntent().getStringExtra("nama");
        String pelajaran = getIntent().getStringExtra("pelajaran");
        String hasil = getIntent().getStringExtra("hasil");
        tvPelajaran = findViewById(R.id.tvPelajaran);

        tvPelajaran.setText(nama+"Mata Pelajaran "+pelajaran+" Hasil "+hasil);

    }
    public void gotoPerhitungan(View view){
        Intent i = new Intent(this,PerhitunganMahasiswaActivity.class);

        startActivity(i);
    }



}
