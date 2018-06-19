package com.gmail.grind3x.task4;

public class Main {
    public static void main(String[] args) {
        String s;
        int k = 20;
        for (int m = 0; m < 2; m++) {
            for (int i = 0; i < 20; i += 2) {
                s = "";
                for (int j = 0; j < k - 1; j++) {
                    s += " ";
                }
                for (int j = 0; j < i + 1; j++) {
                    s += "* ";
                }
                for (int j = 0; j < k - 1; j++) {
                    s += " ";
                }
                k -= 2;
                System.out.println(s);
            }
            k = 20;
        }
    }
}
