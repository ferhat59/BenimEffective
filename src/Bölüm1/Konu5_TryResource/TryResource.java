package Bölüm1.Konu5_TryResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryResource {
static String ReaderLine(String path) throws IOException {
    try(BufferedReader bufferedReader= new BufferedReader(new FileReader(path))) {
return bufferedReader.readLine();
    }finally {

    }
}
}
