package com.example.javalabsuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spSpies = (Spinner) findViewById(R.id.spTotallySpies);
        ImageView imSpies = (ImageView) findViewById(R.id.ivTotallySpiesImages);
        spSpies.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getSelectedItem().equals("Sam")){
                    imSpies.setImageResource(R.drawable.sam);
                }else if(parent.getSelectedItem().equals("Alex")){
                    imSpies.setImageResource(R.drawable.alex);
                }else if(parent.getSelectedItem().equals("Clover")){
                    imSpies.setImageResource(R.drawable.clover);
                }else{
                    imSpies.setImageResource(R.drawable.totallyspies);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}