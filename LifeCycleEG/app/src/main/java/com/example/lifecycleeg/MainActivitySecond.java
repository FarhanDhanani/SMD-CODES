package com.example.lifecycleeg;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class MainActivitySecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_second);

        Log.e("LIFECYCLE:", "Activity2 onCreate is called");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.e("LIFECYCLE:", "Activity2 OnStart is called");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.e("LIFECYCLE:", "Activity2 onResume is called");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.e("LIFECYCLE:", "Activity2 onPause is called");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.e("LIFECYCLE:", "Activity2 onStop is called");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.e("LIFECYCLE:", "Activity2 onRestart is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("LIFECYCLE:", "Activity2 onDestroy is called");
    }

//    @Override
//    protected void onRestoreInstanceState(@Nullable Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//        Log.e("LIFECYCLE:", "Activity2 onRestoreInstanceState is called");
//    }
//
//    @Override
//    protected void onSaveInstanceState(@NonNull Bundle outState) {
//        super.onSaveInstanceState(outState);
//        Log.e("LIFECYCLE:", "Activity2 onSaveInstanceState is called");
//    }
}