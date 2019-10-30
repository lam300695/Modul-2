package oop.dongVat;

public class Dog implements DongVat {
    @Override
    public void an() {
        System.out.println("An xuong");
    }

    @Override
    public void keu() {
        System.out.println("Gau Gau");
    }

    @Override
    public void canNang() {
        System.out.println("15 Kg");
    }
}
