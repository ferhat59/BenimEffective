package Bölüm3.Konu1_Generic;

import java.util.ArrayList;
import java.util.List;

public class GenericKullan {
//çalışma anında hata almamak için generic kullan kafan rahat olsun
    public static void main(String[] args) {
        List<String> stringList =new ArrayList<String>();
        ekle(stringList,new String("123"));
        String s= stringList.get(0);

    }
    private  static  <E> void ekle(List<E> list, E o){
        list.add(o);
    }
}
