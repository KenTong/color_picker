package com.opro.ken.color_picker;


public interface QuestionAdapter {
    int getQuestoinCount();

    CharSequence getQuestion(int index);

    CharSequence getQuestionOptionA(int index);

    CharSequence getQuestionOptionB(int index);

    CharSequence getQuestionOptionC(int index);
}
