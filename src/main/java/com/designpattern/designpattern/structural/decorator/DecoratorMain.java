package com.designpattern.designpattern.structural.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        // Tạo một đối tượng hình tròn
        Shape circle = new Circle();

        // Tạo một decorator mới cho hình tròn và vẽ
        Shape redCircle = new RedShapeDecorator(circle);
        redCircle.draw();

        // Tạo một decorator mới cho hình chữ nhật và vẽ
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        redRectangle.draw();
    }
}
