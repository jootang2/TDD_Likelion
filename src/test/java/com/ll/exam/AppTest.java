package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    @Test
    public void 더하기_2(){
        int rs = Calculator.calc("20 + 20");

        assertEquals(40, rs);


    }
    @Test

    public void 더하기_3(){
        int rs = Calculator.calc("10 + 10");

        assertEquals(20, rs);
    }

    @Test

    public void 빼기(){
        int rs = Calculator.calc("10 - 10");

        assertEquals(0, rs);
    }

    @Test

    public void 곱하기(){
        int rs = Calculator.calc("10 * 10");

        assertEquals(100, rs);
    }
}
