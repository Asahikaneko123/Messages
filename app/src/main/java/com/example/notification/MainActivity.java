package com.example.notification;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        //Create Data
        ArrayList<Person> arrayList = new ArrayList<>();

        arrayList.add(new Person(R.drawable.notification_message_icon, "New Message From Mika","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor..."));
        arrayList.add(new Person(R.drawable.notification_message_icon, "New Message From Philip", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor..."));
        arrayList.add(new Person(R.drawable.briefcase_blue_icon, "Mika Asks for a Feedback", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor..."));

        //We make custom adapter
        PersonAdapter perosonAdapter = new PersonAdapter(this,R.layout.listview,arrayList);
        listView.setAdapter(perosonAdapter);



    }

}