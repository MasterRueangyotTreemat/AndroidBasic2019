package com.noomnim.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditTextDemo extends Activity {

    TextView textView;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_edit_text_demo );

        textView = (TextView) findViewById( R.id.textView );
        editText = (EditText) findViewById( R.id.editText );
        button = (Button) findViewById( R.id.button );

        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText( editText.getText() );
            }
        } );

    }
}
