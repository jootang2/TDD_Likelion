package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    @Test
    public void 더하기_테스트_2(){
        int rs = Calculator.add("20 + 20");

        assertEquals(40, rs);


    }
    @Test

    public void 더하기_테스트_3(){
        int rs = Calculator.add("10 + 10");

        assertEquals(20, rs);
    }
}
