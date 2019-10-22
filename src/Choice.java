import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Ve hinh chu nhat");
        System.out.println("2. Ve hinh vuong");
        System.out.println("3. Ve hinh tam giac");
        System.out.println("0. Thoat");

        System.out.println("Nhap lua chon : ");
        num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("Hinh chu nhat");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
                break;
            case 2:
                System.out.println("Hinh vuong");
                System.out.println("*****");
                System.out.println("*****");
                System.out.println("*****");
                System.out.println("*****");
                System.out.println("*****");
                break;
            case 3:
                System.out.println("*");
                System.out.println("**");
                System.out.println("***");
                System.out.println("*****");
                System.out.println("******");
                break;
            default:
                System.out.println("Exit");
                break;
        }

    }
}
