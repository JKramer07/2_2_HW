package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("bread");
        createObject("apples");
        createObject("rise");
//        createObject("Bread");
//        createObject("Apples");
//        createObject("Rise");
    }

    public static String createObject(String className){
//        switch (className){
//            case "Bread":
//                Bread bread = new Bread("Bread ", 25);
//                bread.print();
//                break;
//            case "Apples":
//                Apples apples = new Apples("Apples ", 3);
//                apples.print();
//                break;
//            case "Rise":
//                Rise rise = new Rise("Rise ", "Krasnodar");
//                rise.print();
//                break;
//            default:
//                return null;
//        }
//        return null;
        Bread bread = new Bread("Bread ", 25);
        Apples apples = new Apples("Apples ", 3);
        Rise rise = new Rise("Rise ", "Krasnodar");

        switch (className){
            case "bread" -> bread.print();
            case "apples" -> apples.print();
            case "rise" -> rise.print();
        }
        return className;
    }
}
