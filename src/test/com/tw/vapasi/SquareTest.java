package com.tw.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class SquareTest {

    @Test
    void expectAreaForDimension1_2() {
        Square sqr = new Square(1.0);
        assertEquals(1.0, sqr.area());
    }
}
