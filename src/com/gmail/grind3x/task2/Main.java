package com.gmail.grind3x.task2;

public class Main {
    public static void main(String[] args) {
        String s = "* * * * * * * * * * ";
        for (int i = 10; i > 0; i--) {
            System.out.println(s);
            s = s.substring(0, s.length() - 2);
        }
    }
}
