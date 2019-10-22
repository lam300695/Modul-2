import java.util.Enumeration;
import java.util.Scanner;

public class findName {
    public static void main(String[] args) {
        String[] student = {"Lam", "Tung", "Hieu"};
        boolean check = false;

        Scanner sc = new Scanner(System.in);
        System.out.printf("Input name : ");
        String name = sc.nextLine();

        for (int i = 0; i < student.length; i++){
            if (student[i].equals(name)){
                System.out.printf("Name " + name + " is index " + (i));
                check = true;
                break;
            }
            else if(check = false) {
                System.out.printf(" Khong tim thay");
                break;
            }
        }
    }
}
