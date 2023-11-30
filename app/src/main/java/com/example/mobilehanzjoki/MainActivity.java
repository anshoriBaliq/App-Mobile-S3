package com.example.mobilehanzjoki;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.view.MenuItem;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.example.mobilehanzjoki.Jasa.JokiRankActivity;
import com.example.mobilehanzjoki.databinding.ActivityMainBinding;
import com.example.mobilehanzjoki.fragment.HomeFragment;
import com.example.mobilehanzjoki.fragment.OrderFragment;
import com.example.mobilehanzjoki.fragment.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    private BottomNavigationView bottomNavigationView;
    private FrameLayout frameLayout;
    private ImageView imageButton,imageButton2, imageButton3, imageButton4, imageButton5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationBar);
        frameLayout = findViewById(R.id.frame_layout);
        imageButton = findViewById(R.id.imageButton);

        imageButton.setOnClickListener(v->{
            startActivity(new Intent(getApplicationContext(), JokiRankActivity.class));
        });

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if(itemId == R.id.home){
                    replaceFragment(new HomeFragment());
                } else if (itemId == R.id.order) {
                    replaceFragment(new OrderFragment());
                }else if(itemId == R.id.profile){
                    replaceFragment(new ProfileFragment());
                }

                return true;
            }
        });
        replaceFragment(new HomeFragment());
    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
}