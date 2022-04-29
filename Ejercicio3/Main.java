
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        // Con este codigo pedimos un número
        System.out.print("Ingrese el primer número: ");
        Double numero = Double.valueOf(cargarNumero());
        
        Boolean esPar = (numero % 2) == 0;
        
        // Boolean esPar = (numero / 2) == Math.round(numero / 2);
        
        if (esPar) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }

    private static Integer cargarNumero() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        String strNumero = buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }
}
