package com.example.pbl03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.ui.NavigationUI;

import static androidx.navigation.Navigation.findNavController;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bNavView = findViewById(R.id.bottomNavigationView);
        NavController navController =findNavController(this,R.id.fragment);
        NavigationUI.setupWithNavController(bNavView,navController);
        NavigationUI.setupActionBarWithNavController(this,navController);

    }
}