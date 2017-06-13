package com.example.admin.tp7android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ResponseActivity extends AppCompatActivity {

    private Question[] questions = new Question[]{
            new Question("Numéro atomique du Carbone : ", "5", "6", false),
            new Question("Numéro atomique du Bore : ", "5", "2", true),
            new Question("Numéro atomique du Hélium : ", "4", "2", true),
            new Question("Numéro atomique du Bérylium : ", "4", "3", false),
            new Question("Numéro atomique du Oxygen : ", "8", "6", true)
    };

    int i = 0;
    int score = 0;
    int question_lenght = questions.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_response);

        Intent intent = getIntent();
        String text = intent.getStringExtra("param");
        TextView editText = (TextView) findViewById(R.id.textView2);
        editText.setText(questions[i].getQuestion());
        TextView button4 = (TextView) findViewById(R.id.button4);
        button4.setText(questions[i].getQuestion1());
        TextView button3 = (TextView) findViewById(R.id.button3);
        button3.setText(questions[i].getQuestion2());
    }

    public void onClickrepa(View view) {
        int param = 0;
        Questionnaire(param);
    }

    public void onClickrepb(View view) {
        int param = 1;
        Questionnaire(param);
    }

    public void Questionnaire(int param) {
        i += 1;
        Log.d("Questionnaire i", String.valueOf(i));
        if (i <= question_lenght) {
            TextView textView = (TextView) findViewById(R.id.textView2);
            textView.setText(questions[i].getQuestion());
        }
        if (i <= question_lenght) {
            TextView textView = (TextView) findViewById(R.id.button4);
            textView.setText(questions[i].getQuestion1());
        }
        if (i <= question_lenght) {
            TextView textView = (TextView) findViewById(R.id.button3);
            textView.setText(questions[i].getQuestion2());
        }
        Log.d("Questionnaire réponse", String.valueOf(questions[i].isReponse()));
        if (questions[i].isReponse() == true) {
            if (param == 0) {
                score += 1;
            }
            else {
                score -= 1;
            }
        }
        if (questions[i].isReponse() == false) {
            if (param == 1) {
                score += 1;
            }
            else {
                score -= 1;
            }
        }
        else {
            TextView textView = (TextView) findViewById(R.id.textView3);
            textView.setText(String.valueOf(score));
        }
        Log.d("Questionnaire score", String.valueOf(score));
    }
}
