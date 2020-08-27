package Bölüm3.Konu2_GenericDonusum;
//yanlış sınıf tasarımı
class bellek{
    Object [] dizi;
    public bellek(int boyut){
        dizi=new Object[boyut];
    }
    public void ekle(Object eleman){
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]==null) dizi[i]=eleman;
            break;
        }

    }
    public Object cek(){
        Object a=null;
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]==null) {
                 a=dizi[i-1];
                dizi[i]=null;
                break;
            }

        }
        return a;
    }
}
//doğru kullanım runtimeda hata almayın

class dogrubellek<E>{
    E [] dizi;
    public dogrubellek(int boyut){
        dizi= (E[]) new Object[boyut];
    }
    public void ekle(E eleman){
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]==null) dizi[i]=eleman;
            break;
        }

    }
    public Object cek(){
        E a=null;
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]==null) {
                a=dizi[i-1];
                dizi[i-1]=null;
                break;
            }

        }
        return a;
    }
}

public class Test {
    public static void main(String[] args) {
        bellek bellek= new bellek(12);
        bellek.ekle(23);
        bellek.ekle(21);
        //runtime hatası verir
        String deger= (String) bellek.cek();
        System.out.println(bellek.cek());
        //dogru kullanım
        dogrubellek<Integer> integerdogrubellek= new dogrubellek<>(213);

    }
}
