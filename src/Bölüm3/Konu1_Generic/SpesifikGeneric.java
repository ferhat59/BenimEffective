package Bölüm3.Konu1_Generic;

import java.util.ArrayList;
import java.util.List;

class madde{}
class canlı extends madde{}
class hayvan extends canlı{}
class insan extends canlı{}
public class SpesifikGeneric {
 //   madde dahil maddaden türeyen her sınıf uyar
static List<? extends madde> maddeler;
//canlı dahil canlının üst sınıfları bu kurala uyar -- canlı sınıfı ile madde sınfıı uyar --insan ve hayvan uymaz
static List<? super  canlı> canlılar;

    public static void main(String[] args) {
        maddeler= new ArrayList<insan>();
        maddeler = new ArrayList<canlı>();
        maddeler = new ArrayList<madde>();


        canlılar= new ArrayList<madde>();
        canlılar=new ArrayList<canlı>();
       // canlılar=new ArrayList<insan>();
    }
    public void basitMetod(List<? extends canlı> liste){
        madde insan= liste.get(0);
        //liste.add(new canlı());
       // --SOLİD-- LİSKOV PRENSİBİ İHLALİ TUTARSIZLIK OLUŞTURU!
    }
    public  void basitMetod2(List<? super canlı> liste){
        //buraya canlı gelebilir fakat madde de gelebilir o zaman tutarsızlık olur
        //canlı madde= liste.get(0);
        // --SOLİD-- LİSKOV PRENSİBİ İHLALİ TUTARSIZLIK OLUŞTURU!
        liste.add(new canlı());

    }

}
