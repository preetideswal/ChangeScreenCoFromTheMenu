package com.example.changecolorofthescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.graphics.Color;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout l;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=(LinearLayout)findViewById(R.id.linear);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// TODO Auto-generated method stub
        MenuInflater mymenu=getMenuInflater();
        mymenu.inflate(R.menu.mymenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
// TODO Auto-generated method stub
        if(item.getItemId()==R.id.item1)
        {
            l.setBackgroundColor(Color.RED);
        }
        if(item.getItemId()==R.id.item2)
        {
            l.setBackgroundColor(Color.BLUE);
        }
        if(item.getItemId()==R.id.item3)
        {
            l.setBackgroundColor(Color.BLACK);
        }
        return super.onOptionsItemSelected(item);
    }
}