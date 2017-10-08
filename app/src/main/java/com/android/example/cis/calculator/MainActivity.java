package com.android.example.cis.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    TextView displayText;
    String displayValue;
    int memory = 0;
    int newValue = 0;
    String ops;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayText = (TextView) findViewById(R.id.displayText);


    }

    public void print1(View view) {
        if (null == displayValue) {
            displayValue = "1";
            newValue = 1;
            calMtd();
        } else {
            displayValue += "1";
            newValue = 1;
            calMtd();
        }

        displayText.setText(displayValue);
    }

    public void print2(View view) {
        if (null == displayValue) {
            displayValue = "2";
            newValue = 2;
            calMtd();
        } else {
            displayValue += "2";
            newValue = 2;
            calMtd();

        }
        displayText.setText(displayValue);
    }

    public void print3(View view) {
        if (null == displayValue) {
            displayValue = "3";
            newValue = 3;
            calMtd();
        } else {
            displayValue += "3";
            newValue = 3;
            calMtd();

        }
        displayText.setText(displayValue);
    }

    public void print4(View view) {
        if (null == displayValue) {
            displayValue = "4";
            newValue = 4;
            calMtd();
        } else {
            displayValue += "4";
            newValue = 4;
            calMtd();

        }
        displayText.setText(displayValue);
    }

    public void print5(View view) {
        if (null == displayValue) {
            displayValue = "5";
            newValue = 5;
            calMtd();
        } else {
            displayValue += "5";
            newValue = 5;
            calMtd();

        }
        displayText.setText(displayValue);
    }

    public void print6(View view) {
        if (null == displayValue) {
            displayValue = "6";
            newValue = 6;
            calMtd();
        } else {
            displayValue += "6";
            newValue = 6;
            calMtd();

        }
        displayText.setText(displayValue);
    }

    public void print7(View view) {
        if (null == displayValue) {
            displayValue = "7";
            newValue = 7;
            calMtd();
        } else {
            displayValue += "7";
            newValue = 7;
            calMtd();

        }
        displayText.setText(displayValue);
    }

    public void print8(View view) {
        if (null == displayValue) {
            displayValue = "8";
            newValue = 8;
            calMtd();
        } else {
            displayValue += "8";
            newValue = 8;
            calMtd();

        }
        displayText.setText(displayValue);
    }

    public void print9(View view) {
        if (null == displayValue) {
            displayValue = "9";
            newValue = 9;
            calMtd();
        } else {
            displayValue += "9";
            newValue = 9;
            calMtd();

        }
        displayText.setText(displayValue);
    }

    public void print0(View view) {
        if (null == displayValue) {
            displayValue = "0";
            newValue = 0;
            calMtd();
        } else {
            displayValue += "0";
            newValue = 0;
            calMtd();

        }
        displayText.setText(displayValue);
    }

    public void addMtd(View view) {
        ops = "+";
    }

    public void subMtd(View view) {
        ops = "-";
    }

    public void floatMtd(View view) {
        ops = "float";
        displayValue += ".";
        displayText.setText(displayValue);
    }


    public void clearDisplay(View view) {
        displayText.setText("0");
        displayValue = null;
        memory = 0;
        newValue = 0;
    }

    public void rstMtd(View view) {
        calMtd();


    }

    public void calMtd() {

        if (ops == null) {
            memory = newValue;
            displayValue = memory + "";
            displayText.setText(displayValue);

        }

        if (ops == "float") {


        }
        if (ops == "+") {
            memory += newValue;
            displayValue = memory + "";
            displayText.setText(displayValue);

        }
        if (ops == "-") {
            memory -= newValue;
            displayValue = memory + "";
            displayText.setText(displayValue);

        }

    }

}
