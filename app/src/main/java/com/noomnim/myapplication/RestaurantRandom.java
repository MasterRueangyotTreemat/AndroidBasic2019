package com.noomnim.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RestaurantRandom extends Activity {

    TextView textView;
    Button button;
    String[] list = {
            "MK Restaurant",
            "KFC",
            "Chesters Grill",
            "Bar-B-Q Plaza",
            "The Pizza Company"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_random);

        textView = (TextView) findViewById(R.id.textView);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText( getRestaurantName());
            }
        });
    }

    public String getRestaurantName() {
        return list[ (int) Math.round( Math.random()*(list.length-1) ) ];    }
}
