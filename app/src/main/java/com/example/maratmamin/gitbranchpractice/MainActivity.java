package com.example.maratmamin.gitbranchpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Actor> mMoneyback = new ArrayList<Actor>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Actor actor = new Actor("Leo DiCap", "Aug 14", 4);
        mMoneyback.add(actor);



    }
}
