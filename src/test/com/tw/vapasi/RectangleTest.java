package com.tw.vapasi;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    @Test
    void expectAreaForDimension1_2() {
        Rectangle rectangle = new Rectangle(1.0, 2.0);
        assertEquals(2.0, rectangle.area());
    }
    @Test
    void expectAreaForDimension7_5() {
        Rectangle rectangle = new Rectangle(7, 5);
        assertEquals(35, rectangle.area());
    }
    @Test
    void expectPerimeterForDimension1_2() {
        Rectangle rectangle = new Rectangle(1, 2);
        assertEquals(6, rectangle.perimeter());
    }
    @Test
    void expectPerimeterForDimension7_5() {
        Rectangle rectangle = new Rectangle(7, 5);
        assertEquals(24, rectangle.perimeter());
    }
}
