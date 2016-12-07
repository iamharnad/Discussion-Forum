package com.example.anji.cdac_discussion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Anji on 7/28/2016.
 */
public class Contact_Adopter extends ArrayAdapter
{
    Context context;
    ArrayList<contact> data_sourse = new ArrayList<>();

    public Contact_Adopter(Context context, int simple_list_item_1, ArrayList<contact> data_sourse) {
        super(context,0, data_sourse);
        context = context;
        this.data_sourse = data_sourse;
    }

    @Override
    public int getCount() {
        return data_sourse.size();
    }

    @Override
    public Object getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        contact user_clicked = data_sourse.get(position);

        String name = user_clicked.Name;

        int id = user_clicked.img;

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.contact_template,parent,false);

        TextView textView = (TextView)convertView.findViewById(R.id.contact_template_tv);
        textView.setText(name);
        ImageView imageView = (ImageView)convertView.findViewById(R.id.contact_imgview);
        imageView.setImageResource(id);

        return convertView;
    }
}
