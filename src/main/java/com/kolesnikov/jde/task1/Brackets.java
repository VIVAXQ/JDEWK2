package com.kolesnikov.jde.task1;


public class Brackets {

    private static final char b1O = '(';
    private static final char b1C = ')';
    private static final char b2O = '{';
    private static final char b2C = '}';
    private static final char b3O = '[';
    private static final char b3C = ']';

    public boolean checkBrackets(String given) {
        boolean[] check = new boolean[given.length()];
        for (int i = 0; i < check.length; i++) {
            check[i] = false;
        }
        for (int i = 0; i < given.length(); i++) {
            if (!check[i]) {
                for (int j = i + 1; j < given.length(); j++) {
                    if (check[j]) {
                        break;
                    } else {
                        if ((given.charAt(i) == b1O) & (given.charAt(j) == b1C)) {
                            check[i] = true;
                            check[j] = true;
                        }
                        if ((given.charAt(i) == b2O) & (given.charAt(j) == b2C)) {
                            check[i] = true;
                            check[j] = true;
                        }
                        if ((given.charAt(i) == b3O) & (given.charAt(j) == b3C)) {
                            check[i] = true;
                            check[j] = true;
                        }
                    }
                }
            }
        }
        boolean temp = true;
        for (int i = 0; i < check.length; i++) {
            if (!check[i]) {
                temp = false;
            }
        }
        return temp;
    }
}
