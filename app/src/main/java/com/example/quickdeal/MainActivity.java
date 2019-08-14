package com.example.quickdeal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void womensPage(View view){
        Intent intent1 = new Intent(this,womens_activity.class);
        startActivity(intent1);
    }
    public void mensPage(View view){
        Intent intent1 = new Intent(this,mens_activity.class);
        startActivity(intent1);
    }
    public void kidsPage(View view){
        Intent intent1 = new Intent(this,kids_activity.class);
        startActivity(intent1);
    }
    public void babiesPage(View view){
        Intent intent1 = new Intent(this,babies_activity.class);
        startActivity(intent1);
    }
}
