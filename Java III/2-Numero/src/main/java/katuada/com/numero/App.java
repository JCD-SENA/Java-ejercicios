package katuada.com.numero;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese un numero: ");
        int numero = Integer.parseInt(input.readLine());
        if (numero>0) {
            System.out.println("El numero es mayor a 0");
        } else {
            if (numero < 0) {
                System.out.println("El numero es menor a 0");
            } else {
                System.out.println("El numero es igual a 0");
            }
        }
    }
}
