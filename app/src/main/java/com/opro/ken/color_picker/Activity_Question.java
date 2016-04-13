package com.opro.ken.color_picker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public abstract class Activity_Question extends AppCompatActivity {

    private TextView tv_message;
    private TextView tv_no;
    private RadioButton radio_A;
    private RadioButton radio_B;
    private RadioButton radio_C;

    private Button btn_next;
    private Button btn_back;

    private static int sQuestionIndex = 0;
    private static QuestionAdapter sadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity__question);
        initQuestions();
        initBackNextButton();
    }


    @SuppressWarnings("ResourceType")
    private void initBackNextButton(){
        btn_back = (Button)findViewById(R.id.btn_back);
        btn_next = (Button)findViewById(R.id.btn_next);

        btn_back.setVisibility(getBackButtonVisibility());
        btn_next.setVisibility(getNextButtonVisibility());

    }
    private void initQuestions() {
        tv_message = (TextView) findViewById(R.id.tv_message);
        tv_no = (TextView) findViewById(R.id.tv_no);
        radio_A = (RadioButton) findViewById(R.id.ans_A);
        radio_B = (RadioButton) findViewById(R.id.ans_B);
        radio_C = (RadioButton) findViewById(R.id.ans_C);


        String no = String.valueOf(sQuestionIndex + 1);
        tv_no.setText(no);

        if (sadapter ==null){
            sadapter = QuestionAdapterFactory.getQuestoinAdapter();
            tv_message.setText(sadapter.getQuestion(sQuestionIndex));
            radio_A.setText(sadapter.getQuestion(sQuestionIndex));
            radio_B.setText(sadapter.getQuestion(sQuestionIndex));
            radio_C.setText(sadapter.getQuestion(sQuestionIndex));
        }
    }
    public void back(View view){
        sQuestionIndex--;
        Intent intent = new Intent(this,getBackActivityClass());
        startActivity(intent);
    }

    public void next(View view){
        sQuestionIndex++;
        Intent intent = new Intent(this,getNextActivityClass());
        startActivity(intent);
    }

    public void setBackButtonText(CharSequence text){
        btn_back.setText(text);
    }
    public void setNextButtonText(CharSequence text){
        btn_next.setText(text);
    }

    protected abstract Class getNextActivityClass();

    protected abstract Class getBackActivityClass();

    protected abstract int getNextButtonVisibility();

    protected abstract int getBackButtonVisibility();

}
