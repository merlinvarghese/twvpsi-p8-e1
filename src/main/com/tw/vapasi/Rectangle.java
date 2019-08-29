package com.tw.vapasi;

//  Four sided closed shape with right angle to each other
class Rectangle {
    private static final int TwiceOfDiameterAddition = 2;
    private double length;
    private double breadth;

    private Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return TwiceOfDiameterAddition * (length + breadth);
    }

    static Rectangle createSquare(double side) {
        return new Rectangle(side, side);
    }

    static Rectangle createRectangle(double length, double breadth) {
        return new Rectangle(length, breadth);
    }
}