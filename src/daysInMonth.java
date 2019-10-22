import java.util.Scanner;

public class daysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String daysInMonth;
        System.out.println("moi nhap thang : ");
        int moth = sc.nextInt();

        switch (moth) {
            case 2:
                daysInMonth = "28 or 30 day ";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                daysInMonth = " 31 day";
                break;
            case 4:
            case 6:
            case 8:
            case 10:
            case 11:
            case 12:
                daysInMonth = "30 day";
                break;
            default:
                daysInMonth = "Moi nhap lai";
                break;
        }
        System.out.print(moth + " is day : " + daysInMonth);
    }
}
