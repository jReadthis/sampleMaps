package com.example.nano1.maps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.worldicon);
    }

    public void myLocation(View view) {

        Intent myIntent = new Intent(this, MapsActivity.class);
        MainActivity.this.startActivity(myIntent);
    }
}
