package com.example.dakin.volunteer2;

import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class searchresults extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchresults);

        // create the layout params that will be used to define how your
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);

        ArrayList<String> charities = new ArrayList<String>();
        ArrayList<String> job_descriptions = new ArrayList<String>();

        //Create four
        for (int j = 0; j < charities.size(); j++) {
            // Create LinearLayout
            LinearLayout ll = new LinearLayout(this);
            ll.setOrientation(LinearLayout.HORIZONTAL);

            // Create TextView
            TextView charityname = new TextView(this);
            charityname.setText(charities.get(j));
            ll.addView(charityname);

            // Create TextView
            TextView jobdesc = new TextView(this);
            jobdesc.setText(job_descriptions.get(j));
            ll.addView(jobdesc);


        }
    }
}