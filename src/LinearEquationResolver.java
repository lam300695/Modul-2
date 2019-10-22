import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        double a, b, c, resual;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input a : ");
        a = sc.nextDouble();

        System.out.print("Input b : ");
        b = sc.nextDouble();

        System.out.print("Input c : ");
        c = sc.nextDouble();

        if (a == 0) {
            resual = -b / a;
            System.out.print("Ket qua la : " + resual);
        } else {
            if (b == 0) {
                resual = c / a;
                System.out.print("Ket qua la : " + resual);
            } else {
                System.out.print("vo nghiem");
            }
        }
    }
}
