package _Mang;

import java.sql.Array;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int CAPACITY = 10;
    private Object element [];

    public MyList(){
        element = new Object[CAPACITY];
    }

    private void ensureCapa(){
        int newSize = element.length * 2 ;
        element = Arrays.copyOf(element,newSize);
    }

    public void add(E e){
        if (size == element.length){
            ensureCapa();
        }
            element[size++] = e;
    }


}
