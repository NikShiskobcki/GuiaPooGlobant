//Realizar una clase llamada Matemática que tenga como atributos dos números reales con
//los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
//constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
//Math.random para generar los dos números y se guardaran en el objeto con su
//respectivos set. Deberá además implementar los siguientes métodos:
//
//a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
//b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.
//c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.


import Models.Matematica;
import Services.MServ;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double num1, num2;
        Double min = 0.0;
        Double max = 1000.0;
        num1 = (Math.random() * ((max - min) + 1)) + min;
        num2 = (Math.random() * ((max - min) + 1)) + min;
        Matematica m = new Matematica(num1,num2);


        System.out.println("Numero 1: "+num1);
        System.out.println("Numero 2: "+num2);
        System.out.println("");

        System.out.println("Numero mayor: "+MServ.devolverMayor(m));
        System.out.println("");

        System.out.println("Potencia: "+MServ.calcularPotencia(m));
        System.out.println("");

        System.out.println("Raiz cuadrada: "+MServ.calculaRaiz(m));
    }
}