package com.android.example.cis.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView displayText;
    String displayValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayText = (TextView) findViewById(R.id.displayText);


    }

    public void print1(View view) {
        if (null == displayValue) {
            displayValue = "1";
        } else {
            displayValue +="1";

        }

        displayText.setText(displayValue);
    }

    public void print2(View view) {
        if (null == displayValue) {
            displayValue = "2";
        } else {
            displayValue +="2";

        }
        displayText.setText(displayValue);
    }

    public void print3(View view) {
        if (null == displayValue) {
            displayValue = "3";
        } else {
            displayValue +="3";

        }
        displayText.setText(displayValue);
    }

    public void print4(View view) {
        if (null == displayValue) {
            displayValue = "4";
        } else {
            displayValue +="4";

        }
        displayText.setText(displayValue);
    }

    public void print5(View view) {
        if (null == displayValue) {
            displayValue = "5";
        } else {
            displayValue +="5";

        }
        displayText.setText(displayValue);
    }

    public void print6(View view) {
        if (null == displayValue) {
            displayValue = "6";
        } else {
            displayValue +="6";

        }
        displayText.setText(displayValue);
    }

    public void print7(View view) {
        if (null == displayValue) {
            displayValue = "7";
        } else {
            displayValue +="7";

        }
        displayText.setText(displayValue);
    }

    public void print8(View view) {
        if (null == displayValue) {
            displayValue = "8";
        } else {
            displayValue +="8";

        }
        displayText.setText(displayValue);
    }

    public void print9(View view) {
        if (null == displayValue) {
            displayValue = "9";
        } else {
            displayValue +="9";

        }
        displayText.setText(displayValue);
    }

    public void print0(View view) {
        if (null == displayValue) {
            displayValue = "0";
        } else {
            displayValue +="0";

        }
        displayText.setText(displayValue);
    }
    public void clearDisplay(View view){

        displayText.setText("0");
        displayValue = null;


    }

}
