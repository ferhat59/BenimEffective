package Bölüm1.Konu4_Primative;

public class PrimetivePerformans {
    public static void main(String[] args) {
//Performans için her zaman primitive versiyonları kullan örnek:Integer kullanma int kullan
        long sum =0L;

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum +=i;
        }
    }
}
