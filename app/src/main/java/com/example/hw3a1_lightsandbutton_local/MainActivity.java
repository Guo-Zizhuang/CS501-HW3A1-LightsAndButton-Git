package com.example.hw3a1_lightsandbutton_local;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private TextView textView_one, textView_three, textView_two;
    private Button button_one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_one = findViewById(R.id.button_one);
        button_one.setOnClickListener(this);
        textView_one = (TextView) findViewById(R.id.textView_one);
        textView_three = (TextView) findViewById(R.id.textView_three);
        textView_two = (TextView) findViewById(R.id.textView_two);



    }


    @Override
    public void onClick(View view) {
        ColorDrawable color_one = (ColorDrawable) textView_one.getBackground();
        Integer color_One = color_one.getColor();
        ColorDrawable color_two = (ColorDrawable) textView_two.getBackground();
        Integer color_Two = color_two.getColor();
        ColorDrawable color_three = (ColorDrawable) textView_three.getBackground();
        Integer color_Three = color_three.getColor();





        if (color_One == -65536) {
            textView_one.setBackgroundColor(-6250336);
            textView_two.setBackgroundColor(-256);
            textView_three.setBackgroundColor(-6250336);
        }else if(color_Two == -256){
            textView_one.setBackgroundColor(-6250336);
            textView_two.setBackgroundColor(-6250336);
            textView_three.setBackgroundColor(-16711936);
        }else if(color_Three == -16711936){
            textView_one.setBackgroundColor(-65536);
            textView_two.setBackgroundColor(-6250336);
            textView_three.setBackgroundColor(-6250336);
        }

    }
}