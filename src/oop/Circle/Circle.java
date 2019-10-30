package oop.Circle;

import java.util.Scanner;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Radius is :");
        this.radius = sc.nextDouble();
        System.out.println("Color is :");
        this.color = sc.nextLine();
    }

    public void hienThi(){
        System.out.println("Radius :" + this.radius);
        System.out.println("Color :" + this.color);
        System.out.println("Dien tich la :" + this.dienTich());

    }

    public double dienTich(){
        return Math.PI * 2 * radius;
    }
}
