package com.javarush.task.pro.task10.task1005;

/* 
Многосерийный предприниматель
*/

public class Building {
    private  String type;

    public void initialize(String build){
        type = build;
    }

    //напишите тут ваш код

    public static void main(String[] args) {
        Building building = new Building();
        building.initialize("Барбершоп");
    }
}
