package Bölüm4.Konu1;

import java.io.*;

public class Seriziable {
    public static void main(String[] args) {
        person person= new person(1,"fehat","camgöz");
        person person2= new person(2,"ali","veli");
//yazma
        try ( FileOutputStream f= new FileOutputStream(new File("person.txt"));
              ObjectOutputStream o = new ObjectOutputStream(f);) {
            o.writeObject(person);
            o.writeObject(person2);

        }
        catch (Exception e ){
            System.out.println(e);
        }

        //okuma
        try (FileInputStream f= new FileInputStream(new File("person.txt"));
             ObjectInputStream o = new ObjectInputStream(f);) {
            Object o1=o.readObject();
            Object o2=o.readObject();
        //casting kullanmak çoook tehlikeli runtime da hata alınabilir.
            //seriziable kullanmak iyi değildir. Bunun yerine json kullanılabilir
            person p1=(person) o1;

        }
        catch (Exception e ){
            System.out.println(e);
        }

    }

}
class person implements Serializable {
    int yas;
    String ad;
    String soyad;

    public person(int yas, String ad, String soyad) {
        this.yas = yas;
        this.ad = ad;
        this.soyad = soyad;
    }
}