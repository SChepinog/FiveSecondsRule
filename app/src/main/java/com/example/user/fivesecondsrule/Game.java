package com.example.user.fivesecondsrule;

import java.util.ArrayList;

/**
 * Created by User on 11.03.2016.
 */
public class Game {

    ArrayList<String> list;
    public Game(){
        list = createList();
    }

    public ArrayList<String> createList() {
        ArrayList<String> alist = new ArrayList<>();
        alist.add("Назовите три круглых предмета");
        alist.add("Назовите три вещи, которые наденете на свою свадьбу");
        alist.add("Назовите три мультфильма Дисней");
        alist.add("Назовите трех обладателей Оскар");
        alist.add("Назовите три фильма жанра хоррор");
        alist.add("Назовите три самых смешных сериала");
        return alist;
    }
}
