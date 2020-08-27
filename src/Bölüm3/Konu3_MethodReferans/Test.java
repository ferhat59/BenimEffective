package Bölüm3.Konu3_MethodReferans;


import java.util.HashSet;
import java.util.Set;

public class Test {
 //METOD REFENRSLARINANDA GENERİC YAPILAR KULLANILMALI. YOKSA RUNTİME DA CAST HATASI ALINABİLİR.
    public static <E> Set<E> topla(Set<E> set1 , Set<E> set2){
        Set<E> temp= new HashSet<E>(set1);
        temp.addAll(set2);
        return temp;

    }
    //referans gelen 2 değerin ortak atası üzerinden işlem yapılır.. Biraz yumuşatılmış hali
    public static <E> Set<E> topla2(Set<? extends E> set1 , Set<? extends E> set2){
        Set<E> temp= new HashSet<E>(set1);
        temp.addAll(set2);
        return temp;

    }
    public static void main(String[] args) {

    }
}
