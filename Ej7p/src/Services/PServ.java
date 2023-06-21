package Services;
import Models.Persona;

import java.util.Scanner;

public class PServ {

    public static Persona crearPersona(){
        Scanner rd = new Scanner(System.in);

        System.out.println("Ingrese nombre");
        String name = rd.nextLine();

        System.out.println("Ingrese edad");
        int age = rd.nextInt();

        System.out.println("Ingrese peso en kilos");
        double weight = rd.nextDouble();

        System.out.println("Ingrese altura en metros");
        double height = rd.nextDouble();


        System.out.println("Ingrese sexo(H, M u O)");
        char s = rd.next().charAt(0);
        if (s!='M'&&s!='H'&&s!='O'){
            do {
                System.out.println("Opcion no valida. Ingrese 'H', 'M' u 'O'");
                s = rd.next().charAt(0);
            } while (s!='M'&&s!='H'&&s!='O');
        }

        Persona p = new Persona(name,age,s,weight,height);
        return p;
    }

    public static int calcularIMC(Persona p){
        double imc;
         imc = p.getPeso()/(p.getAltura()*p.getAltura());
         if (imc < 20){
             return -1;
         } else if (imc >25) {
             return 1;
         } else {
             return 0;
         }
    }

    public static boolean esMayorDeEdad(Persona p){
        if (p.getEdad()>=18){
            return true;
        }else{
            return false;
        }
    }



}
