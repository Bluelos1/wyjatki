package pjatk.wyjatki.zadanie2;

public class Zadanie2 {
    public static void main(String[] args) {
        try {
            wyjatek("test");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void wyjatek (String tekst) {
        throw new RuntimeException("niejawny blad" + tekst);
    }
}
