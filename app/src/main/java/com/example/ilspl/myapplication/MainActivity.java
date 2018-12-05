package com.example.ilspl.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView tv_click;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_click= findViewById(R.id.tv_click);
        tv_click.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(),"Action clicked",Toast.LENGTH_LONG).show();
            //goto second activity from main activity using intent
                Intent it=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(it);
            }
        });

    }
}
