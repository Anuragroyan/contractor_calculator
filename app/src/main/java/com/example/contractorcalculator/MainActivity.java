package com.example.contractorcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText laborcost;
    private EditText materialcost;
    private TextView result;
    private TextView Tax;
    private TextView subtotal;
    private Button total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        laborcost = (EditText) findViewById(R.id.etlcost);
        materialcost = (EditText) findViewById(R.id.etmcost);
        result = (TextView) findViewById(R.id.tvbill);
        Tax = (TextView) findViewById(R.id.tvtax);
        total = (Button) findViewById(R.id.btntotal);

        total.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int lcost = Integer.parseInt(laborcost.getText().toString());
                int mcost = Integer.parseInt(materialcost.getText().toString());
                int res = lcost + mcost;
                result.setText("Result: " + String.valueOf(res));
                double tax = Double.parseDouble(String.format("%.2f", res * 0.5));
                Tax.setText("Tax: "+ Double.toString(tax));
            }
        });
    }
}