package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    //DECLARE  OBJECTS TO INTERFACE WITH LAYOUT COMPONENTS
    private TextView greetingTextView;

    //INDICATES HELLO IS CURRENTLY DISPLAYED
    private boolean isHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //TASK 1: INFLATE THE MAIN SCREEN LAYOUT USED BY THE APP
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TASK 2: ESTABLISH REFERENCES TO THE TEXTVIEW AND BUTTON
        Button exclaimBtn = (Button) findViewById(R.id.button);
        greetingTextView = (TextView) findViewById(R.id.textView);

        //TASK 3: INITIALIZE GREETINGS
        initializeGreeting();

        //TASK 4: REGISTER THE LISTENER EVENT FOR THE BUTTON
        exclaimBtn.setOnClickListener(toggleGreeting);
    }

    private final View.OnClickListener toggleGreeting =
            new View.OnClickListener() {

                public void onClick(View btn) {
                    //TASK: CONSTRUCT THE TOGGLE GREETING
                    if (isHello) {
                        isHello = false;
                        greetingTextView.setText(R.string.goodbye);
                    } else {
                        isHello = true;
                        greetingTextView.setText(R.string.hello);
                    }
                }
            };

    private void initializeGreeting() {
        isHello = true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu;
        // this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}