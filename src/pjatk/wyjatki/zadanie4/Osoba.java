package pjatk.wyjatki.zadanie4;

public class Osoba {
    String imie;
    String nazwisko;
    int rokUrodzenia;

    public Osoba(String imie, String nazwisko, int rokUrodzenia) {
        sprawdzDaneOsoby(imie, nazwisko, rokUrodzenia);
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }
    @Override
    public String toString(){
        return "imie: "+imie+" nazwisko: "+ nazwisko+" rok urodzenia: "+rokUrodzenia;
    }
    public static void sprawdzDaneOsoby(String imie, String nazwisko, int rokUrodzenia ){
        if(imie.length() == 0)
        {
            throw new RuntimeException("podano niewłaściwe imie");
        }
        if( nazwisko.length() == 0){
            throw new RuntimeException("podano niewłaściwe nazwisko");
        }
        if(rokUrodzenia < 1900 || rokUrodzenia> 2020){
            throw new RuntimeException("podano niewłaściwy rok urodzenia");

        }
    }

}


