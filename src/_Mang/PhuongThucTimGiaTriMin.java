package _Mang;

public class PhuongThucTimGiaTriMin {
    public static int minValue(int[] arr) {
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr2 = {1, 2, 3, 4, 5};
        int index = minValue(arr2);
        System.out.println("Value min is : " + arr2[index]);
    }
}
