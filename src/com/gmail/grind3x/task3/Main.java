package com.gmail.grind3x.task3;

public class Main {
    public static void main(String[] args) {
        String s = "";
        String m = "";
        int k = 20;
        for (int i = 0; i < 10; i++) {
            s = "";
            for (int j = 0; j < k - 1; j++) {
                s += " ";
            }
            k -= 2;
            for (int j = 0; j < i + 1; j++) {
                s += "* ";
            }
            System.out.println(s);
        }
        for (int i = 0; i < 10; i++) {
            m += "  ";
                s = m + s.substring(k + 2, s.length());
            System.out.println(s);
            k += 2;
        }
    }
}
