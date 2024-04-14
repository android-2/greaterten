package com.example.greaterten;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText num,snum;
    Button btn;
    TextView txtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        num=(EditText) findViewById(R.id.num);
        snum=(EditText) findViewById(R.id.snum);
        btn=(Button) findViewById(R.id.btn);
        txtresult=(TextView)findViewById(R.id.txtresult);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=Integer.parseInt(num.getText().toString());
                int num2=Integer.parseInt(snum.getText().toString());
                if(num1>10&&num2>10){
                    Toast.makeText(MainActivity.this, "Both number can not be greater than 10", Toast.LENGTH_SHORT).show();
                    num.setText("");
                    snum.setText("");
                    txtresult.setText("");


                }
                String result="Number 1: "+num1+"\n Number 2: "+num2;
                txtresult.setText(result);
            }
        });

    }
}