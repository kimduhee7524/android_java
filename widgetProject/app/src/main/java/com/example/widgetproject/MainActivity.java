package com.example.widgetproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView text2;
RadioGroup group;
Button click;
ImageView img;
CheckBox chk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text2 = findViewById(R.id.text2);
        group = findViewById(R.id.group);
        click = findViewById(R.id.click);
        img = findViewById(R.id.img);
        chk = findViewById(R.id.chk);
        chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chk.isChecked()==true){
                    text2.setVisibility(View.VISIBLE);
                    group.setVisibility(View.VISIBLE);
                    click.setVisibility(View.VISIBLE);
                    img.setVisibility(View.VISIBLE);
                }
                else{
                    text2.setVisibility(View.INVISIBLE);
                    group.setVisibility(View.INVISIBLE);
                    click.setVisibility(View.INVISIBLE);
                    img.setVisibility(View.INVISIBLE);
                }
            }
        });
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (group.getCheckedRadioButtonId()){
                    case R.id.rdodog:
                        img.setImageResource(R.drawable.ic_launcher_background);
                        break;
                    case R.id.rdoocat:
                        img.setImageResource(R.drawable.ic_launcher_foreground);
                }
            }
        });

    }
}