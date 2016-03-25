package com.opro.ken.color_picker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class insert_text extends AppCompatActivity {
    public static final String Bundle_Key_String = "com.opro.ken.color.String";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_text);

    }

    public void enter(View view){
        EditText et1 = (EditText)findViewById(R.id.et1);
        CharSequence text = et1.getText();
        Intent intent = new Intent();
        intent.putExtra(Bundle_Key_String, text);
        setResult(RESULT_OK, intent);
        finish();
    }
}
