package com.helen;

import org.junit.Assert;

public class Actionwords {

    private int number1, number2, actualResult, expectResult;

    public void resultIsP1(String p1) {
        expectResult = Integer.parseInt(p1);
        Assert.assertEquals(actualResult, expectResult);
    }

    public void have9() {
        number1 = 9;
    }

    public void takeAway4() {
        number2 = 4;
        actualResult = number1 - number2;
    }

    public void haveP(String p) {
        number1 = Integer.parseInt(p);
    }

    public void addP(String p) {
        number2 = Integer.parseInt(p);
        actualResult = number1+number2;
    }
}