package com.example.tubes_a1h;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button btnStartActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.btnStartActivity = findViewById(R.id.btn_start);
        btnStartActivity.setOnClickListener(this);
    }
        @Override
    public void onClick(View view) {
        if(view.getId()==btnStartActivity.getId()){
            Intent intent = new Intent(this, ActivityAppointment.class);
            startActivity(intent);
        }
    }
}