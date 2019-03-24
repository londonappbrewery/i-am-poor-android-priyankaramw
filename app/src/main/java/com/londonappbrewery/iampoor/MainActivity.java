package com.londonappbrewery.iampoor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startAnActivity (View view) {

        EditText editName = (EditText)findViewById(R.id.editName);
        String name = editName.getText().toString();

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }
}
