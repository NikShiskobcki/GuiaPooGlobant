//En este ejercicio deberemos instanciar en el main, una fecha usando la clase
//Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
//usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
//deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
//se puede conseguir instanciando un objeto Date con constructor vacío.

import java.util.Date;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);

        System.out.println("Ingrese el dia");
        int dia = rd.nextInt();

        System.out.println("Ingrese el mes");
        int mes = rd.nextInt();

        System.out.println("Ingrese el año");
        int anio = rd.nextInt();

        Date date1= new Date();
        date1.setDate(dia);
        date1.setMonth(mes);
        date1.setYear(anio);

        Date today= new Date();

        System.out.println(date1);
        int dif = date1.getYear()- today.getYear();

        System.out.println("Hay "+abs(dif)+" años de diferencia");
    }
}