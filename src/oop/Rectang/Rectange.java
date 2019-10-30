package oop.Rectang;

public class Rectange extends HinhHoc {
    String color;
    double s;


    public Rectange() {
    }

    public Rectange(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void nhapThongTin(){
    super.nhapThongTin();
    }

    @Override
    public void hienThi(){
        System.out.println("Dien tich la :" + dienTich());
    }

    public double dienTich() {
        s = super.getWith() * super.getHeight();
        return s;
    }
}
