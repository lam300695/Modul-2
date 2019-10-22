package _Mang;

import java.util.Scanner;

public class InputArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

        do {
            System.out.print("Input size :");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Khong duoc lon hon 20 ");
        } while (size > 20);

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap phan tu arr " + i + ": ");
            arr[i] = sc.nextInt();
        }

        for (int arr2 : arr) {
            System.out.println("num " + arr2);
        }
        for(int j = 0; j < arr.length/2; j++){
                int temp = arr[j];
                arr[j]= arr[size -1 - j];
                arr[size - 1 - j] = temp;
        }
        System.out.println("-------------------------");
        for (int arr3 : arr){
            System.out.println("num " + arr3);
        }


    }
}