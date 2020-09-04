package Bölüm4.Konu3_Metod;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class return_null {
    private static final List<String> stok = new LinkedList<>();
    /*static{
        stok.add("elma");
    }*/
    //null döndürmek zahmetli iş hep kontrol yapmak isteyebilir. O yüzden collecitonlar ile çalırsak
    //Collections.EMPTY_LIST döndürmek daha mantıklı bu sayede null kontrolünden kurtulmui oluyoruz
    public static List<String> stokgetir(){

        if(stok.size()==0) return Collections.EMPTY_LIST;
    return stok;
    }

    public static void main(String[] args) {
        System.out.println(stokgetir());
    }
}
