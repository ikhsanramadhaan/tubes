package com.example.ikhsanramadhan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView =(ListView) findViewById(R.id.list);

        String[] word = {"Senin"
                ,"Selasa"
                ,"Rabu"
                ,"Kamis"
                ,"Jum'at"
                ,"Sabtu"
                ,"Minggu"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,
                android.R.id.text1, word);

        listView.setAdapter(adapter);
    }
}
