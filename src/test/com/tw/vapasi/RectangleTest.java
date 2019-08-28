package com.tw.vapasi;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    @Test
    void calculateAreaForDimension1_2() {
        Rectangle rectangle = new Rectangle(1, 2);
        assertEquals(2, rectangle.area());
    }
    @Test
    void calculateAreaForDimension7_5() {
        Rectangle rectangle = new Rectangle(7, 5);
        assertEquals(35, rectangle.area());
    }
    @Test
    void calculatePerimeterForDimension1_2() {
        Rectangle rectangle = new Rectangle(1, 2);
        assertEquals(6, rectangle.perimeter());
    }

}
