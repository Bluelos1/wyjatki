package pjatk.wyjatki.zadanie5;

public class InsufficientFundsException extends Exception{
    @Override
    public String getMessage() {
        return "niewystarczajaca ilosc srodkow na koncie";
    }
}
