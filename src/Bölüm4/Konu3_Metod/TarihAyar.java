package Bölüm4.Konu3_Metod;

import java.util.Date;

public final class TarihAyar {
private final Date start;
private final Date end;


public TarihAyar(Date start,Date end) {
   //effektif değil
    /*this.start=start;
    this.end=end;*/
    //efektif
    this.start=new Date(start.getTime());
    this.end=new Date(end.getTime());
}

    @Override
    public String toString() {
        return "TarihAyar{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
class deneme{
    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        TarihAyar ayar = new TarihAyar(start,end);
        //gönderilen referans daha sonradan değiştirilebilir daha güvenli çalışması için yukarıda new yapılamsı doğru olur
        end.setYear(55);
        System.out.println(ayar);

    }
}
