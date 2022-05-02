package Poligono;
public class Triangulo extends Poligono {
    private double lado1, lado2, lado3;
    // private double semiPerimetro;

    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public double getLado3() {
        return lado3;
    }

    @Override
    public double area() {
        double semiPerimetro = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
        return area;
        
    }

    @Override
    public String toString() {
        if (lado1 == lado2 && lado2 == lado3) {
            return "Triangulo equilatero: " + super.toString() + "\nLado 1: " + lado1 + "\nLado 2: " + lado2 + "\nLado 3: " + lado3 + "\nArea: " + area();
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            return "Triangulo isosceles: " + super.toString() + "\nLado 1: " + lado1 + "\nLado 2: " + lado2 + "\nLado 3: " + lado3 + "\nArea: " + area(); 
        } else {
            return "Triangulo escaleno: " + super.toString() + "\nLado 1: " + lado1 + "\nLado 2: " + lado2 + "\nLado 3: " + lado3 + "\nArea: " + area();
        }
    }
}