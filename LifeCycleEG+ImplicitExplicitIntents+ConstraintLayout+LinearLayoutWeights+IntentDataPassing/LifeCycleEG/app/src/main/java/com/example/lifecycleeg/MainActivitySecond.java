package com.example.lifecycleeg;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.*;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivitySecond extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_second);
        getData();
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

    @Override
    protected void onRestoreInstanceState(@Nullable Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e("LIFECYCLE:", "Activity2 onRestoreInstanceState is called");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e("LIFECYCLE:", "Activity2 onSaveInstanceState is called");
    }

    private void getData(){
        Intent intent = getIntent();
        if(intent != null) {
            Integer key = intent.getIntExtra("key",0);
            TextView tv = findViewById(R.id.textView3);
            tv.setText(key.toString());
        }
    }
}