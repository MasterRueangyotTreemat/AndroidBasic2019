package com.noomnim.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ColorChange extends Activity {

    TextView color;
    Button red,green,blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_change);

        color = (TextView)findViewById(R.id.color);

        red = (Button) findViewById(R.id.redbutton);
        red.setOnClickListener(onClick);

        green = (Button) findViewById(R.id.greenbutton);
        green.setOnClickListener(onClick);

        blue = (Button) findViewById(R.id.bluebutton);
        blue.setOnClickListener(onClick);
    }

    View.OnClickListener onClick = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            if(v == red)
                color.setBackgroundColor(Color.RED);
            else if(v == green)
                color.setBackgroundColor(Color.GREEN);
            else if(v == blue)
                color.setBackgroundColor(Color.BLUE);
        }
    };
}
