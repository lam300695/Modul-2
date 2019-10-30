package oop;

public class book {
    String name;
    Double price;
    String moTa;

    public book() {
    }

    public book(String name, Double price, String moTa) {
        this.name = name;
        this.price = price;
        this.moTa = moTa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
