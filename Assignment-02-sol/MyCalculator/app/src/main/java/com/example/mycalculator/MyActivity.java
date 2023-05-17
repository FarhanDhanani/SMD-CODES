package com.example.mycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MyActivity extends Activity {

    private TextView mNumberDisplay;
    private SimpleExpression mExpression;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        mNumberDisplay = (TextView) findViewById(R.id.textView1);

        mExpression = new SimpleExpression();
    }

    public void goAC(View view) {
        mExpression.clearOperands();
        mNumberDisplay.setText("0");
    }

    public void goOperand(View view) {
        String val = (String) mNumberDisplay.getText();
        String digit = (String) view.getContentDescription();
        if (val.charAt(0) == '0')
            mNumberDisplay.setText(digit);
        else
            mNumberDisplay.setText((String) mNumberDisplay.getText()
                    + digit.charAt(0));
    }

    public void goOperator(View view) {
        String operator = (String) view.getContentDescription();
        try {
            String val = (String) mNumberDisplay.getText();
            mExpression.setOperand1((int) Integer.parseInt(val.toString()));
        } catch (NumberFormatException e) {
            mExpression.setOperand1(0);
        }
        mNumberDisplay.setText("0");
        mExpression.setOperator(operator);
    }


    //WHEN THE = BUTTON IS CLICKED, COMPUTE AND DISPLAY THE VALUE
    public void goCompute(View view) {
        try {
            String val = (String) mNumberDisplay.getText();
            mExpression.setOperand2((int) Integer.parseInt(val.toString()));
        } catch (NumberFormatException e) {
            mExpression.setOperand2(0);
        }
        mNumberDisplay.setText(mExpression.getValue().toString());
    }
}


