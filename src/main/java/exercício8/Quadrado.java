package exercício8;
public class Quadrado implements Figura {
    private double lado;

    public Quadrado (double lado){
        this.lado = lado;
    }
    public double getLado(){
        return this.lado;
    }
    public void setLado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double area = lado * lado;
        return area;
    }
}
