package com.example.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class PerhitunganMahasiswaActivity extends AppCompatActivity {

    public EditText etNama, etMapel, etNilai;
    public Button btnHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perhitungan_mahasiswa);
        etNama = findViewById(R.id.etNama);
        etMapel = findViewById(R.id.etMapel);
        etNilai = findViewById(R.id.etNilai);
    }

    public void gotoHasil(View view){
        String Nama = etNama.getText().toString();
        String Mapel = etMapel.getText().toString();
        int Nilai = Integer.valueOf(etNilai.getText().toString());


        if(Nilai < 0){
            Intent i = new Intent(this,HasilPerhitunganMahasiswaActivity.class);
            i.putExtra("nama",Nama);
            i.putExtra("pelajaran", Mapel);
            i.putExtra("hasil","Tigak Mungkin");
            startActivity(i);
        }

        else if(Nilai <= 60){
            Intent i = new Intent(this,HasilPerhitunganMahasiswaActivity.class);
            i.putExtra("nama",Nama);
            i.putExtra("pelajaran", Mapel);
            i.putExtra("hasil","Tigak Lulus");
            startActivity(i);
        }

        else if(Nilai <=90){
            Intent i = new Intent(this,HasilPerhitunganMahasiswaActivity.class);
            i.putExtra("nama",Nama);
            i.putExtra("pelajaran", Mapel);
            i.putExtra("hasil","Lulus");
            startActivity(i);
        }

        else if(Nilai > 90){
            Intent i = new Intent(this,HasilPerhitunganMahasiswaActivity.class);
            i.putExtra("nama",Nama);
            i.putExtra("pelajaran", Mapel);
            i.putExtra("hasil","Jenius");
            startActivity(i);
        }



    }

}
