package com.example.user.fivesecondsrule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button startButton = (Button) findViewById(R.id.start);
        startButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) // клик на кнопку
            {
                //RefreshTemper();
            }
        });

        final Button nextButton = (Button) findViewById(R.id.next);
        nextButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) // клик на кнопку
            {
                //RefreshTemper();
            }
        });


    }

    private final String[] quesList = {"Name three sphere things","Name three clother on you","Name smth else"};

    public String getQuestion(String[] questions){
        int i = 0;
        i = (int) Math.random()*questions.length;
        return questions[i];
    }

    public String[] addQuestion (String[] questions, String question) {
        String[] res = new String[questions.length+1];
        for (int i=0; i < questions.length; i++) {
            res[i] = questions[i];
        }
        res[questions.length] = question;
        return res;
    }
}
