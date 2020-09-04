package Bölüm4.Konu3_Metod;

class a{
    static void soyle(){
        System.out.println("a söyle");
    }
}
class b extends  a{
    //efektif değil
    static void soyle(){
        System.out.println("b söyle");
    }
}
class c extends a{
    //efektif
   // @Override
    static void soyle(){
        System.out.println("c söyle");
    }
}

public class Staticuse {
    public static void main(String[] args) {
        a[] dizi={new a(),new b(),new c()};
        //static metodlar ovvirda edilmez ancak @ovvirede anatosyonu kullanmazsak üst sınıfın metodu çağırılır
        //@ anatosoyon kullanırsak hata alırız durumu çözebiliriz
        for (a r: dizi)
         {r.soyle();

        }
    }
}
