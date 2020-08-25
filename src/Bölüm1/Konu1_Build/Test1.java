package Bölüm1.Konu1_Build;

import java.math.BigDecimal;

public class Test1 {
    public static void main(String[] args) {
        Ev ev= new Ev.Build(new BigDecimal(23),"Tekirdağ").bahce(true).emmeliBanyo(true).build();
    }
}
