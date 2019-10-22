import java.util.Scanner;

public class FindMinValueArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        int min = arr[6];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
                System.out.printf("Min is : " + min + " index is : " + i );
                break;
            }
        }
    }
}
