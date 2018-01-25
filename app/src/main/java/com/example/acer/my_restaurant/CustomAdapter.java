package com.example.acer.my_restaurant;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Acer on 23-10-2017.
 */
public class CustomAdapter extends BaseAdapter{

    Context context;
    ArrayList<String> smenu;
    ArrayList<Float> pri;
    boolean[]cbstate=new boolean[14];

    public CustomAdapter(Context context, ArrayList<String> resource,ArrayList<Float> pri) {
        super();//context,R.layout.row,resource);
        this.context=context;
        this.smenu=resource;
        this.pri=pri;
        System.out.println("constructor called");


    }


    @Override
    public int getCount() {
        return smenu.size();
    }

    @Override
    public Object getItem(int position) {
        return smenu.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        System.out.println("get method called");
        ViewHolder holder = null;
        if(convertView==null) {
            holder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(context);
             convertView = inflater.inflate(R.layout.row, parent, false);
            holder.cb = (CheckBox)convertView.findViewById(R.id.checkbox);
            holder.rs = (TextView) convertView.findViewById(R.id.price);
            holder.name = (TextView) convertView.findViewById(R.id.textview);
            holder.quantity = (EditText) convertView.findViewById(R.id.quantity);
            convertView.setTag(holder);
        }
        else {
            holder=(ViewHolder)convertView.getTag();
        }
        holder.name.setText(smenu.get(position));
        holder.rs.setText("" + pri.get(position));

        /*holder.cb.setChecked(cbstate[position]);
        holder.cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked())
                    cbstate[position]=true;
                else
                    cbstate[position]=false;
            }
        });*/

        return convertView;
    }

    public class ViewHolder{
        CheckBox cb;
        TextView rs,name;
        EditText quantity;
    }
}







