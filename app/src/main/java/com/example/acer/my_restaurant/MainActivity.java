package com.example.acer.my_restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText cust_name,contact;
    Button menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cust_name=(EditText)findViewById(R.id.editText);
        contact=(EditText)findViewById(R.id.editText2);
        menu=(Button)findViewById(R.id.button);

        menu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String custname=cust_name.getText().toString();
        String contactNo=contact.getText().toString();
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("customername",custname);
        intent.putExtra("contactno.",contactNo);
        startActivity(intent);



    }
}
