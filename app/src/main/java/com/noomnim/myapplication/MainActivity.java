package com.noomnim.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button colorChangeBtn,colorMixerBtn,editTextDemoBtn,restaurantRandomBtn,seekBarBtn,textButtonChangeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colorChangeBtn = (Button) findViewById( R.id.colorChageBtn );
        colorChangeBtn.setOnClickListener( onClick );

        colorMixerBtn = (Button) findViewById( R.id.colorMixerBtn );
        colorMixerBtn.setOnClickListener( onClick );

        editTextDemoBtn = (Button) findViewById( R.id.editTextDemoBtn );
        editTextDemoBtn.setOnClickListener( onClick );

        restaurantRandomBtn = (Button) findViewById( R.id.restaurantRandomBtn );
        restaurantRandomBtn.setOnClickListener( onClick );

        seekBarBtn = (Button) findViewById( R.id.seekBarBtn );
        seekBarBtn.setOnClickListener( onClick );

        textButtonChangeBtn = (Button) findViewById( R.id.textButtonChangeBtn );
        textButtonChangeBtn.setOnClickListener( onClick );

    }
    View.OnClickListener onClick = new View.OnClickListener() {
        Intent intent;
        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.colorChageBtn:
                    intent = new Intent( MainActivity.this, ColorChange.class );
                    break;
                case R.id.colorMixerBtn:
                    intent = new Intent( MainActivity.this, ColorMixer.class );
                    break;
                case R.id.editTextDemoBtn:
                    intent = new Intent( MainActivity.this,EditTextDemo.class );
                    break;
                case R.id.restaurantRandomBtn:
                    intent = new Intent( MainActivity.this, RestaurantRandom.class );
                    break;
                case R.id.seekBarBtn:
                    intent = new Intent( MainActivity.this, SeekBarDemo.class );
                    break;
                case R.id.textButtonChangeBtn:
                    intent = new Intent( MainActivity.this, TextButtonChange.class );
                    break;

            }
            startActivity( intent );
        }
    };

}
