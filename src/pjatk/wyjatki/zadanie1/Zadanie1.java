package pjatk.wyjatki.zadanie1;

import java.io.IOException;
import java.util.Scanner;

public class Zadanie1 {
    
    public static void main(String[] args) {
        System.out.println("podaj pierwsza liczbe ");
       int a = pobierzLiczbe();
        System.out.println("podaj druga liczbe ");
       int b = pobierzLiczbe();
        System.out.println("podaj dzialanie:" +
                "+. dodawanie" +
                "-. odejmowanie" +
                "*. mnożenie" +
                "/ . dzielenie");
        String dzialanie = dzialanie();
        System.out.println(a + b);

    }
    public static void wyjatek(String tekst) throws IOException {
        throw new IOException("blad"+tekst);
    }
    public static int pobierzLiczbe(){
        Scanner scanner=new Scanner(System.in);

        try{
            String a = scanner.nextLine();
            return Integer.parseInt(a);
        }catch(NumberFormatException e){
            System.out.println("sprobuj ponownie to nie jest liczba");
            return pobierzLiczbe();
        }
    }
    public static String dzialanie(){
        Scanner scanner=new Scanner(System.in);
        try{
            String znak = scanner.nextLine();
            return znak;
        }
        catch(ArithmeticException e){
            System.out.println("nie poprawnie działanie sprobuj ponownie");
            return dzialanie();
        }
    }


}
