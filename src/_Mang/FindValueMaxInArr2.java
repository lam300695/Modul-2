package _Mang;

import java.util.Scanner;

public class FindValueMaxInArr2 {
    public static void main(String[] args) {

//        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
//        int max = arr[0][0];
//        int index = 0;
//        int jndex = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] > arr[0][0]) {
//                    max = arr[i][j];
//                    index = i;
//                    jndex = j;
//                }
//            }
//        }
//        System.out.printf("Max value is :" + max + " , " + "arr[" + index + "][" + jndex + "]");

        Scanner sc = new Scanner(System.in);
        int sizei, sizej;

        do {
            System.out.printf("Input sizei :");
            sizei = sc.nextInt();
            if (sizei > 3) {
                System.out.printf("Max is 3");
            }
        } while (sizei >= 3);

        do {
            System.out.printf("Input sizej :");
            sizej = sc.nextInt();
            if (sizej > 3) {
                System.out.printf("j Max is 3");
            }
        } while (sizej >= 3);

        int[][] arr = new int[sizei][sizej];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Input arr" + i + j + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.printf(" " + arr);
    }
}

