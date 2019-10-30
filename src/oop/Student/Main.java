package oop.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("B1903", "Lam"));
        list.add(new Student("B1902", "Hieu"));

        System.out.println("truoc sap xep :");
        for (var x :list){
            System.out.println(x);
        }

        System.out.println("sau sap xep :");
        Collections.sort(list);
        for (var x: list){
            System.out.println(x);
        }
    }
}
