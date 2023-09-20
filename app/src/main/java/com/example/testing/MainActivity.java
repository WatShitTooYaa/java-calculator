package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText input1, input2;
    private Button addButton, decButton, timeButton, divButton;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();

    }

    public void addListenerOnButton(){
        input1 = (EditText) findViewById(R.id.input_num1);
        input2 = (EditText) findViewById(R.id.input_num2);
        addButton = (Button) findViewById(R.id.but_add);
        decButton = (Button) findViewById(R.id.but_min);
        timeButton = (Button) findViewById(R.id.but_times);
        divButton = (Button) findViewById(R.id.but_divide);
        hasil = (TextView) findViewById(R.id.result);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = input1.getText().toString();
                String value2 = input2.getText().toString();

                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);

                int sum = a+b;
                hasil.setText("Hasil: " + String.valueOf(sum));
//                Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });

        decButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = input1.getText().toString();
                String value2 = input2.getText().toString();

                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);
                int dec = a-b;

                hasil.setText("Hasil: " + String.valueOf(dec));
//                Toast.makeText(getApplicationContext(), String.valueOf(dec), Toast.LENGTH_LONG).show();
            }
        });

        timeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = input1.getText().toString();
                String value2 = input2.getText().toString();

                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);
                int time = a*b;

                hasil.setText("Hasil: " + String.valueOf(time));
//                Toast.makeText(getApplicationContext(), String.valueOf(time), Toast.LENGTH_LONG).show();
            }
        });

        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = input1.getText().toString();
                String value2 = input2.getText().toString();

                float a = Integer.parseInt(value1);
                float b = Integer.parseInt(value2);
                float div = a/b;

                hasil.setText("Hasil: " + String.valueOf(div));
//                Toast.makeText(getApplicationContext(), String.valueOf(div), Toast.LENGTH_LONG).show();
            }
        });
    }
    public void tambah(View view) {
        input1 = (EditText) findViewById(R.id.input_num1);
        input2 = (EditText) findViewById(R.id.input_num2);
        addButton = (Button) findViewById(R.id.but_add);

        String value1 = input1.getText().toString();
        String value2 = input2.getText().toString();

        int a = Integer.valueOf(value1);
        int b = Integer.valueOf(value2);
        int sum = a+b;

        Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();
    }
}
