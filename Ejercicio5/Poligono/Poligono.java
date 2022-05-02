package Poligono;
public abstract class Poligono {
    private int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public String toString() {
        return "Numero de lados: " + numeroLados;
    }

    public abstract double area();
}
