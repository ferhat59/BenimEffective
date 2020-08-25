package Bölüm1.Konu6_EqualsandHashMap;

import java.util.HashMap;
import java.util.Objects;

public class EqualsAndHascode {
    final String ad;
   final int yas;
    public EqualsAndHascode(String ad,int yas){
        this.ad=ad;
        this.yas=yas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsAndHascode that = (EqualsAndHascode) o;
        return yas == that.yas &&
                Objects.equals(ad, that.ad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ad, yas);
    }

    public static void main(String[] args) {
        HashMap<EqualsAndHascode,String> equalsAndHascodeStringHashMap = new HashMap<>();
        equalsAndHascodeStringHashMap.put(new EqualsAndHascode("ferhat",21),"ferhat");
        equalsAndHascodeStringHashMap.put(new EqualsAndHascode("ali",21),"ali");
        System.out.println(equalsAndHascodeStringHashMap.get(new EqualsAndHascode("ferhat",21)));
    }
}
