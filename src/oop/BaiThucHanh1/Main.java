package oop.BaiThucHanh1;

public class Main {
    public static void main(String[] args) {
        Alimal [] alimals = new Alimal[2];
        alimals[0] = new Tiger();
        alimals[1] = new Chicken();

        for (Alimal alimal : alimals){
            System.out.println(alimal.Sleep());
            System.out.println(alimal.Eat());
        }

    }
}
