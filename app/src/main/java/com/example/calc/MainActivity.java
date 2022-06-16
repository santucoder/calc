package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editnum;
    TextView result;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editnum  = (EditText) findViewById(R.id.editTextNumber);
        result = (TextView) findViewById(R.id.textView2);
        result.setVisibility(View.INVISIBLE);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String value= editnum.getText().toString();
                int finalValue=Integer.parseInt(value);
                int r= (int) squar(finalValue);
                result.setText("Square="+r);
            }
        });

    }
    double squar(double x)
    {
        result.setVisibility(View.VISIBLE);
        return x*x;

    }
}
