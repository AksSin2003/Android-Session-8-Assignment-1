package com.example.akshit.hideandshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class hideShow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hide_show);
        final TextView txtImage = (TextView) findViewById(R.id.text);
        final Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String ButtonText=btn.getText().toString();
                if (ButtonText=="Hide")
                {
                    txtImage.setVisibility(View.GONE);
                    btn.setText("Show");
                    Log.d("Message","You hid Your Image!");
                }
                else
                {
                    txtImage.setVisibility(View.VISIBLE);
                    btn.setText("Hide");
                }

            }
        });

            }



            }

