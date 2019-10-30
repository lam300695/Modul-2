package oop.Rectang;

import java.util.Scanner;

public class HinhHoc {
    public double with;
    public double height;

    public HinhHoc() {
    }

    public HinhHoc(double with, double height) {
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

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input With :");
        with = sc.nextDouble();
        System.out.println("Input Height :");
        height = sc.nextDouble();
    }

    public void hienThi() {
        System.out.println("With is :" + this.with);
        System.out.println("Height is :" + this.height);
    }

}
