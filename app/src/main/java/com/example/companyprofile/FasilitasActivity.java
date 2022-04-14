package com.example.companyprofile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FasilitasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fasilitas);
    }

    public void sarana(View view) {
        Intent intent = new Intent(FasilitasActivity.this, SaranaActivity.class);
        startActivity(intent);
    }

    public void prasarana(View view) {
        Intent intent = new Intent(FasilitasActivity.this, PrasaranaActivity.class);
        startActivity(intent);
    }
}