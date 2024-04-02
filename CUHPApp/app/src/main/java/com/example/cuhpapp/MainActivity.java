package com.example.cuhpapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.cuhpapp.delete.DeleteFiles;
import com.example.cuhpapp.faculty.UpdateFaculty;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView student,admin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        student = findViewById(R.id.student);
        admin=findViewById(R.id.admin);

        student.setOnClickListener(this);
        admin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.student){
            Intent intent = new Intent(MainActivity.this,StudentSide.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.admin){
            Intent intent = new Intent(MainActivity.this,AdminSide.class);
            startActivity(intent);
        }
    }
}