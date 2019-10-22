import java.util.Scanner;

public class Templr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Select;
        double TempleC, TempleF;

        System.out.println("1. TempleC to TempleF");
        System.out.println("2. TempleF to TempleC");

        System.out.println("Nhap lua chon : ");
        Select = sc.nextInt();

        switch (Select) {
            case 1:
                System.out.printf("Input Temple C : ");
                TempleC = sc. nextDouble();
                System.out.printf("Temple F is : " + cTof(TempleC));
                break;
            case 2:
                System.out.printf("Input Temple F : ");
                TempleF = sc. nextDouble();
                System.out.printf("Temple C is : " + fToc(TempleF));
                break;
        }
    }

    public static double cTof(Double TempleC) {
        double TempleF = (9 / 5) * TempleC + 32;
        return TempleF;

    }

    public static double fToc(Double TempleF) {
        double TempleC = (5 / 9) * (TempleF - 32);
        return TempleC;
    }
}
