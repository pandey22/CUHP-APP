package com.example.cuhpapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class StudentSide extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private BottomNavigationView bottomNavigationView;
    private NavController navController;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_side);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        navController = Navigation.findNavController(this,R.id.frame_layout);
        drawerLayout=findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navView);
        toggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.start,R.string.close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        navigationView.setNavigationItemSelectedListener(this);

        NavigationUI.setupWithNavController(bottomNavigationView,navController);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(toggle.onOptionsItemSelected(item))
            return true;
        return true;
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            if(menuItem.getItemId()== R.id.navWeb)
                Toast.makeText(this, "Web View", Toast.LENGTH_SHORT).show();
            else if(menuItem.getItemId()==  R.id.navEvent )
                Toast.makeText(this, "Event", Toast.LENGTH_SHORT).show();
            else if(menuItem.getItemId()== R.id.navHolidays)
                Toast.makeText(this, "Holidays", Toast.LENGTH_SHORT).show();
            else if(menuItem.getItemId()== R.id.navSamarth)
                Toast.makeText(this, "Samarth", Toast.LENGTH_SHORT).show();
            else if(menuItem.getItemId()== R.id.navDev)
                Toast.makeText(this, "Developer", Toast.LENGTH_SHORT).show();
            else if(menuItem.getItemId()== R.id.navEbook)
                Toast.makeText(this, "Ebook", Toast.LENGTH_SHORT).show();
            else if(menuItem.getItemId()== R.id.navShare)
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
        return true;
    }
}