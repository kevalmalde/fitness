package com.keval.finess;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WorkoutDetailFragment flag = (WorkoutDetailFragment) getFragmentManager().findFragmentById(R.id.detail_flag);
        flag.setWorkoutId(2);
    }
}
