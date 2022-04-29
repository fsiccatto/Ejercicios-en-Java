
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    
    public static void main(String[] args) throws IOException {
        // Con este codigo pedimos un número
        System.out.print("Ingrese el primer número: ");
        Integer numero1 = cargarNumero();
        
        System.out.print("Ingrese el segundo número: ");
        Integer numero2 = cargarNumero();
        
        System.out.print("Ingrese el tercer número: ");
        Integer numero3 = cargarNumero();
        
        // Con este codigo calculamos el numero mayor y el nnumero menor
        calcularNumeroMayor(numero1, numero2, numero3);
        calcularNumeroMenor(numero1, numero2, numero3);
    }
    
    /**
     * 
     * @return 
     */
    private static Integer cargarNumero() throws IOException { 
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        String strNumero = buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }
    
    /**
     * Esta funcion sirve para mostrar el calculo de un numero mayor
     * @param numero1 Es el primer numero
     * @param numero2 Es el segundo numero
     * @param numero3 Es el tercer numero
     */
    private static void calcularNumeroMayor(Integer numero1, Integer numero2, Integer numero3) {
    
        Integer numeroMayor = numero1; // Inicializamos el numero mayor con el primer numero
        
        if (numero2 > numeroMayor) {
            numeroMayor = numero2;
        }
        if (numero3 > numeroMayor) {
            numeroMayor = numero3;
        }
        
        System.out.println("El número mayor es: " + numeroMayor);
    }
    
    
    private static void calcularNumeroMenor(Integer numero1, Integer numero2, Integer numero3) {
        Integer numeroMenor = numero1; // Inicializamos el numero menor con el primer numero 
        
        if (numero2 < numeroMenor) {
            numeroMenor = numero2;
        }
        if (numero3 < numeroMenor) {
            numeroMenor = numero3;
        }
        
        System.out.println("El número menor es: " + numeroMenor);
    }
}
