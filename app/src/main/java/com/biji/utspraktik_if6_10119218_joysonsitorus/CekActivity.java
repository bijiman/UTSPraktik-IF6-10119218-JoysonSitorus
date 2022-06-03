package com.biji.utspraktik_if6_10119218_joysonsitorus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import com.google.android.material.button.MaterialButton;

public class CekActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek);

        MaterialButton ceklagi = findViewById(R.id.cekhasil);
        ceklagi.setOnClickListener(view -> startActivity(new Intent(this,berhasilActivity.class)));

        ImageButton btnVector = findViewById(R.id.btnvector);
        btnVector.setOnClickListener(view -> startActivity(new Intent(this,MainActivity.class)));
    }
}