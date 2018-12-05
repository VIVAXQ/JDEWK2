package com.kolesnikov.jde.task3;

import org.apache.commons.lang.ArrayUtils;

import java.util.ArrayList;

public class DominElem {

    public int learnElem(int[] given) {
        ArrayList<CountNum> countElem = new ArrayList<CountNum>();
        for (int i = 0; i < given.length; i++) {
            countElem.add(new CountNum(given[i]));
            for (int j = i + 1; j < given.length; j++) {
                if (given[i] == given[j]) {
                    countElem.get(i).incC();
                    given = ArrayUtils.remove(given, j);
                    j--;
                }
            }
        }
        CountNum countNumResult = new CountNum(0);
        for (int i = 0; i < countElem.size(); i++) {
            if (countElem.get(i).getCount() > countNumResult.getCount()) {
                countNumResult = countElem.get(i);
            }
        }
        return countNumResult.getNum();
    }
}
// сложность алгоритма, конечно, зашкаливает, но такой вариант легко масштабируется и поэтому, наверное, уместен