package pjatk.wyjatki.zadanie6;

    import javax.swing.*;

    public class Divider {
        public static void main(String[] args) {
            try {
                String number = JOptionPane.showInputDialog(null, "Podaj liczbę");
                String divider = JOptionPane.showInputDialog(null, "Podaj dzielnik");
                try {
                    int result = convertToInteger(number) / convertToInteger(divider);
                    JOptionPane.showMessageDialog(null, String.format("Wynik dzielenia to %d", result));
                }
                catch(ArithmeticException e){
                    JOptionPane.showMessageDialog(null, "nie można dzielić przez zero ");
                }
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "podano tekst nie liczbe");

            }


        }

        private static int convertToInteger(String number){
            return Integer.parseInt(number);
        }
    }


