package exercício8;

import java.util.ArrayList;

public class CalculadoraDeAreas{

    public static void main(String [] args){
        ArrayList < Figura > figuras = new ArrayList < > ();
        figuras.add(new Quadrado(2.0));
        figuras.add(new Triangulo(3.0,2.0));
        figuras.add(new Quadrado(3.0));
        figuras.add(new Triangulo(4.0,3.0));

        double areaTotal = 0.0;

        for (Figura f: figuras){
            areaTotal += f.calcularArea();
            System.out.println(f.calcularArea());
        }
        System.out.printf("Área total: %.1f\n", areaTotal);
    }

}
