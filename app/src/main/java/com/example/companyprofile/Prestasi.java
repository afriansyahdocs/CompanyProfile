package com.example.companyprofile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Prestasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prestasi);
    }

    public void reward(View view) {
        Intent intent = new Intent(Prestasi.this, RewardActivity.class);
        startActivity(intent);
    }

    public void penyerahan(View view) {
        Intent intent = new Intent(Prestasi.this, JuaraActivity.class);
        startActivity(intent);
    }
}