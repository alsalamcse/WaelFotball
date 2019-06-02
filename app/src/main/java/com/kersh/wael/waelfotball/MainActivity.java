package com.kersh.wael.waelfotball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private Button btnAdd;
private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        listView = (ListView) findViewById(R.id.Listview);
    }
        public void onclick(View v)
        {
            if (v==btnAdd)
            {
                Intent intent=new Intent(getBaseContext(),MatchDetais.class);
                startActivity(intent);
                finish();
            }
        }
    }

