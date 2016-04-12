package com.opro.ken.color_picker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class no_1 extends AppCompatActivity {
    public static final String Q1_Answear_Key = "Q1";

    private TextView tv_message;
    private TextView tv_no;
    private RadioButton radio_A;
    private RadioButton radio_B;
    private RadioButton radio_C;
    private CharSequence answear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_1);
        init();
    }

    private void init() {
        tv_message = (TextView) findViewById(R.id.tv_message);
        tv_no = (TextView) findViewById(R.id.tv_no);
        radio_A = (RadioButton) findViewById(R.id.ans_A);
        radio_B = (RadioButton) findViewById(R.id.ans_B);
        radio_C = (RadioButton) findViewById(R.id.ans_C);

        int index = 0;
        String no = String.valueOf(index + 1);
        tv_no.setText(no);


        QuestionAdapter adapter = QuestionAdapterFactory.getQuestoinAdapter();
        tv_message.setText(adapter.getQuestion(index));
        radio_A.setText(adapter.getQuestionOptionA(index));
        radio_B.setText(adapter.getQuestionOptionB(index));
        radio_C.setText(adapter.getQuestionOptionC(index));

        //tv_no.setText("1");
        //tv_message.setText(Html.fromHtml(getString(R.string.Question1)));
        //radio_A.setText(Html.fromHtml(getString(R.string.Question1_radio_a)));
        //radio_B.setText(Html.fromHtml(getString(R.string.Question1_radio_b)));
        //radio_C.setText(Html.fromHtml(getString(R.string.Question1_radio_c)));

       // initBackgroundColor();

    }

    private void initBackgroundColor() {
        int color = getIntent().getIntExtra(ColorPicker.Bundle_Key_Color_Int, -1);
        tv_message.setBackgroundColor(color);
        if (color == -1) ;
        return;
    }

    public void next(View view) {
        Intent intent = new Intent(this, no_2.class);
        intent.putExtra(Q1_Answear_Key, answear);
        startActivity(intent);
        overridePendingTransition(R.anim.push_right_in, R.anim.push_left_out);
    }

    public void click(View view) {
        answear = view.getTag().toString();

    }
}
