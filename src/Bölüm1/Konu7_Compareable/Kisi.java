package Bölüm1.Konu7_Compareable;


import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class Kisi implements Comparable<Kisi>

        {
    final int yas;
    final String isim;

    public Kisi(int yas, String isim) {
        this.yas = yas;
        this.isim = isim;
    }

            @Override
            public String toString() {
                return "Kisi{" +
                        "yas=" + yas +
                        ", isim='" + isim + '\'' +
                        '}';
            }

            @Override
    public int compareTo(Kisi kisi) {

                int diff =this.yas-kisi.yas;
if(diff!=0) return diff;
return 0;
    }

    private static final ThreadLocalRandom THREAD_LOCAL_RANDOM= ThreadLocalRandom.current();
    private static Kisi rastgele(){
        return new Kisi(THREAD_LOCAL_RANDOM.nextInt(100),"FERHAT");
    }
    public static void main(String[] args) {
        Set<Kisi> kisiSet= new TreeSet<>();
        for (int i = 0; i < 100; i++) {
            kisiSet.add(rastgele());

        }
        kisiSet.stream().forEach(System.out::println);
    }
}
