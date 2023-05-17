package com.example.lifecycleeg;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("LIFECYCLE:", "Activity1 onCreate is called");

        setContentView(R.layout.activity_main);

        initializeMessages();

    }

    private void initializeMessages(){
        button1 = (Button) findViewById(R.id.button1);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.e("LIFECYCLE:", "Activity1 OnStart is called");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.e("LIFECYCLE:", "Activity1 onResume is called");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.e("LIFECYCLE:", "Activity1 onPause is called");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.e("LIFECYCLE:", "Activity1 onStop is called");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.e("LIFECYCLE:", "Activity1 onRestart is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("LIFECYCLE:", "Activity1 onDestroy is called");
    }

    public void goToAnActivity(View v){
        exampleOfExplicitIntent();
    }

    private void exampleOfExplicitIntent(){
        Intent myIntent = new Intent(MainActivity.this, MainActivitySecond.class);
        addData(myIntent);
        startActivity(myIntent);
    }

    private void exampleOfImplicitIntent(){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https:/www.google.com"));
        startActivity(intent);
    }

    private void addData(Intent myIntent){
        myIntent.putExtra("key", 5); //Optional parameters
    }


    @Override
    protected void onRestoreInstanceState(@Nullable Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e("LIFECYCLE:", "Activity1 onRestoreInstanceState is called");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e("LIFECYCLE:", "Activity1 onSaveInstanceState is called");
    }
}