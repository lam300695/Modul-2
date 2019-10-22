import java.util.Scanner;

public class RedNum {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input num : ");
        num = sc.nextInt();

        if (num >= 0 && num < 10) {
            switch (num){
                case 0:
                    System.out.printf("Khong");
                    break;
                case 1:
                    System.out.printf("Mot");
                    break;
                case 2:
                    System.out.printf("Hai");
                    break;
                case 3:
                    System.out.printf("Ba");
                    break;
                case 4:
                    System.out.printf("Bon");
                    break;
                case 5:
                    System.out.printf("Nam");
                    break;
                case 6:
                    System.out.printf("Sau");
                    break;
                case 7:
                    System.out.printf("Bay");
                    break;
                case 8:
                    System.out.printf("Tam");
                    break;
                case 9:
                    System.out.printf("Chin");
                    break;
                default:
                    System.out.printf("out of ability");
                    break;
            }
        }
        else if (num >= 10 && num < 20){
            switch (num){
                case 0:
                    System.out.printf("teen");
                    break;
                case 1:
                    System.out.printf("eleven");
                    break;
                case 2:
                    System.out.printf("twell");
                    break;
                case 3:
                    System.out.printf("thirr teen");
                    break;
                case 4:
                    System.out.printf("for teen");
                    break;
                case 5:
                    System.out.printf("five teen");
                    break;
                case 6:
                    System.out.printf("six teen");
                    break;
                case 7:
                    System.out.printf("sevent teen");
                    break;
                case 8:
                    System.out.printf("eight teen");
                    break;
                case 9:
                    System.out.printf("nine teen");
                    break;
                default:
                    System.out.printf("out of ability");
                    break;
            }
        }
    }

}
