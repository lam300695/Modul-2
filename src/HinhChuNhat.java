import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        float with;
        float height;
        float resual;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input with : ");
        with = scanner.nextFloat();

        System.out.printf("Input height : ");
        height = scanner.nextFloat();

        resual = with * height;
        System.out.printf("Resual is : " + resual);
    }
}
