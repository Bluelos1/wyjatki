package pjatk.wyjatki;

public class Wyjatek {
    public static void main(String[] args) {
        try{
            int a = 100/ 0;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("koniec");
        }
        System.out.println("test");

    }
}
