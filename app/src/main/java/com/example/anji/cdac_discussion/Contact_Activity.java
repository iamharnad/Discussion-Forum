package com.example.anji.cdac_discussion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Contact_Activity extends AppCompatActivity
{ ListView listView;
    ArrayList<contact> user_list = new ArrayList<>();
    ArrayAdapter<contact> userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_);


        listView = (ListView)findViewById(R.id.contact_lv);
        //  userAdapter = new UserAdapter(MainActivity.this,user_list);
        userAdapter = new Contact_Adopter(this,android.R.layout.simple_list_item_1,user_list);
        listView.setAdapter(userAdapter);
        user_list.add(new contact("C-DAC Corporate Office",R.drawable.right_arraw_icon));
        user_list.add(new contact("Bengaluru",R.drawable.right_arraw_icon));
        user_list.add(new contact("Chennai",R.drawable.right_arraw_icon));
        user_list.add(new contact("Delhi",R.drawable.right_arraw_icon));
        user_list.add(new contact("Hyderabad",R.drawable.right_arraw_icon));
        user_list.add(new contact("Kolkata",R.drawable.right_arraw_icon));
        user_list.add(new contact("Mohali",R.drawable.right_arraw_icon));
        user_list.add(new contact("Mumbai",R.drawable.right_arraw_icon));
        user_list.add(new contact("Noida",R.drawable.right_arraw_icon));
        user_list.add(new contact("Pune",R.drawable.right_arraw_icon));
        user_list.add(new contact("Silchar",R.drawable.right_arraw_icon));
        user_list.add(new contact("Thiruvananthapuram",R.drawable.right_arraw_icon));
        userAdapter.notifyDataSetChanged();


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                contact u = user_list.get(position);
                Intent in = new Intent(Contact_Activity.this,Display_Contact.class);
                in.putExtra("position",position);
                startActivity(in);
                Toast.makeText(Contact_Activity.this,"name :"+u.Name,Toast.LENGTH_LONG).show();
            }
        });
    }

}
