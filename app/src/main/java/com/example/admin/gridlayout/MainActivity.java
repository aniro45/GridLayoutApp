package com.example.admin.gridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void Button1Clicked(View view){
        Toast.makeText(this, "Hiii....", Toast.LENGTH_SHORT).show();

    }

    public void Button2Clicked(View view){
        Toast.makeText(this, "How are you..??", Toast.LENGTH_SHORT).show();

    }

    public void Button3Clicked(View view){
        Toast.makeText(this, "Please...", Toast.LENGTH_SHORT).show();

    }

    public void Button4Clicked(View view){
        Toast.makeText(this, "Sorry...", Toast.LENGTH_SHORT).show();

    }

    public void Button5Clicked(View view){

        Toast.makeText(this, "Get lost..!!", Toast.LENGTH_SHORT).show();

    }

    public void Button6Clicked(View view){
        Toast.makeText(this, "Are you Crazy...!!!", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
