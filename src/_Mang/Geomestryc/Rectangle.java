package _Mang.Geomestryc;

import java.util.Scanner;

public class Rectangle extends Circle {
    private double height;

    public Rectangle() {
    }

    public Rectangle(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void nnhapTT(){
        Scanner sc = new Scanner(System.in);
        super.nnhapTT();
        System.out.println("Input height :");
        this.height = sc.nextDouble();
    }

    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("Height is :" + this.height);
        System.out.println("Dien tich Rectangle la :" + this.dienTichRec());

    }

    public double dienTichRec(){
        return super.dienTich() * this.height;
    }
}
