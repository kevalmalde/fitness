package com.keval.finess;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity implements WorkoutListFragment.WorkoutListListener extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void itemClicked(long id) {
        WorkoutDetailFragment flag = (WorkoutDetailFragment) getFragmentManager().findFragmentById(R.id.detail_flag);
        flag.setWorkoutId(2);
    }
}
