package Bölüm6;

import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<String> alfabe = Arrays.asList("b","d","c");
        //en efektif yol en kısa yoldur "fc".
        alfabe.sort(String::compareTo);
        System.out.println(alfabe);
    }
}
