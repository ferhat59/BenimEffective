package Bölüm2.Konu4_SOLİD.Yanlış;

public class Hesaplama {
enum Sekil{
    Daire,Dikdörtgen,Ücgen
}

final Sekil sekil;

double yaricap;
double uzunKenar;
double kisaKenar;
double taban;
double yükseklik;
Hesaplama(double yaricap){
    sekil= Sekil.Daire;
    this.yaricap=yaricap;
}
Hesaplama(float uzunKenar,double kisaKenar){
    sekil= Sekil.Dikdörtgen;
    this.uzunKenar=uzunKenar;
    this.kisaKenar=kisaKenar;
}
Hesaplama(double yükseklik,double taban){
    sekil=Sekil.Daire;
    this.yükseklik=yükseklik;
    this.taban=taban;
}
// daha fazla case yazmakatn sıkıldım....
double hesaplamametod(){
    switch (sekil){
        case Daire: return Math.PI*yaricap*yaricap;
        default: throw new AssertionError();
    }
}
    public static void main(String[] args) {
            Hesaplama hesaplama = new Hesaplama(12,15);
        System.out.println( hesaplama.hesaplamametod());
    }

}
