public class learnMang {
    public static void main(String[] args) {
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i * 2;
//            System.out.printf(arr[i] + " ");
//        }
//        System.out.println("arr[10] = " + arr[10]);

        String name = "Lam Tung Nguyen Hieu";
        String [] names = name.split(" ");

        for (String mName : names){
            System.out.println("name " + mName);
        }
    }
}

