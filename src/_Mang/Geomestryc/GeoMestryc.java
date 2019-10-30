package _Mang.Geomestryc;

import java.util.Scanner;

public class GeoMestryc {
    private String color;
    private String name;

    public GeoMestryc(){
    }

    public GeoMestryc(String color, String name){
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void nnhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input color :");
        this.color = sc.nextLine();
    }

    public void hienThi(){
        System.out.println("Color is :" + this.color);
    }

}
