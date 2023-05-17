package com.example.recyclervieweg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyListData[] myListData = new MyListData[] {
                new MyListData("Email", android.R.drawable.ic_dialog_email,"usama"),
                new MyListData("Info", android.R.drawable.ic_dialog_info,"usama"),
                new MyListData("Delete", android.R.drawable.ic_delete,"usama"),
                new MyListData("Dialer", android.R.drawable.ic_dialog_dialer,"usama"),
                new MyListData("Alert", android.R.drawable.ic_dialog_alert,"usama"),
                new MyListData("Map", android.R.drawable.ic_dialog_map,"usama"),
                new MyListData("Email", android.R.drawable.ic_dialog_email,"usama"),
                new MyListData("Info", android.R.drawable.ic_dialog_info,"usama"),
                new MyListData("Delete", android.R.drawable.ic_delete,"usama"),
                new MyListData("Dialer", android.R.drawable.ic_dialog_dialer,"usama"),
                new MyListData("Alert", android.R.drawable.ic_dialog_alert,"usama"),
                new MyListData("Map", android.R.drawable.ic_dialog_map,"usama"),
                new MyListData("Info", android.R.drawable.ic_dialog_info,"usama"),
                new MyListData("Delete", android.R.drawable.ic_delete,"usama"),
                new MyListData("Dialer", android.R.drawable.ic_dialog_dialer,"usama"),
                new MyListData("Alert", android.R.drawable.ic_dialog_alert,"usama"),
                new MyListData("Map", android.R.drawable.ic_dialog_map,"usama")
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}