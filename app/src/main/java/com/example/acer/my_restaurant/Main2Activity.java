package com.example.acer.my_restaurant;
import java.util.ArrayList;
import java.util.HashMap;

import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    ListView listView1, listView2;
    TextView textView1, textView2;
    ArrayList<String> vegstartermenu;
    ArrayList<Float> price;
    ArrayList<String>nonvegstartermenu;
    ArrayList<Float>nonvgprice;



    //String[] vegstartermenu;
    //float[] price;
    //String[] nonvegstartermenu;
    //float[] nonvgprice;

    ArrayList<String>vegmainmenu;
    //String[] vegmainmenu;
    ArrayList<Float>vegprice;
    ArrayList<String> nonvgmainmenu;
    ArrayList<Float> nonvegmainmenu;
    CustomAdapter adapter;

    //ArrayList<String> list;
    View view;
    Button btn1, btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();


        listView1 = (ListView) findViewById(R.id.listView);
        listView2 = (ListView) findViewById(R.id.listView2);

        btn1 = (Button) findViewById(R.id.button2);
        btn2 = (Button) findViewById(R.id.button3);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);




        vegstartermenu=new ArrayList<String>();
        price=new ArrayList<Float>();
        nonvegstartermenu=new ArrayList<String>();
        nonvgprice=new ArrayList<Float>();

        vegmainmenu=new ArrayList<String>();
        price=new ArrayList<Float>();
        nonvgmainmenu=new ArrayList<String>();
        nonvegmainmenu=new ArrayList<Float>();
        vegprice=new ArrayList<Float>();

        //vegstartermenu = new String[14];
        vegstartermenu.add("Masala Papad");
        vegstartermenu.add("Soup");
        vegstartermenu.add("Spring Roll");
        vegstartermenu.add("Chilly Paneer Dry");
        vegstartermenu.add("Veg. Manchurian Dry");
        vegstartermenu.add("Potatoes in Honey & Chill");
        vegstartermenu.add("Fried Vegetables in Salt & Papper ");
        vegstartermenu.add("Crispy Spinach & Baby - Corn");
        vegstartermenu.add("Chilly Mushroom Dry");
        vegstartermenu.add("Spring Roll");
        vegstartermenu.add("Spring Roll");
        vegstartermenu.add("Spring Roll");
        vegstartermenu.add("Spring Roll");


        //price = new float[14];
        price.add((float) 20);
        price.add((float) 50);
        price.add((float) 50);
        price.add((float) 50);
        price.add((float) 50);
        price.add((float) 50);
        price.add((float) 50);
        price.add((float) 50);
        price.add((float) 50);
        price.add((float) 50);
        price.add((float) 50);
        price.add((float) 50);
        price.add((float) 50);
        price.add((float) 50);


        //nonvegstartermenu = new String[5];
        nonvegstartermenu.add("Chicken soup");
        nonvegstartermenu.add("Tandoor");
        nonvegstartermenu.add("Mutton soup");
        nonvegstartermenu.add("Fried chicken");
        nonvegstartermenu.add("Fried Mutton");


        //nonvgprice = new float[5];
        nonvgprice.add((float)100);
        nonvgprice.add((float) 100);
        nonvgprice.add((float)100);
        nonvgprice.add((float)100);
        nonvgprice.add((float)100);

        //vegmainmenu = new String[2];
        vegmainmenu.add("mutter-paneer");
        vegmainmenu.add("dal-tadka");

       // vegprice = new float[2];
        vegprice.add((float)130);
        vegprice.add((float)100);

        //nonvgmainmenu = new String[2];
        nonvgmainmenu.add("Chiken handi");
        nonvgmainmenu.add("Mutton masala");

        //nonvegmainmenu = new float[2];
       nonvegmainmenu.add((float)130);
        nonvegmainmenu.add((float)130);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        //menu.notifyAll();

        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.starter) {
            adapter=new CustomAdapter(this,vegstartermenu,price);
             listView1.setAdapter(adapter);


            adapter = new CustomAdapter(this, nonvegstartermenu, nonvgprice);
            listView2.setAdapter(adapter);
            Toast.makeText(this,"if",Toast.LENGTH_LONG).show();
        } else {
            adapter = new CustomAdapter(this, vegmainmenu, vegprice);
            listView1.setAdapter(adapter);
            adapter = new CustomAdapter(this, nonvgmainmenu, nonvgprice);

            listView2.setAdapter(adapter);
            Toast.makeText(this,"else",Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button2) {

          /*  int m = listView1.getAdapter().getCount();

            for (int i = 0; i < m; i++) {
                View v1 = (View) listView1.getItemAtPosition(i);
                CheckBox cb1 = (CheckBox) v1.findViewById(R.id.checkbox);
                TextView tv = (TextView) v1.findViewById(R.id.textview);
                if (cb1.isChecked()) {
                    list = new ArrayList<String>();
                    list.add(tv.getText().toString());

                }*/


                Intent intent = new Intent(Main2Activity.this, ViewActivity.class);
                //intent.putExtra("list", list);

                startActivity(intent);
            }

        }
    }
