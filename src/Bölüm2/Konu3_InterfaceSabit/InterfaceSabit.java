package Bölüm2.Konu3_InterfaceSabit;
//yanlış ama çalışır
public interface InterfaceSabit {
 double PI=3.14;
 double E = 2.718281828459045;

}
//efektif değil
 class ClassSabit {
 public static final double PI=3.14;
public static final double E = 2.718281828459045;

}
//en doğru olanı
enum EnumSabit{
 PI(3.14),
 E(2.71);
double aDouble;
 EnumSabit(double v) {
aDouble=v;
 }

 public static void main(String[] args) {
  System.out.println(EnumSabit.PI.aDouble);
 }
}