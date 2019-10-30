package oop.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius;
    }

    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public void toStrin() {
        super.toStrin();
        System.out.println("Radius is :" + radius);
        System.out.println("A Circle with radius =" + getArea() + "which is a subclass of" + getPerimeter());
    }
}
