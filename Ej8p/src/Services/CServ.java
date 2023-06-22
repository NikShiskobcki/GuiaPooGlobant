package Services;
import Models.Cadena;
public class CServ {
    public static int mostrarVocales(Cadena c){
        char[] strC = c.getFrase().toCharArray();
        char[] v = {'a','e','i','o','u'};
        int vocales = 0;

        for (int i=0; i<c.getLongitud();i++){
            for (int j=0;j<4;j++){
                if (strC[i]==v[j]){
                    vocales++;
                    break;
                }
            }
        }
        return vocales;
    }

    public static String invertirFrase(Cadena c){
        String str = c.getFrase();
        String aux = "";
        char chr;
        for (int i=0; i<c.getLongitud();i++){
            chr=str.charAt(i);
            aux = chr+aux;
        }
        return  aux;
    }

    public static int vecesRepetido(Cadena c, char x){
        int cont = 0;

        for (int i=0;i<c.getLongitud();i++){
            if (c.getFrase().charAt(i)==x){
                cont++;
            }
        }
        return cont;
    }

    public static void compararLongitud(Cadena c, String str){
        if (str.length()<c.getLongitud()){
            System.out.println("La frase ingresada es mas corta que la frase de la clase");
        }else if (str.length()==c.getLongitud()){
            System.out.println("La frase ingresada es del mismo tamaño que la frase de la clase");
        }else{
            System.out.println("La frase ingresada es mas larga que la frase de la clase");
        }
    }

    public static String unirFrases(Cadena c, String str){
        str = c.getFrase()+str;
        return str;
    }

    public static String reemplazar(Cadena c, char x){
        char[] str = c.getFrase().toCharArray();
        String s="";
        for (int i=0;i<c.getLongitud();i++){
            if (str[i]=='a'){
                str[i]=x;
            }
            s+=str[i];
        }

        return s;
    }

    public static boolean contiene(Cadena c, char x){
        boolean flag=false;
        int i = 0;
        while (flag==false&&i<c.getLongitud()){
            if (c.getFrase().charAt(i)==x){
                flag=true;
                break;
            }
            i++;
        }
        return flag;
    }
}
