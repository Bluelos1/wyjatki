package pjatk.wyjatki.zadanie3;

import java.io.IOException;

public class Zadanie3 {
    public static void main(String[] args) {
        try {
            wyjatek("tekst");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("test" );
    }
    public static void wyjatek(String tekst) throws IOException {
        throw new IOException("blad"+tekst);
    }
}
