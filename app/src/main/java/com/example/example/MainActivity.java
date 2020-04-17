package com.example.example;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //khai báo biến
    TextView tvKetQua;
    Button btnTong, btnXoaTrang;
    EditText edANumber, edBNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        //ánh xạ
        setControl();

        //code
        setEvent();
    }
    private void setControl(){
        tvKetQua = findViewById(R.id.tvKetQua);
        btnTong = findViewById(R.id.btnTong);
        btnXoaTrang = findViewById(R.id.btnXoaTrang);
        edANumber = findViewById(R.id.edANumber);
        edBNumber = findViewById(R.id.edBNumber);
    }

    private void setEvent(){

        btnTong.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //tvKetQua.setBackgroundColor(Color.GREEN);
                tvKetQua.setText("Tổng 2 số là: " +(Integer.parseInt(edANumber.getText().toString()) + Integer.parseInt(edBNumber.getText().toString())));
            }
        });
        btnXoaTrang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tvKetQua.setText("");
                tvKetQua.setBackgroundColor(Color.TRANSPARENT);

                edANumber.setText("");
                edBNumber.setText("");
            }
        });
    }

}
