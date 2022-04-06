package com.example.companyprofile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class EkskulActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ekskul);
    }
    public void osis(View view) {
        Intent intent = new Intent(EkskulActivity.this, osis.class);
        startActivity(intent);
    }
}