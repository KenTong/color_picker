package com.opro.ken.color_picker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;


public class ColorPicker extends AppCompatActivity {
    public static final String Bundle_Key_Color_Int = "com.opro.ken.color.colorInt";
    public static final String Bundle_Key_Color_Name = "com.opro.ken.color.colorName";
    private int mColorInt;
    private CharSequence mColorName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_picker);
        initColorData();
    }

    private void initColorData() {
        RadioButton radio = (RadioButton)findViewById(R.id.holo_red_light);
        mColorInt = radio.getCurrentTextColor();
        mColorName = radio.getText();
    }

    public void clickcolor(View view) {
        RadioButton radio = (RadioButton) view;
        mColorInt = radio.getCurrentTextColor();
        mColorName = radio.getText();
    }

    public void OK(View view){
        Intent intent = new Intent();
        intent.putExtra(Bundle_Key_Color_Int,mColorInt);
        intent.putExtra(Bundle_Key_Color_Name,mColorName);
        setResult(RESULT_OK,intent);
        finish();
    }
}