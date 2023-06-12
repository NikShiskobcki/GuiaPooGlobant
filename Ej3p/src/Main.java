//Crear una clase llamada Operacion que tenga como atributos privados numero1 y
//numero2. A continuación, se deben crear los siguientes métodos:
//a) Método constructor con todos los atributos pasados por parámetro.
//b) Metodo constructor sin los atributos pasados por parámetro.
//c) Métodos get y set.
//d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
//en los atributos del objeto.
//e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//f) Método restar(): calcular la resta de los números y devolver el resultado al main
//
//g) Método multiplicar(): calcular la multipicación de los números y devolver el resultado al main.
//h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

import Models.Operacion;
import Services.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Operacion op = OpServices.crearOperacion();

        System.out.println("Suma: " + OpServices.sumar(op));
        System.out.println("Resta: " + OpServices.restar(op));
        System.out.println("Multiplicacion: " + OpServices.multiplicar(op));
        if (OpServices.dividir(op)==0){
            System.out.println("No se puede dividir entre cero");
        } else{
            System.out.println("Division: " + OpServices.dividir(op));
        }


    }
}