public class FindMaxValueInArray {
    public static void main(String[] args) {
        int[] Arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int max = Arr[5];

        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] > max) {
                max = Arr[i];
            }
        }
        System.out.printf("Max is : " + max);
    }
}
