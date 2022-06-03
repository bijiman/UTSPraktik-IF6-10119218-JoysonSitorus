package com.biji.utspraktik_if6_10119218_joysonsitorus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class berhasilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berhasil);

        MaterialButton oke = findViewById(R.id.oke);
        oke.setOnClickListener(view -> finish());
    }
}