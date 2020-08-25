package Bölüm1.Konu1_Build;

import java.math.BigDecimal;

public class Ev {
    //thread safe
    //klasik yapılandırıcı metod kullanmak efektif değil
// get set kullanıldığı zaman final devre dışı kalır thread safe olmaz efektik değil
    //builder kullanmak efektif
    private final BigDecimal fiyat;
    private final String adres;
    private final int oda;
    private final boolean havuz;
    private final boolean emmeliBanyo;
    private final boolean bahce;

    private Ev(Build build) {
        fiyat = build.fiyat;
        adres = build.adres;
        oda = build.oda;
        havuz = build.havuz;
        emmeliBanyo = build.emmeliBanyo;
        bahce = build.bahce;
    }

    public static class Build {
        //Gerekli
        private final BigDecimal fiyat;
        private final String adres;
        //Opsiyonler
        private int oda = 0;
        private boolean havuz = false;
        private boolean emmeliBanyo = false;
        private boolean bahce = false;

        public Build(BigDecimal fiyati, String adresi) {
            this.fiyat = fiyati;
            this.adres = adresi;
        }

        public Build oda(int val) {
            this.oda = val;
            return this;
        }

        public Build havuz(boolean val) {
            this.havuz = val;
            return this;
        }

        public Build emmeliBanyo(boolean val) {
            this.emmeliBanyo = val;
            return this;
        }

        public Build bahce(boolean val) {
            this.bahce = val;
            return this;
        }
        public Ev build(){
            return new Ev(this);
        }
    }
}