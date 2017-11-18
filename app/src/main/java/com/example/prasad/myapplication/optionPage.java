package com.example.prasad.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class optionPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_page);
        Intent intent = getIntent();
        //String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
       // TextView textView = (TextView) findViewById(R.id.textView);
        //textView.setText("Hey Messi!!");
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                suggest();
            }
        });

        Button restaurent_button = (Button) findViewById(R.id.button2);
        restaurent_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                restaurentOption();
            }
        });
        Button location_button = (Button) findViewById(R.id.button3);
        location_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                locationView();
            }
        });

    }

    protected void suggest(){
        Intent intent = new Intent(this, StoreActivity.class);
        startActivity(intent);
    }

    protected void restaurentOption(){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    protected void locationView(){
        Intent intent1 = new Intent(optionPage.this, LocationAcivity.class);
        startActivity(intent1);
    }

}
