package com.bill.house_finder;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button LOGIN, CANCEL;
    EditText Username, Password;
    TextView Attempts;
    int counter = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LOGIN = (Button) findViewById(R.id.loginbtn);
        CANCEL = (Button) findViewById(R.id.cancelbtn);
        Username = (EditText) findViewById(R.id.inputusrname);
        Password = (EditText) findViewById(R.id.inputpass);
        Attempts = (TextView) findViewById(R.id.numofattempts);
        Attempts.setVisibility(View.GONE);

        LOGIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Username.getText().toString().equals("bill") && Password.getText().toString().equals("pass")){
                    Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_LONG).show();
            }         else {
                        Toast.makeText(getApplicationContext(), "Incorrect username and Password..", Toast.LENGTH_LONG).show();
                    Attempts.setVisibility(View.VISIBLE);
                   Attempts.setBackgroundColor(Color.RED);
                    counter--;
                    Attempts.setText(Integer.toString(counter));
                    if (counter==0){
                        LOGIN.setEnabled(false);
                    }
            }


    }
});};}
