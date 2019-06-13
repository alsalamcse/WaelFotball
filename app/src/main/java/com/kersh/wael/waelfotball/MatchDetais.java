package com.kersh.wael.waelfotball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MatchDetais extends AppCompatActivity {
    private EditText ed2Teams, edPlace, edTime, edDate;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_detais);
        ed2Teams = (EditText) findViewById(R.id.ed2Teams);
        edPlace = (EditText) findViewById(R.id.edPlace);
        edTime = (EditText) findViewById(R.id.edTime);
        edDate = (EditText) findViewById(R.id.edDate);
        btnSave = (Button) findViewById(R.id.btnSave);
    }

    public void onClick(View v)
    {
        if (v == btnSave) {
            String t=edTime.getText().toString();
            String te=ed2Teams.getText().toString();
            String d=edDate.getText().toString();
            String p=edPlace.getText().toString();

           MyFootball  football=new MyFootball ();
            football.setTeamName( te );
          football.setDate( d );
          football.setPlace( p );
          football.setTime( t );


            MyFootballTable myFootballTable =new MyFootballTable(this);

            myFootballTable.matchDetais (football);

            Intent intent = new Intent(getBaseContext(), MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
}