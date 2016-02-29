package com.example.maratmamin.gitbranchpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Actor actorLeo = new Actor("Leonardo DiCaprio", "August 23 1978", 1);
        Actor actorJen = new Actor("Jennifer Lawrence", "January 12 1990", 1);
        Actor actorMatt = new Actor("Matt Damon", "September 19 1973", 1);

        ArrayList<Actor> actorsArray = new ArrayList<Actor>{
            actorsArray.add(actorLeo);
            actorsArray.add(actorJen);
            actorsArray.add(actorMatt);
        }
    }
}
