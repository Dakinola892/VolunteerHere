package com.example.dakin.volunteer2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static Button button_tosearch;
    private static Button button_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button_tosearch = (Button) findViewById(R.id.button_volunteer);
        button_tosearch.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent vol_search = new Intent(v.getContext(), charitycatergories.class);
                        v.getContext().startActivity(vol_search);
                    }


                }
        );

        button_two = (Button) findViewById(R.id.button_charity);
        button_two.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent vol_search1 = new Intent(v.getContext(), charityform.class);
                        v.getContext().startActivity(vol_search1);
                    }


                }
        );
    }
}