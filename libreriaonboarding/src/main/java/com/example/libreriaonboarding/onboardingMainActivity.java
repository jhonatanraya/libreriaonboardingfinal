package com.example.libreriaonboarding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.libreriaonboarding.Adapters.OnboardingAdapter;

public class onboardingMainActivity extends AppCompatActivity {

    private ViewPager viewPagerContainer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding_main);

        //Inicializando componentes
        _inicializeComponents();
        //Inicicializando adaptador
        _initializeFragmentAdapter();
    }
    public void _inicializeComponents(){
        viewPagerContainer = findViewById(R.id.viewPagerContainer);
    }

    public void _initializeFragmentAdapter(){
        OnboardingAdapter adapter = new OnboardingAdapter(getSupportFragmentManager());
        viewPagerContainer.setAdapter(adapter);
    }

}


