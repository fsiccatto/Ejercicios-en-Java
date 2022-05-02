
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

// import Poligono.Poligono;
// import Poligono.Rectangulo;
// import Poligono.Triangulo;

//Ejercicio1: Construir un programa que calcula el area y el perimetro de un cuadrilatero dada la longitud de sus dos lados. Los valores de la longitud deberan introducirse por linea de ordenes. Si es un cuadrado, solo se proporcionara la longitud de unos de los lados al constructor.

    /* public class Ejercicio5 { //class Cuadrilatero

        //Atributos
        private double ladoA;
        private double ladoB;

        //Constructor -> para cualquier cuadrilatero, menos el cuadrado
        public Ejercicio5 (double ladoA, double ladoB){
            this.ladoA = ladoA;
            this.ladoB = ladoB;
        }

        //Constructor -> para el cuadrado
        public Ejercicio5 (double ladoA){
            this.ladoA = this.ladoB = ladoA;
        }

        public double getPerimetro(){
            double perimetro = 2 * (ladoA + ladoB);
            return perimetro;
        }

        public double getArea(){
            double area = ladoA * ladoB;
            return area;
        }

        public static void main (String[] args){
            Ejercicio5 c1;
            double ladoA, ladoB;
            ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ladoA: "));
            ladoB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ladoB: "));

            if (ladoA == ladoB){
                System.out.println("El cuadrilatero es un cuadrado.");
                c1 = new Ejercicio5(ladoA);
            } else {
                System.out.println("Es un cuadrilatero, no un cuadrado.");
                c1 = new Ejercicio5(ladoA, ladoB);
            }
            System.out.println("El perimetro es: " + c1.getPerimetro());
            System.out.println("El area es: " + c1.getArea());
        }

    }
    */




//Ejercicio2: Construir un programa que dada una serie de vehiculos caracterizzados por su marca, modelo y precio, imprima las propiedades del vehiculo mas barato. Para ello, se deberan leer por teclado las caracteristicas de cada vehiculo y crear una clase que represente a cada uno de ellos.

    /* public class Ejercicio5 {
        private String marca;
        private String modelo;
        private float precio;

        public Ejercicio5 (String marca, String modelo, float precio){
            this.marca = marca;
            this.modelo = modelo;
            this.precio = precio;
        }

        public float getPrecio(){
            return precio;
        }

        public String mostrarDatos(){
            return "Marca: " + marca + "\nModelo: " + modelo + "\nPrecio: " + precio;
        }

        //Buscamos el vehiculo mas baratovich
        public static int vehiculoMasBarato(Ejercicio5 vehiculos[]) {
            int posicion = 0;
            float precio;

            precio = vehiculos[0].getPrecio();
            for (int i = 1; i < vehiculos.length; i++) {
                if (vehiculos[i].getPrecio() < precio) {
                    precio = vehiculos[i].getPrecio();
                    posicion = i;
                }
            }
            return posicion;
        }

        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);
            try{
                int cantidadVehiculos, posicionBarato;
                float precio;
                String marca, modelo;

                System.out.print("Ingrese la cantidad de vehiculos: ");
                cantidadVehiculos = entrada.nextInt();
                System.out.println("\n");

                Ejercicio5[] vehiculos = new Ejercicio5[cantidadVehiculos];

                for (int i = 0; i < vehiculos.length; i++){
                    System.out.print("Ingrese la marca del " + (i + 1)+ "º vehiculo: ");
                    marca = entrada.next();
                    System.out.print("Ingrese el modelo del " + (i + 1)+ "º vehiculo: ");
                    modelo = entrada.next();
                    System.out.print("Ingrese el precio del " + (i + 1)+ "º vehiculo: ");
                    precio = entrada.nextFloat();
                    
                    vehiculos[i] = new Ejercicio5(marca, modelo, precio);
                    System.out.println("\n");
                }

                //Mostramos el vehiculo mas barato
                posicionBarato = vehiculoMasBarato(vehiculos);
                System.out.println("El vehiculo mas barato es: ");
                System.out.print(vehiculos[posicionBarato].mostrarDatos());

                //Mostramos los otros vehiculos
                System.out.println("\nMostrando los otros vehiculos...\n");
                for (int i = 0; i < vehiculos.length; i++) {
                    if (i == posicionBarato) {
                        continue;
                    } else{
                        System.out.print(vehiculos[i].mostrarDatos());
                    }
                }

            } finally {
                entrada.close();
            }
            
        }
    } */




