package com.londonappbrewery.iampoor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String sName = intent.getStringExtra("name");

        TextView name = (TextView)findViewById(R.id.tvName);
        name.setText(sName);
    }
}
