package oop.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Lam");
        list.add("Yeu");
        list.add("Hieu");

        list.add(2,"Lam");


            if (list.equals("Lam")){
                System.out.println("co");
            }
    }
}
