package com.kolesnikov.jde.task3;

public class CountNum {

    private int num;
    private int count;

    public CountNum(int num) {
        this.num = num;
        this.count = 0;
    }

    public void incC() {
        count++;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
