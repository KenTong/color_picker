package com.opro.ken.color_picker;


import android.content.res.Resources;

public class QuestionAdapterFactory {
    private static QuestionAdapter adapter;


    public static QuestionAdapter getQuestoinAdapter() {
        if (adapter == null) {
            Resources res = MyApp.getContext().getResources();
            adapter = new QuestionFromStringResrouce(res);

        }
        return adapter;
    }

    private QuestionAdapterFactory() {

    }

}
