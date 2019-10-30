package oop.BaiThucHanh1;

public class Chicken extends Alimal implements Edible {
    @Override
    public String Eat() {
       return "Eat carrot";
    }

    @Override
    public String Sleep() {
        return "Sleep all day";
    }

    @Override
    public String Weight() {
        return "Weight 5 Kg";
    }

    @Override
    public String anDuoc() {
        return "ga an duoc";
    }
}
