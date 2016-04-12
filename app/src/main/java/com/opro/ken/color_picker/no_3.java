package com.opro.ken.color_picker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class no_3 extends AppCompatActivity {
    public static final String Q3_Answear_Key = "Q3";

    private TextView tv_message;
    private TextView tv_no3;
    private RadioButton no_3_radio_A;
    private RadioButton no_3_radio_B;
    private RadioButton no_3_radio_C;
    private CharSequence answear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_3);
        init();
    }

    private void init() {
        tv_message = (TextView) findViewById(R.id.tv_message);
        tv_no3 = (TextView) findViewById(R.id.tv_no3);
        no_3_radio_A = (RadioButton) findViewById(R.id.NO3_ans_A);
        no_3_radio_B = (RadioButton) findViewById(R.id.NO3_ans_B);
        no_3_radio_C = (RadioButton) findViewById(R.id.NO3_ans_C);

        int index = 2;
        String no = String.valueOf(index + 1);
        tv_no3.setText(no);


        QuestionAdapter adapter = QuestionAdapterFactory.getQuestoinAdapter();
        tv_message.setText(adapter.getQuestion(index));
        no_3_radio_A.setText(adapter.getQuestionOptionA(index));
        no_3_radio_B.setText(adapter.getQuestionOptionB(index));
        no_3_radio_C.setText(adapter.getQuestionOptionC(index));

       // tv_no3.setText("3");
       // tv_message.setText(Html.fromHtml(getString(R.string.Question3)));
       // no_3_radio_A.setText(Html.fromHtml(getString(R.string.Question3_radio_a)));
       // no_3_radio_B.setText(Html.fromHtml(getString(R.string.Question3_radio_b)));
       // no_3_radio_C.setText(Html.fromHtml(getString(R.string.Question3_radio_c)));
    }

    public void main(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);

    }

    public void back(View view) {
        Intent intent = new Intent(this, no_2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.push_left_out, R.anim.push_right_in);
    }

    public void click(View view) {
        answear = view.getTag().toString();
    }

    public void OK(View view) {
        Intent intent = new Intent(this, no_3.class);
        intent.putExtra(Q3_Answear_Key, answear);
    }

}