package Bölüm2.Konu1_Final;

public final class FinalClass {
    private final String adi;
    private final int yas;

    public FinalClass(String adi, int yas) {
        this.adi = adi;
        this.yas = yas;
    }
    //yeni obje oluşturmak her ne kadar maliyetli olsa da bilgi tutarlılığı açısından final kullanmak her zaman daha güvenli
    public FinalClass addeğistir(FinalClass finalClass,String yeniad){
        return new FinalClass(yeniad,finalClass.yas);
    }

    public static void main(String[] args) {

    }
}
