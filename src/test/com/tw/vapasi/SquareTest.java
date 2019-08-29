package com.tw.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class SquareTest {

    @Test
    void expectAreaForSide1() {
        Rectangle sqr =  Rectangle.createSquare(1.0);
        assertEquals(1.0, sqr.area());
    }
}
