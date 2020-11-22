package com.example.conversionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {
    //declaring  of Widgets
    EditText Number;
    TextView textView,textView2,textView3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Instantiating  Widgets
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);


        Number = findViewById(R.id.Number);

        button = findViewById(R.id.button);
        // Adding
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Calling ConvertFrom KiloToPound Method
                ConvertFromKiloToPound();
            }
        });



    }

    private void ConvertFromKiloToPound() {
        // This mMethod will Convert the Values entered in number.
        // From kilo to pounds

        String ValueEnteredInKILO = Number.getText().toString();

        // converting string to number
        double Kilo =  Double.parseDouble(ValueEnteredInKILO);
       //convetinh Kilo to pounds formula
        double pounds = Kilo* 2.205;

        //displaying the value resulted in textView
        textView3.setText("" +pounds);


    }
}