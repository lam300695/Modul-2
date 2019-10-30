package oop.Rectang;

import java.util.Scanner;

public class Circle extends HinhHoc {
    double radius;
    double c;

    public Circle() {
    }

    public Circle(double radius, double with, double height) {
        super(with, height);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input radius :");
        radius = sc.nextDouble();
    }
    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Radius is :" + this.radius);
        System.out.println("Chu vi la :" + chuVi());
    }

    public double chuVi(){
        c = Math.PI * 2 * radius;
        return c;
    }
}
