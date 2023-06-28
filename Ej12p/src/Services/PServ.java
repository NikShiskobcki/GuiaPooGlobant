package Services;
import Models.Persona;

import java.util.Date;
import java.util.Scanner;

import static java.lang.Math.abs;

public class PServ {
    public static Persona crearPersona(){
        Scanner rd = new Scanner(System.in);

        System.out.println("Ingrese nombre");
        String name = rd.next();

        System.out.println("Ingrese el dia de nacimiento");
        int dia = rd.nextInt();

        System.out.println("Ingrese el mes de nacimiento");
        int mes = rd.nextInt();

        System.out.println("Ingrese el año de nacimiento");
        int anio = rd.nextInt();

        Date date= new Date();
        date.setDate(dia);
        date.setMonth(mes);
        date.setYear(anio);

        Persona person = new Persona(name,date);
        return person;
    }

    public static int calcularEdad(Persona p){
        Date today= new Date();

        int dif = p.getFechaNacimiento().getYear()- today.getYear();
        return abs(dif);
    }

    public static boolean menorQue(int edad, Persona p){
        if (edad>calcularEdad(p)){
            return true;
        }else{
            return false;
        }
    }

    public static void mostrarPersona(Persona p){
        System.out.println(p.getNombre());
        System.out.println(p.getFechaNacimiento());
    }


}
