package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int value1 = 123;
        String value2="123";
        Bundle bundle = new Bundle();
        bundle.putInt("valuel", value1);
        bundle.putString("valuel2",value2);

        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("key",bundle);
        startActivity(intent);
    }
}
