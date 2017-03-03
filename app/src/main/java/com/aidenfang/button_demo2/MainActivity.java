package com.aidenfang.button_demo2;
//tested by YF and worked like a charm!
//03/02/2017

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button myBtn = new Button(this);
        myBtn.setText("Button added by code");

        LinearLayout ll = (LinearLayout)findViewById(R.id.buttonLayout);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        ll.addView(myBtn, lp);

        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // start
                Toast.makeText(MainActivity.this, "You clicked me", Toast.LENGTH_SHORT).show();

                for (int i = 0; i < 5; i++) {
                    Button myButton = new Button(MainActivity.this);
                    myButton.setText("Button: " + i);
                    myButton.setId(i);
                    myButton.setBackgroundColor(Color.rgb(255-i * 20, 80, 90));

                    final int id_ = myButton.getId();

                    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.WRAP_CONTENT);

                    LinearLayout layout = (LinearLayout) findViewById(R.id.buttonLayout2);
                    layout.addView(myButton, params);

                    myButton.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            Toast.makeText(MainActivity.this, "Button clicked index = " + id_, Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                // end


            }
        });

    }



}
