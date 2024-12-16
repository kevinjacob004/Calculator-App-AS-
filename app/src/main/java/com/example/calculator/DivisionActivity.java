package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DivisionActivity extends AppCompatActivity {

    Button b1,b2;
    EditText e1,e2;

    String getNum1,getNum2,result;
    int num1,num2,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_division);

        e1=(EditText) findViewById(R.id.dn1);
        e2=(EditText) findViewById(R.id.dn2);

        b1=(Button) findViewById(R.id.divb);
        b2=(Button) findViewById(R.id.go4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getNum1=e1.getText().toString();
                getNum2=e2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                div=num1/num2;
                result=String.valueOf(div);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ob2=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob2);
            }
        });


    }
}