package oop;

public class HinhChuNhat {
    static int count = 0;

    public static int ChuVi(int weight, int height){
        return (weight + height) * 2;
    }

    public static void main(String[] args) {
        HinhChuNhat.count ++;
        System.out.printf("count :" + HinhChuNhat.count);
        System.out.printf("Chu vi la :" + HinhChuNhat.ChuVi(20,15));

        HinhChuNhat hinh1 = new HinhChuNhat();
        HinhChuNhat hinh2 = new HinhChuNhat();

        System.out.println("hinh 1 : " + hinh1.ChuVi(20,40));
        hinh1.count = 10;
        System.out.println("Count = " + HinhChuNhat.count);

    }
}
