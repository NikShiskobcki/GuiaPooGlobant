//Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
//de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
//programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
//Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
//ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
//0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
//20.


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        double [] arr50 = new double[50];
        double [] arr20 = new double[20];

        for (int i=0;i<50;i++){
            arr50[i]= (0+random.nextDouble() * (100-0));
        }

        for (int i=0;i<50;i++){
            System.out.println("["+arr50[i]+"] ");
        }

        //bubble sort :)
        for (int i=0;i<49;i++){
            for (int j=0;j<49;j++){
                if (arr50[j]>arr50[j+1]){
                    double aux = arr50[j];
                    arr50[j]=arr50[j+1];
                    arr50[j+1]=aux;
                }
            }
        }

        for (int i=0;i<10;i++){
            arr20[i]=arr50[i];
        }
        for (int i=10;i<20;i++){
            arr20[i]=0.5;
        }

        System.out.println("");
        for (int i=0;i<50;i++){
            System.out.println("["+arr50[i]+"] ");
        }
        System.out.println("");
        for (int i=0;i<20;i++){
            System.out.println("["+arr20[i]+"] ");
        }


    }
}



