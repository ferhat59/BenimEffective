package Bölüm2.Konu1_Final;

public class FinalUse {
    private final double x;
    private final double y;
//Değer objeleri--- veri tutarlığı için final kullanmak en güzeli
    //O zaman private kullanmaya ne gerek var sizce?
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public FinalUse(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
