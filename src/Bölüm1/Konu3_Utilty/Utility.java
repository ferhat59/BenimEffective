package Bölüm1.Konu3_Utilty;

public class Utility {
    private  Utility(){
        throw new IllegalStateException("Bu sınıftan nesne oluşturulamaz");
    }

    public static void main(String[] args) {
        Utility utility= new Utility();
        Utility.pi();
    }
    public static double pi(){
        return 3.14;
    }
}
