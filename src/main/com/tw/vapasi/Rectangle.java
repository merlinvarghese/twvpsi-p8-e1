package com.tw.vapasi;

//  Four sided closed shape with right angle to each other
class Rectangle {
    private float length;
    private float breadth;

    Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    float area() {
        return length * breadth;
    }

    float perimeter() {
        return 2 * (length + breadth);
    }
}
