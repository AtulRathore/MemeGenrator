package com.example.atul.fragment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Top_Section_Fragment.TopSectionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This gets called by top fragment when the user clicks the button
    @Override
    public void createMeme(String top, String bottom) {
        Bottom_Fragment bottom_fragment = (Bottom_Fragment) getSupportFragmentManager().findFragmentById(R.id.fragment6);
        bottom_fragment.setMemeText(top,bottom);
    }
}
