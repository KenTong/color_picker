package com.opro.ken.color_picker;


import android.content.res.Resources;
import android.text.Html;

import java.util.ArrayList;
import java.util.List;

public class QuestionFromStringResrouce implements QuestionAdapter {


    private List<Question> list = new ArrayList<>();

    public QuestionFromStringResrouce(Resources res) {
        list.add(new Question(res.getString(R.string.Question1),
                        res.getString(R.string.Question1_radio_a),
                        res.getString(R.string.Question1_radio_b),
                        res.getString(R.string.Question1_radio_c))
        );
        list.add(new Question(res.getString(R.string.Question2),
                        res.getString(R.string.Question2_radio_a),
                        res.getString(R.string.Question2_radio_b),
                        res.getString(R.string.Question2_radio_c))
        );
        list.add(new Question(res.getString(R.string.Question3),
                        res.getString(R.string.Question3_radio_a),
                        res.getString(R.string.Question3_radio_b),
                        res.getString(R.string.Question3_radio_c))
        );
    }

    @Override
    public int getQuestoinCount() {
        return list.size();
    }

    @Override
    public CharSequence getQuestion(int index) {
        Question question = list.get(index);
        String text = question.getQuestion();
        return Html.fromHtml(text);

    }

    @Override
    public CharSequence getQuestionOptionA(int index) {
        return Html.fromHtml(list.get(index).getOptionA());
    }

    @Override
    public CharSequence getQuestionOptionB(int index) {
        return Html.fromHtml(list.get(index).getOptionB());
    }

    @Override
    public CharSequence getQuestionOptionC(int index) {
        return Html.fromHtml(list.get(index).getOptionC());
    }
}
