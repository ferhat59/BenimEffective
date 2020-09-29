package Bölüm5;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ForEachUse {
    public static void main(String[] args) {
        Collection<Integer> k = Arrays.asList(1,2,34,5,67,23);
        //normal for döngüsü kullanmak çok ta efektif değil
        /*for (Iterable<Integer> i = (Iterable<Integer>) k.iterator(); i.iterator().hasNext();) {
            System.out.println(i);
        }*/
        //az efektif
        for (Integer i:
             k) {
            System.out.println(
                    i
            );
        }
        //en efektif kullanım
        k.stream().forEach(System.out::println);
    }
}
