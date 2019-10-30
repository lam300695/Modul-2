package oop.Circle;

import java.util.Scanner;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
    }

    public Cylinder(double height){
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        super.nhapTT();
        System.out.println("Input height : ");
        this.height = sc.nextDouble();
    }

    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("Height is :");
        System.out.println("Dien tich hinh tru la :" + this.dienTichHinhTru());
    }

    public double dienTichHinhTru(){
        return super.dienTich() * this.height;
    }
}
