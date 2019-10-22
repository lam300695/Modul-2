import java.util.Scanner;

public class interestMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Nhap so tien gui : ");
        double money = sc.nextDouble();

        System.out.printf("Nhap so thang gui : ");
        int moth = sc.nextInt();

        System.out.printf("Nhap lai suat : ");
        double rate = sc.nextDouble();

        double total = 0;
        for (int i = 0; i < moth; i++) {
            total = money * (rate / 12) * moth;
        }
        System.out.printf("Tien lai la : " + total);
    }
}
