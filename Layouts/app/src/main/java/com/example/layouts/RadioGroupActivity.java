package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioGroupActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);

        radioGroup =(RadioGroup)findViewById(R.id.radioGroup);

        btnDisplay=(Button)findViewById(R.id.button);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId= radioGroup.getCheckedRadioButtonId();
                radioButton =(RadioButton)findViewById(selectedId);
                Toast.makeText(RadioGroupActivity.this, radioButton.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}