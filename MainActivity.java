package com.example.wallpaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;

import com.ramotion.paperonboarding.PaperOnboardingFragment;
import com.ramotion.paperonboarding.PaperOnboardingPage;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        final PaperOnboardingFragment paperOnboardingFragment = PaperOnboardingFragment.newInstance(getData());
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment, paperOnboardingFragment);
        fragmentTransaction.commit();
    }

    private ArrayList<PaperOnboardingPage> getData(){

        PaperOnboardingPage src = new PaperOnboardingPage("Pizza",
                "Cheese, meat, tomato, chili paper, ketchup, mushrooms ", Color.parseColor("#FFA76413"), R.drawable.pizza, R.drawable.pizza);
        PaperOnboardingPage src1 = new PaperOnboardingPage("Burger",
                "Chicken meat, garlic sauce, tomato, green, cheese, onion", Color.parseColor("#FFD6BB0A"), R.drawable.burger, R.drawable.burger);
        PaperOnboardingPage src2 = new PaperOnboardingPage("Sandwich",
                "Meat, cheese, bread, green, sauce", Color.parseColor("#FFD56012"), R.drawable.sandwich, R.drawable.sandwich);

        ArrayList<PaperOnboardingPage> elements = new ArrayList<>();

        elements.add(src);
        elements.add(src1);
        elements.add(src2);
        return elements;

    }

}