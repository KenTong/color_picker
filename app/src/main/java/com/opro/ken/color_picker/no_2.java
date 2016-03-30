package com.opro.ken.color_picker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class no_2 extends AppCompatActivity {
    public static final String Q2_Answear_Key = "Q2";

    private TextView tv_message2;
    private TextView tv_no2;
    private RadioButton no_2_radio_A;
    private RadioButton no_2_radio_B;
    private RadioButton no_2_radio_C;
    private CharSequence answear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_2);
        init();
    }

    private void init() {
        tv_message2 = (TextView) findViewById(R.id.tv_message2);
        tv_no2 = (TextView) findViewById(R.id.tv_no2);
        no_2_radio_A = (RadioButton) findViewById(R.id.NO2_ans_A);
        no_2_radio_B = (RadioButton) findViewById(R.id.NO2_ans_B);
        no_2_radio_C = (RadioButton) findViewById(R.id.NO2_ans_C);

        tv_no2.setText("2");
        tv_message2.setText(Html.fromHtml(getString(R.string.Question2)));
        no_2_radio_A.setText(Html.fromHtml(getString(R.string.Question2_radio_a)));
        no_2_radio_B.setText(Html.fromHtml(getString(R.string.Question2_radio_b)));
        no_2_radio_C.setText(Html.fromHtml(getString(R.string.Question2_radio_c)));
    }
    public void next(View view) {
        Intent intent = new Intent(this, no_3.class);
        intent.putExtra(Q2_Answear_Key,answear);
        startActivity(intent);
        overridePendingTransition(R.anim.push_right_in, R.anim.push_left_out);
    }
    public void back(View view) {
        Intent intent = new Intent(this, no_1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.push_right_in, R.anim.push_left_out);
    }
    public void click(View view) {
        answear = view.getTag().toString();

    }
}