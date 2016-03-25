package com.opro.ken.color_picker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class no_2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_2);
    }

    public void next(View view) {
        Intent intent = new Intent(this, no_3.class);
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(this, no_1.class);
        startActivity(intent);
    }
}