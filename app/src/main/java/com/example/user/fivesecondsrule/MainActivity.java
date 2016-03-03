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
        final ArrayList<String> questions = formList();

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

        /*final Button addButton = (Button) findViewById(R.id.add);
        nextButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) // клик на кнопку
            {
                //questions.add();
            }
        });*/


    }

    public ArrayList<String> formList(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Name three sphere things");
        list.add("Name three clother on you");
        list.add("Name three friends");
        list.add("Remember three Oscar masters");
        return list;
    }

}
