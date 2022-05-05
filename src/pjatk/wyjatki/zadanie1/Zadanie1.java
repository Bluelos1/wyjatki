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
        char o = pobierzZnak();
        if(o == '+'){
            System.out.println(a+b);
        }
        if(o == '-'){
            System.out.println(a-b);
        }
        if(o == '*'){
            System.out.println(a*b);
        }
        if(o == '/'){
            System.out.println(a/b);
        }

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
    public static char pobierzZnak() {
        Scanner scanner = new Scanner(System.in);
        char o = scanner.next().charAt(0);

        if (o == '/' || o == '*' || o == '+' || o == '-') {
            return o;
        }
        System.out.println("sprobuj ponownie");
        return pobierzZnak();
    }




}
