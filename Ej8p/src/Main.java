import Models.Cadena;
import Services.CServ;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);

        System.out.println("Ingrese una frase");
        String f = rd.nextLine();

        int l = f.length();

        Cadena c = new Cadena();

        c.setFrase(f);
        c.setLongitud(l);


        int cantVocales = CServ.mostrarVocales(c);
        System.out.println("En la frase "+c.getFrase()+" hay "+cantVocales+" vocales");

        System.out.println("");

        String fInvertida = CServ.invertirFrase(c);
        System.out.println(c.getFrase());
        System.out.println(fInvertida);

        System.out.println("");

        System.out.println("Ingrese un caracter a buscar");
        char x=rd.next().charAt(0);
        System.out.println("Veces que aparece "+x+": "+CServ.vecesRepetido(c,x));

        System.out.println("");

        System.out.println("Ingrese una frase para comparar");
        String str = rd.next();
        CServ.compararLongitud(c,str);

        System.out.println("");

        System.out.println("Ingrese una frase para concatenar");
        str = rd.next();
        System.out.println(CServ.unirFrases(c,str));

        System.out.println("");

        System.out.println("Ingrese un caracter para reemplazar por la letra 'a'");
        x=rd.next().charAt(0);
        System.out.println(CServ.reemplazar(c,x));

        System.out.println("");

        System.out.println("Ingrese una letra a buscar");
        x=rd.next().charAt(0);
        boolean flag = CServ.contiene(c,x);

        if (flag==true){
            System.out.println("La frase contiene el caracter");
        }else{
            System.out.println("La frase no contiene el caracter");
        }






    }
}