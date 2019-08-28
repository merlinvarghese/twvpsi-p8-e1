package com.tw.vapasi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleTest {

    private Rectangle rectangle = new Rectangle();
    @Test
    void calculateAreaForDimension1_2( )
    {
        Assertions.assertEquals( 2,rectangle.calculateArea(1,2));
    }
}
