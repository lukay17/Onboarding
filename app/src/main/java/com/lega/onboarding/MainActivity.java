package com.lega.onboarding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private AppCompatButton accessBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();

        listener();
    }

    private void bindViews(){
        accessBtn = findViewById(R.id.CV_card_boton);
    }

    private void listener() {
        accessBtn.setOnClickListener(view -> {
            Toast.makeText(MainActivity.this, "Acceso Concedido", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, HomeActivity.class));
        });
    }
}