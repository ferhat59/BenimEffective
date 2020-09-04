package Bölüm4.Konu4_args;

public class argsdemo {
    //efekrif değil runtime da hata alınabilir
    static int enkucuk(int ...args){
        int sum=0;
        if(args.length==0){
            throw new IllegalStateException("hiç sayı göndermedin");
        }
        for (int arg: args
             ) {
            sum=sum+arg;
        }
        return sum;
    }
    //eğer illaki 1 tane sayı göndermek gerekirse böyle daha efektif
    static int enkucuk2(int a,int ...args){
        int sum=a;
        if(args.length==0){
            throw new IllegalStateException("hiç sayı göndermedin");
        }
        for (int arg: args
             ) {
            sum=sum+arg;
        }
        return sum;
    }
    public static void main(String[] args) {
            enkucuk();
    }
}
