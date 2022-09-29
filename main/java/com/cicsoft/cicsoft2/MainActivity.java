package com.cicsoft.cicsoft2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity<button_1> extends AppCompatActivity {
    TextView inp;
    TextView out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bttn1 = findViewById(R.id.button1);
        Button bttn2 = findViewById(R.id.button2);
        Button bttn3 = findViewById(R.id.button3);
        Button bttn4 = findViewById(R.id.button4);
        Button bttn5 = findViewById(R.id.button5);
        Button bttn6 = findViewById(R.id.button6);
        Button bttn7 = findViewById(R.id.button7);
        Button bttn8 = findViewById(R.id.button8);
        Button bttn9 = findViewById(R.id.button9);
        Button bttn0 = findViewById(R.id.button0);
        Button del = findViewById(R.id.delete);
        int width = this.getResources().getDisplayMetrics().widthPixels;
        bttn1.setHeight(width/3);
        bttn2.setHeight(width/3);
        bttn3.setHeight(width/3);
        bttn4.setHeight(width/3);
        bttn5.setHeight(width/3);
        bttn6.setHeight(width/3);
        bttn7.setHeight(width/3);
        bttn8.setHeight(width/3);
        bttn9.setHeight(width/3);
        bttn0.setHeight(width/3);
        inp = findViewById(R.id.usdDisplay);
        out = findViewById(R.id.dogeDisplay);
        inp.setText("");

        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add(1);
            }
        });
        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add(2);
            }
        });
        bttn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add(3);
            }
        });
        bttn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add(4);
            }
        });
        bttn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add(5);
            }
        });
        bttn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add(7);
            }
        });
        bttn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add(8);
            }
        });
        bttn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add(7);
            }
        });
        bttn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add(9);
            }
        });
        bttn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add(0);
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                del();
            }
        });
    }
    private void add(int i){
        inp.setText(inp.getText().toString()+String.valueOf(i));
        convert();
    }
    private void del(){
        if (inp.getText().toString().length()==1){
            inp.setText("0");
            convert();
        }
        else {
            inp.setText(inp.getText().toString().substring(0,inp.getText().toString().length()-1));
            convert();
        }
    }
    private void convert(){ // type in the exchange value here
        Double temp =8.18*Double.valueOf(inp.getText().toString());
        out.setText(String.valueOf(temp));
    }
}
