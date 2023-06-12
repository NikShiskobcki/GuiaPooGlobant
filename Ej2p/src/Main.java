//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
//tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
//objeto.
//d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
//e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).

import Models.Circunferencia.*;
import Services.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese el radio");
        double radio = read.nextDouble();

        ServCincunferencia.crearCircunferencia(radio);

        double ar = ServCincunferencia.area(radio);
        double per = ServCincunferencia.perimetro(radio);

        System.out.println("Area: "+ar);
        System.out.println("Perimetro: "+per);

    }
}