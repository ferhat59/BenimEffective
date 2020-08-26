package Bölüm2.Konu2_Kalıtım;

import java.util.Collection;
import java.util.TreeSet;
import java.util.Arrays;
//bilmediğin sınıftan türetme yapma!

public class Kalıtım<E> extends TreeSet<E> {
private int sayac=0;
public boolean add(E e){
    sayac++;
    return  super.add(e);
}

    @Override
    public boolean addAll(Collection<? extends E> c) {
       sayac+=c.size();
        return super.addAll(c);
    }

    public static void main(String[] args) {
        //Her elaman eklendiğinde hem bizim sınıfımızda hemde üst sınıfta addCount arttığı için ekrana 6 değil 12 yazar
        Kalıtım<Integer> integers = new Kalıtım<>();
        integers.addAll(Arrays.asList(123,453,1,546,64,234));
        System.out.println(integers.sayac);
    }
}