//Ejercio 3: Diseñar un programa para trabajar triangulos isosceles. Para ello defina los atributos necesarios que se requieren, proporcione metodos de consulta, un metodoo constructor e implemente metodos para calcular el perimetro y el area de un triangulo que a partir de un arreglo de triangulos devuleva el area del triangulo de mayor superficie.

    /* public class Ejercicio5 {
        private double base;
        private double lado;

        public Ejercicio5(Double base, Double lado) {
            this.base = base;
            this.lado = lado;
        }

        public String mostrarDatos() {
            return "Base: " + base + "\nLado: " + lado + "\nArea: " + getArea() + "\nPerimetro: " + getPerimetro();
        }

        public double getArea() {
            double area = (base / 4) * Math.sqrt(4 * (Math.pow(lado, 2)) - Math.pow(base, 2));
            return area;
        }

        public double getPerimetro() {
            double perimetro = 2 * lado + base;
            return perimetro;
        }

        //Buscamos el triangulo de mayor area
        public static int trianguloMayorArea(Ejercicio5 triangulo[]) {
            int posicion = 0;
            double area;

            area = triangulo[0].getArea();
            for (int i = 1; i < triangulo.length; i++) {
                if (triangulo[i].getArea() > area) {
                    area = triangulo[i].getArea();
                    posicion = i;
                }
            }
            return posicion;
        }

        public static void main(String[] args) {
            double base, lado;
            int cantidadTriangulos, posicionTrianguloMayorArea;
            
            Scanner entrada = new Scanner(System.in);
            try {
                System.out.println("TRIANGULO ISOSCELES");
                System.out.print("Ingrese la cantidad de triangulos isosceles: ");
                cantidadTriangulos = entrada.nextInt();

                Ejercicio5[] triangulosIsosceles = new Ejercicio5[cantidadTriangulos];

                //Pedimos base y lado
                for (int i = 0; i < triangulosIsosceles.length; i++) {
                    System.out.println("Ingrese base < lado");
                    do {
                        System.out.print("Ingrese la base del " + (i + 1) + "º triangulo: ");
                        base = entrada.nextDouble();
                        System.out.print("Ingrese el lado del " + (i + 1) + "º triangulo: ");
                        lado = entrada.nextDouble();
                    } while (base > lado);

                    triangulosIsosceles[i] = new Ejercicio5(base, lado);
                    System.out.print("\n");
                }

                //Mostramos el triangulo de mayor area
                posicionTrianguloMayorArea = trianguloMayorArea(triangulosIsosceles);
                System.out.println("El triangulo de mayor area es: ");
                System.out.print(triangulosIsosceles[posicionTrianguloMayorArea].getArea());

                //Mostramos los otros triangulos
                for (int i = 0; i < triangulosIsosceles.length; i++) {
                    if (i == posicionTrianguloMayorArea) {
                        continue;
                    } else {
                        System.out.print(triangulosIsosceles[i].mostrarDatos());
                    }
                }
            } finally {
                entrada.close();
            }
        }
    }*/



//Ejercicio 4: Hacer un programa que calcule el area de poliginos (Triangulos y Rectangulos). El program a debe ser caapz de almacenar en un arreglo N triangulos y rectangulos, y al final mostrar el area y los datos de cada uno. Para ello se tendra:
    //Una superclase llamda Poligono, con dos sublcases Rect y Triang

    /* public abstract class Ejercicio5 {
        // Importamos ArrayList para poder trabajar con arreglos.
        // Es un arreglo de tipo dinamico.
        static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();
        static Scanner entrada = new Scanner(System.in);

        public static void main(String[] args) {
            //Llenar poligono
            llenarPoligono();

            //Mostramos poligonos
            mostrarPoligonos();
        }

        public static void llenarPoligono() {
            int opcion;
            char respuesta;
            do {
                do {
                    System.out.println("Digite el poligono que desee crear");
                    System.out.println("1. Triangulo");
                    System.out.println("2. Rectangulo");
                    System.out.println("3. Salir");
                    System.out.print("Digite una opcion: ");
                    opcion = entrada.nextInt();
                } while (opcion < 1 || opcion > 3);

                switch (opcion) {
                    case 1://Triangulo
                        llenarTriangulo();
                        break;
                    case 2://Rectangulo
                        llenarRectangulo();
                        break;
                    case 3://Salir
                        System.out.println("Saliendo...");
                        break;
                    // default: //Opcion no valida
                    //     System.out.println("Opcion no valida");
                    //     break;
                }
                System.out.println("Desea crear otro poligono? (S/N)");
                respuesta = entrada.next().charAt(0);
                System.out.println("\n");
            } while (respuesta == 'S' || respuesta == 's');
        }

        public static void llenarTriangulo() {
            double lado1, lado2, lado3;

            System.out.println("\nTRIANGULO");
            System.out.println("Ingrese los lados del triangulo");
            System.out.print("Lado 1: ");
            lado1 = entrada.nextDouble();
            System.out.print("Lado 2: ");
            lado2 = entrada.nextDouble();
            System.out.print("Lado 3: ");
            lado3 = entrada.nextDouble();

            //Creamos y guardamos el triangulo
            Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
            poligonos.add(triangulo);
        }

        public static void llenarRectangulo() {
            double lado1, lado2;

            System.out.println("\nRECTANGULO");
            System.out.println("Ingrese los lados del rectangulo");
            System.out.print("Lado 1: ");
            lado1 = entrada.nextDouble();
            System.out.print("Lado 2: ");
            lado2 = entrada.nextDouble();

            //Creamos y guardamos el rectangulo
            Rectangulo rectangulo = new Rectangulo(lado1, lado2);
            poligonos.add(rectangulo);
        }

        public static void mostrarPoligonos() {
            //Recorremos el arreglo de poligonos con un for each
            for (Poligono poli : poligonos) {
                System.out.println(poli.toString()); //Nos muestra el area tambien
                System.out.println("\n");
            }
        }
    } */

