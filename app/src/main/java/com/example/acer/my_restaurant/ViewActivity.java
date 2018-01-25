package com.example.acer.my_restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ViewActivity extends AppCompatActivity implements View.OnClickListener {
ListView listView;
    Button edit,order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        listView=(ListView)findViewById(R.id.listView3);
        edit=(Button)findViewById(R.id.button4);
        order=(Button)findViewById(R.id.button5);

        edit.setOnClickListener(this);
        order.setOnClickListener(this);
        Intent intent=getIntent();

        String s2=intent.getStringExtra("list");
        //ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Integer.parseInt(s2));
        //listView.setAdapter(arrayAdapter);



    }

    @Override
    public void onClick(View v) {
       if (v.getId()==R.id.button4){
           Intent intent=new Intent(ViewActivity.this,Main2Activity.class);
           startActivity(intent);
       }

    }
}
