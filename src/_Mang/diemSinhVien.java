package _Mang;

import java.util.Scanner;

public class diemSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int count = 0;

        do {
            System.out.printf("Input size :");
            size = sc.nextInt();
            if (size > 30) {
                System.out.printf("Size max is 30 ");
            }
        } while (size > 30);

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Input arr " + i + " :");
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] >= 5 && arr[j] <= 10) {
                count++;
            }
        }
        System.out.printf("Numbers of student with enought poin is : " + count);
    }
}
