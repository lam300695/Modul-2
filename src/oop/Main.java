package oop;

public class Main {
    public static void main(String[] args) {
        Nguoi p1 = new Nguoi();
        p1.setTen("Lam");
        p1.setTuoi(24);

        Nguoi p2 = new Nguoi();
        p2.setTen("Hieu");
        p2.setTuoi(22);

        System.out.println(p1.getTen() + " " + p1.getTuoi());
        System.out.println(p2.getTen() + " " + p2.getTuoi());

        // Tao doi tuong book
        book book1 = new book();
        book1.setName("Giai toan");
        book1.setMoTa("Giai cac bai tap toan");
        book1.setPrice(60.1);

        book book2 = new book();
        book2.setName("De hoc tot van");
        book2.setMoTa("100 bai van mau");
        book2.setPrice(100.0);

        System.out.println(book2.getMoTa());

        book book4 = new book("A",4.5,"B");

        System.out.println(book4.getMoTa());
        System.out.println(book4.getName());
        System.out.println(book4.getPrice());
    }
}
