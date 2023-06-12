package Services;
import Models.Operacion;

import java.util.Scanner;

public class OpServices {
    public static Operacion crearOperacion(){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1= read.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2= read.nextInt();

        Operacion op = new Operacion(num1,num2);
        return op;
    }

    public static int sumar(Operacion op){
        return op.getNumero1()+op.getNumero2();
    }

    public static int restar(Operacion op){
        return op.getNumero1()- op.getNumero2();
    }

    public static int multiplicar(Operacion op){
        return op.getNumero1()*op.getNumero2();
    }

    public static double dividir(Operacion op){
        if (op.getNumero2()!=0){
            return op.getNumero1()/ op.getNumero2();
        }else{
            return 0;
        }
    }

}
