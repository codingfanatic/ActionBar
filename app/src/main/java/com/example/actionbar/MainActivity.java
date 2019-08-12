package com.example.actionbar;

import android.os.Bundle;
import android.support.v7.app.ActionBar; //Import the ActionBar class to use the getSupportActionBar() method
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //These methods allow for setting a custom ActionBar and setting the view using a custom layout
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM); 
        getSupportActionBar().setCustomView(R.layout.custom_action_bar);
    }
}
