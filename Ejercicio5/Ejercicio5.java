import javax.swing.JOptionPane;

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

    