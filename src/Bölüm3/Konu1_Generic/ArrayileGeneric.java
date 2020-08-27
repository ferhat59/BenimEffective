package Bölüm3.Konu1_Generic;

import java.util.ArrayList;
import java.util.List;

public class ArrayileGeneric {
    public static void main(String[] args) {
    //dizi kullanma collection kullan
        //dizilerde generic yapılar olmadığından runtimeda hata çıkartır
        //efektif değil
        Object[] dizi= new Long[2];
        dizi[0]="merhaba";
        //efektif olan budur. generic kullamnarak  derleme zamanında hata almalıyız.
        List<Long> longs= new ArrayList<>();
       // longs.add("selam");
    }
}
