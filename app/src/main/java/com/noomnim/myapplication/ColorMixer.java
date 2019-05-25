package com.noomnim.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class ColorMixer extends Activity {

    TextView color;
    SeekBar red,green,blue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_color_mixer );

        color = (TextView) findViewById( R.id.color );
        red = (SeekBar) findViewById( R.id.red );
        red.setOnSeekBarChangeListener( onSlide );

        green = (SeekBar) findViewById( R.id.green );
        green.setOnSeekBarChangeListener( onSlide );

        blue = (SeekBar) findViewById( R.id.blue );
        blue.setOnSeekBarChangeListener( onSlide );
    }

    SeekBar.OnSeekBarChangeListener onSlide = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            color.setBackgroundColor( Color.rgb(
                    red.getProgress(),
                    green.getProgress(),
                    blue.getProgress()) );
        }
    };
}
