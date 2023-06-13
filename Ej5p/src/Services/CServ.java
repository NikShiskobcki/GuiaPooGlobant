package Services;
import Models.Cuenta;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class CServ {

    public static Cuenta CrearCuenta(){
        Scanner rd= new Scanner(System.in);
        Random r = new Random();

        System.out.println("Ingrese dni");
        long dni= rd.nextLong();
        double s = 0;
        int nCuenta = r.ints(1,0, 1001).findFirst().getAsInt();

        Cuenta c = new Cuenta(nCuenta, dni,s);
        return c;
    }

    public static void Ingresar(Cuenta c, double cant){
        c.setSaldoActual(c.getSaldoActual()+cant);
    }

    public static void Retirar(Cuenta c, double cant){
        if(cant>c.getSaldoActual()){
            c.setSaldoActual(0);
        }else{
            c.setSaldoActual(c.getSaldoActual()-cant);
        }
    }

    public static boolean extraccionRapida(Cuenta c, double cant){
        if (c.getSaldoActual()*0.20>cant){
            c.setSaldoActual(c.getSaldoActual()-cant);
            return true;
        }else{
            return false;
        }
    }

    public static double consultarSaldo(Cuenta c){
        return c.getSaldoActual();
    }
    public static String consultarDatos(Cuenta c){
        String str = "";


        str = str + "Numero cuenta: "+ Integer.toString(c.getNumeroCuenta())+"\r\n";
        str = str + "DNI: " + Long.toString(c.getDni())+ "\r\n";
        str = str + "Saldo disponible: " + Double.toString(c.getSaldoActual());

        return str;
    }


}
