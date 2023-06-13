package Services;
import Models.Rectangulo;

import java.util.Scanner;

public class RServ {

    public static Rectangulo CrearRectangulo(){
        Scanner rd = new Scanner(System.in);

        System.out.println("Ingrese base");
        int b = rd.nextInt();
        System.out.println("Ingrese altura");
        int a = rd.nextInt();

        Rectangulo rc = new Rectangulo(b,a);
        return rc;
    }

    public static int Superficie(Rectangulo rc){
        return rc.getBase()*rc.getAltura();
    }

    public static double Area(Rectangulo rc){
        return (rc.getBase()+ rc.getAltura())*2;
    }

    public static void prntR(Rectangulo rc){
        int i,j;
        int f=rc.getAltura();
        int c=rc.getBase();

        for (i=0;i<f;i++){
            for (j=0;j<c;j++){
                if (i==0||j==0||j==c-1||i==f-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
