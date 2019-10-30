package _Mang.Geomestryc;

import java.util.Scanner;

public class Circle extends GeoMestryc {
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

    @Override
    public void nnhapTT() {
        Scanner sc = new Scanner(System.in);
        super.nnhapTT();
        System.out.println("Input radius :");
        this.radius = sc.nextDouble();
    }

    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("Radius is :" + this.radius);
        System.out.println("Dien tich Circle la :" + this.dienTich());
    }

    public double dienTich(){
        return Math.PI * 2 * this.radius;
    }
}
