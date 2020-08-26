package Bölüm2.Konu2_Kalıtım;

import java.util.Date;

public class AltSınıf extends üstSınıf {
    private  final Date date;

    public AltSınıf() {
        this.date = new Date();
    }

    @Override
    public void ezilenmetod() {
        System.out.println(date);
    }

    public static void main(String[] args) {
        AltSınıf altSınıf= new AltSınıf();
        altSınıf.ezilenmetod();
    }
}
