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

    private final String[] questions = {"Name three sphere things","Name three clother on you","Name smth else"};

    public final ArrayList<String> createList() {
        ArrayList<String> list = new ArrayList<String>();
        return list;
    }

    public final ArrayList<String> addQuestion(ArrayList<String> list, String string){
        list.add(string);
        return list;
    }

    public String getQuestion(){
        int i = 0;
        i = (int) Math.random()*questions.length;
        return questions[i];
    }
}
