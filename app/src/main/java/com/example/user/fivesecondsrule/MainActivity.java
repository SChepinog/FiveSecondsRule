package com.example.user.fivesecondsrule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<String> questions = formList();

        final Button startButton = (Button) findViewById(R.id.start);
        startButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) // клик на кнопку
            {
                //startTimer();
            }
        });

        final Button nextButton = (Button) findViewById(R.id.next);
        nextButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) // клик на кнопку
            {
                final TextView tTemper = (TextView) findViewById(R.id.textView);
                String ques = "";
                ques = getQuestion(questions);
                tTemper.setText(ques); // отображение температуры
            }
        });




    }

    //public ArrayList<String> questions = formList();

    public ArrayList<String> formList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Назовите три круглых предмета");
        list.add("Назовите три вещи, которые наденете на свою свадьбу");
        list.add("Назовите три мультфильма Дисней");
        list.add("Назовите трех обладателей Оскар");
        list.add("Назовите три фильма жанра хоррор");
        list.add("Назовите три самых смешных сериала");
        return list;
    }

    public String getQuestion(ArrayList<String> list){
        int i = 0;
        try {
            i = (int) (Math.random()*list.size());
             }
        catch (Exception e) {
            System.out.println("Wow, i = 1!");
        }
        return list.get(i);
    }

}
