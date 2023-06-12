package Services;
import Models.Circunferencia;

public class ServCincunferencia {
    public static void crearCircunferencia(double radio){
        Circunferencia c = new Circunferencia(radio);
    }

    public static double area(double radio){
        return Math.PI*(radio*radio);
    }

    public static double perimetro(double radio){
        return 2*Math.PI*radio;
    }
}
