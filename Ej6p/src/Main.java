//Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
//(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
//cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
//métodos:
// Constructor predeterminado o vacío
// Constructor con la capacidad máxima y la cantidad actual
//
// Métodos getters y setters.
// Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
//máxima.
// Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.
// Método vaciarCafetera(): pone la cantidad de café actual en cero.
// Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada.


import Models.Cafetera;
import Services.CServ;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);

        Cafetera cf = new Cafetera(1000, 0);
        CServ.llenarCafetera(cf);

        System.out.println("Cafetera llena "+cf.getCantidadActual());

        System.out.println("Ingrese capacidad de la taza en ml");
        int cupSize = rd.nextInt();

        int flag = CServ.servirTaza(cf, cupSize);

        if (flag == -1){
            System.out.println("Taza llena!");
        }else{
            System.out.println("NO hay suficiente cafe para llenar la taza. Taza con "+flag+"ml de cafe");
        }

        System.out.println("Cafetera despues de servir una taza "+cf.getCantidadActual());

        CServ.vaciarCafetera(cf);

        System.out.println("Cafetera vaciada "+cf.getCantidadActual());

        CServ.agregarCafe(cf, 200);

        System.out.println("Cafetera despues de agregar cafe "+cf.getCantidadActual());

    }
}