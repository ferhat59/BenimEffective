package Bölüm1.Konu2_Singelton;

public enum  Singelton_Enum {
    //en güzel singelton enum ile yapılır
INSTENECE;
    public void write(){
            System.out.println("write");
    }

    public static void main(String[] args) {
        Singelton_Enum singelton_enum= Singelton_Enum.INSTENECE;
        Singelton_Enum singelton_enum2= Singelton_Enum.INSTENECE;
        singelton_enum.write();
        System.out.println(singelton_enum.hashCode() +" "+ singelton_enum2.hashCode());
    }
}
