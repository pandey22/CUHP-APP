package com.example.cuhpapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.cuhpapp.delete.DeleteFiles;
import com.example.cuhpapp.faculty.UpdateFaculty;

public class AdminSide extends AppCompatActivity implements View.OnClickListener {

    CardView uploadNotice,addGalleryImage,addEbook,faculty,deleteFiles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_side);

        uploadNotice = findViewById(R.id.addNotice);
        addGalleryImage=findViewById(R.id.addGalleryImage);
        faculty=findViewById(R.id.faculty);
        addEbook=findViewById(R.id.addEbook);
        deleteFiles=findViewById(R.id.deleteFiles);

        uploadNotice.setOnClickListener(this);
        addGalleryImage.setOnClickListener(this);
        addEbook.setOnClickListener(this);
        faculty.setOnClickListener(this);
        deleteFiles.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.addNotice){
            Intent intent = new Intent(AdminSide.this,UploadNotice.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.addGalleryImage){
            Intent intent = new Intent(AdminSide.this,UploadImage.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.addEbook){
            Intent intent = new Intent(AdminSide.this,UploadPdf.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.faculty){
            Intent intent = new Intent(AdminSide.this, UpdateFaculty.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.deleteFiles){
            Intent intent = new Intent(AdminSide.this, DeleteFiles.class);
            startActivity(intent);
        }
    }
}