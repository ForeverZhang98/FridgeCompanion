package com.fridgecompanion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button button = findViewById(R.id.ButtonFridge);

    }

    public void onClickFridgeButton(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}