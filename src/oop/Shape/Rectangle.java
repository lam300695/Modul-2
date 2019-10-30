package oop.Shape;

public class Rectangle extends Shape {
    private double with;
    private double height;

    public Rectangle(){
    }

    public Rectangle(double with, double height){
        this.with = with;
        this.height = height;
    }

    public double getWith() {
        return with;
    }

    public void setWith(double with) {
        this.with = with;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return (with + height) * 2;
    }

    public double getPerimeter(){
        return with * height;
    }

    @Override
    public void toStrin() {
        super.toStrin();
        System.out.println("With is : " + this.with);
        System.out.println("Height is : " + this.height);
        System.out.println("Chu vi La :" + getArea());
        System.out.println("Dien tich La :" + getPerimeter());
    }
}
