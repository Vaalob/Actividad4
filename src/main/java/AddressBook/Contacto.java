package AddressBook;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

    public class Contacto {

        private final Scanner sc;

        public Contacto() {
            sc = new Scanner(System.in);
            sc.useDelimiter("\n");
            sc.useLocale(Locale.US);
        }

        public double telefono(String mensaje) {

            double num = 0;
            boolean correcto;
            do {
                correcto = true;
                try {
                    System.out.println(mensaje);
                    num = sc.nextDouble();
                } catch (InputMismatchException ex) {
                    correcto = false;
                    sc.next();
                }
                if (!correcto) {
                    System.out.println("Error, introducce un numero entero integer");
                }

            } while (!correcto);

            return num;
        }

        public String pedirString(String mensaje) {

            System.out.println(mensaje);
            String cadena = sc.next();

            return cadena;
        }

    }
