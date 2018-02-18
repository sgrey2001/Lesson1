package com.itea.grey.lesson1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button aButton = (Button)findViewById(R.id.aButton);
        Button bButton = (Button)findViewById(R.id.bButton);
        final String[] two_string = getResources().getStringArray(R.array.two_string);

        aButton.setText(two_string[0]);
        bButton.setText(two_string[1]);

        aButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(aButton.getText().equals(two_string[0]))){
                    aButton.setText(two_string[0]);
                } else{
                    aButton.setText(two_string[1]);
                }
            }
        });

        bButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aButton.setText(two_string[new Random().nextInt(2)]);
            }
        });

    }
}