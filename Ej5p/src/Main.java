//Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
//numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (doble).
//Las operaciones asociadas a dicha clase son:
//a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
//b) Agregar los métodos getters y setters correspondientes
//c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
//d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
//y se la sumara a saldo actual.
//e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
//la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//pondrá el saldo actual en 0.
//f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
//usuario no saque más del 20%.
//g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta

import Models.Cuenta;
import Services.CServ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        Cuenta c = CServ.CrearCuenta();

        System.out.println("Ingrese cantidad a depositar");
        double cant = rd.nextDouble();

        CServ.Ingresar(c, cant);

        System.out.println("Ingrese cantidad a retirar");
        cant = rd.nextDouble();


        System.out.println("Ingrese cantidad a retirar express (menos del 20%)");
        cant = rd.nextDouble();
        boolean flag = CServ.extraccionRapida(c,cant);
        if (flag){
            System.out.println("Extraccion exitosa");
        } else{
            System.out.println("Extraccion fallida. Cantidad a retirar es mayor al 20% del saldo");
        }

        double sald = CServ.consultarSaldo(c);
        System.out.println("Saldo disponible: " + sald);

        String str = CServ.consultarDatos(c);
        System.out.println(str);
    }
}