package com.opro.ken.color_picker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class no_1 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_1);
    }

    public void next(View view) {
        Intent intent = new Intent(this, no_2.class);
        startActivity(intent);
    }

}
