package pjatk.wyjatki.zadanie4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        osoba();
    }
    public static void osoba(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj imie");
        String imie = scanner.nextLine();
        System.out.println("podaj nazwisko");
        String nazwisko = scanner.nextLine();
        System.out.println("podaj rok urodzenia");
        int rokUrodzenia = scanner.nextInt();

        try{
            Osoba Maciek = new Osoba(imie,nazwisko,rokUrodzenia);
            System.out.println(Maciek.toString());
        }catch(RuntimeException e){
            System.out.println("nie udało się utworzyć nowego obiektu, z względu na błędne dane");
            System.out.println(e.getMessage());
            osoba();
        }

    }
}
