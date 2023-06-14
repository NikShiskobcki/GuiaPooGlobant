package Services;
import Models.Cafetera;

public class CServ {
    public static void llenarCafetera(Cafetera cf){
        cf.setCantidadActual(cf.getCapacidadMaxima());
    }

    public static int servirTaza(Cafetera cf, int cupSize){
        if (cupSize<=cf.getCantidadActual()){
            cf.setCantidadActual(cf.getCantidadActual()-cupSize);
            return -1;
        }else{
            int aux = cf.getCantidadActual();
            cf.setCantidadActual(0);
            return aux;
        }
    }

    public static void vaciarCafetera(Cafetera cf){
        cf.setCantidadActual(0);
    }

    public static void agregarCafe(Cafetera cf, int cant){
        if (cf.getCantidadActual()+cant>=cf.getCapacidadMaxima()){
            cf.setCantidadActual(cf.getCapacidadMaxima());
        }else{
            cf.setCantidadActual(cf.getCantidadActual()+cant);
        }
    }
}
