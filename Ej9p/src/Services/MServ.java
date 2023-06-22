package Services;
import Models.Matematica;

import static java.lang.Math.*;

public class MServ {

    public static double devolverMayor(Matematica m){
        if (m.getNum1()>m.getNum2()){
            return m.getNum1();
        }else{
            return m.getNum2();
        }
    }

    public static double calcularPotencia(Matematica m){
        long n1 = round(m.getNum1());
        long n2 = round(m.getNum2());

        if (n1>n2){
            return pow(n1,n2);
        }else{
            return pow(n2,n1);
        }
    }

    public static double calculaRaiz(Matematica m){
        double num;
        if(m.getNum1()<m.getNum2()){
            num = abs(m.getNum1());
        }else{
            num = abs(m.getNum2());
        }
        return Math.sqrt(num);
    }
}
