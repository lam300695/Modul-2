import java.util.Scanner;

public class NumSimple {
    public static void main(String[] args) {
        boolean total = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input num : ");
        int num = sc.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                total = true;
                break;
            }
            total = false;
        }
        if (total == true) {
            System.out.println(num + " Khong phai so nguyen to ");
        } else {
            System.out.println(num + " La so nguyen to ");
        }
    }
}
