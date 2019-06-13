package com.kersh.wael.waelfotball;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private Button btnAdd;
private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        lv = (ListView) findViewById(R.id.Listview);
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
   /* private void intlistViewArraySample()
    {

        String[] a={"one","two","three"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,a);
        lv.setAdapter( adapter );
    }*/

    private void  initListView(){
        lv=(ListView) findViewById( R.id.Listview );
        MyFootballTable m1=new MyFootballTable( this );
        //String[] a = {"one","two","three"};
        ArrayList<MyFootball> a =m1.getAllfotball();
        ArrayAdapter<MyFootball> adapter = new ArrayAdapter<MyFootball>(this,android.R.layout.simple_expandable_list_item_1,a  );
        lv.setAdapter( adapter );
        lv.setOnItemLongClickListener( new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText( MainActivity.this, "position:" + position, Toast.LENGTH_SHORT ).show();
                MyFootball m=(MyFootball)parent.getItemAtPosition( position );
                Toast.makeText( MainActivity.this,"phone:"+m.getPlace(),Toast.LENGTH_SHORT ).show();
                Intent i=new
                        Intent( Intent.ACTION_DIAL,Uri.parse( "tel:"+m.getPlace()));
                        finish();
                return true;

            }

        } );
        }
    }




