package com.opro.ken.color_picker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final int Select_Color_Request = 0;
    private static final int EDRequest = 1;
    private int mcolor = 0xFFFFFFFF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void selectcolor(View view) {
        Intent intent = new Intent(this, ColorPicker.class);
        startActivityForResult(intent, Select_Color_Request);
    }
    public void insert(View view) {
        Intent intent = new Intent(this, insert_text.class);
        startActivityForResult(intent, EDRequest);
    }
    @Override
    protected void onActivityResult(int requestCode , int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Select_Color_Request) {
            if (resultCode == RESULT_OK) {
                Bundle bundle = data.getExtras();

                mcolor = bundle.getInt(ColorPicker.Bundle_Key_Color_Int);
                CharSequence colorName = bundle.getCharSequence(ColorPicker.Bundle_Key_Color_Name);

                TextView colorpicker = (TextView) findViewById(R.id.colorpicker);
                colorpicker.setText(colorName);

                ScrollView sv1 = (ScrollView)findViewById(R.id.sv1);
                sv1.setBackgroundColor(mcolor);
            }
        }
            else if (requestCode == EDRequest){
                if (resultCode == RESULT_OK){
                    Bundle bundle = data.getExtras();
                    CharSequence  editText = bundle.getCharSequence(insert_text.Bundle_Key_String);

                    TextView colorpicker = (TextView) findViewById(R.id.colorpicker);
                    colorpicker.setText(editText);
                }
            }
        }
    public void next(View view) {
        Intent intent = new Intent(this, no_1.class);
        intent.putExtra(ColorPicker.Bundle_Key_Color_Int,mcolor);
        startActivity(intent);
        overridePendingTransition(R.anim.push_right_in, R.anim.push_left_out);
    }
}