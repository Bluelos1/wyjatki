package pjatk.wyjatki.zadanie4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        osoba();
    }
    public static void osoba(){
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.nextLine();
        String nazwisko = scanner.nextLine();
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
