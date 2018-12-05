package com.kolesnikov.jde.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class AnagramsQ {

    public ArrayList<ArrayList<String>> sortList(ArrayList<String> given) {
        ArrayList<ArrayList<String>> resultArray = new ArrayList<ArrayList<String>>();
        resultArray.add(new ArrayList<String>());
        for (int i = 0; i < given.size(); i++) {
            char[] tempStr = given.get(i).toCharArray();
            Arrays.sort(tempStr);
            for (int j = 0; j < resultArray.size(); j++) {
                if (resultArray.get(j).size() != 0) {
                    char[] tempStrQ = resultArray.get(j).get(0).toCharArray();
                    Arrays.sort(tempStrQ);
                    if (Arrays.equals(tempStr, tempStrQ)) {
                        resultArray.get(j).add(given.get(i));
                        break;
                    }
                } else {
                    resultArray.get(j).add(given.get(i));
                    resultArray.add(new ArrayList<String>());
                    j++;
                }
            }
        }
        if (resultArray.get(resultArray.size() - 1).size() == 0) {
            resultArray.remove(resultArray.size() - 1);
        }
        return resultArray;
    }
}
