package com.example.companyprofile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil);
    }

    public void sejarah(View view) {
        Intent intent = new Intent(ProfilActivity.this, SejarahActivity.class);
        startActivity(intent);
    }

    public void identitas(View view) {
        Intent intent = new Intent(ProfilActivity.this, identitas.class);
        startActivity(intent);
    }
    public void visimisi(View view) {
        Intent intent = new Intent(ProfilActivity.this, visimisi.class);
        startActivity(intent);
    }
}