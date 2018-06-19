package com.gmail.grind3x.task1;

public class Main {
    public static void main(String[] args) {
        String s = "";

        for (int i = 0; i < 20; i++) {
            if (i <= 9) {
                s += "* ";
            } else {
                s = s.substring(0, s.length() - 2);
            }
            System.out.println(s + " ");
        }
    }
}
