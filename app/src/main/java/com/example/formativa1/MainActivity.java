package com.example.formativa1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    FrameLayout inicio;
    BottomNavigationView btn_nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicioFragment ini = new inicioFragment();
        spinFragment spinn = new spinFragment();
        loadFragment(ini);
        inicio =findViewById(R.id.inicio);
        btn_nav = findViewById(R.id.btn_nav);

        btn_nav.setOnItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.inicio_nav){
                    loadFragment(ini);
                    return true;
                } else if (item.getItemId() == R.id.spin_nav) {
                    loadFragment(spinn);
                    return true;
                }
                return false;
            }
        });
    }
    public void loadFragment(Fragment fr){
        FragmentTransaction tr = getSupportFragmentManager().beginTransaction();
        tr.replace(R.id.inicio, fr);
        tr.commit();
    }
    }