import Models.Persona;
import Services.PServ;

public class Main {
    public static void main(String[] args) {
        Persona p1 = PServ.crearPersona();
        Persona p2 = PServ.crearPersona();
        Persona p3 = PServ.crearPersona();
        Persona p4 = PServ.crearPersona();

        int imcP1, imcP2, imcP3, imcP4;

        imcP1=PServ.calcularIMC(p1);
        imcP2=PServ.calcularIMC(p2);
        imcP3=PServ.calcularIMC(p3);
        imcP4=PServ.calcularIMC(p4);

        int mayores = 0;

        if(PServ.esMayorDeEdad(p1)){
            mayores++;
        }
        if(PServ.esMayorDeEdad(p2)){
            mayores++;
        }
        if(PServ.esMayorDeEdad(p3)){
            mayores++;
        }
        if(PServ.esMayorDeEdad(p4)){
            mayores++;
        }

        int pDebajo=0, pIdeal=0, pEncima=0;

        if(imcP1==-1){
            pDebajo++;
        } else if (imcP1==0) {
            pIdeal++;
        }else{
            pEncima++;
        }

        if(imcP2==-1){
            pDebajo++;
        } else if (imcP2==0) {
            pIdeal++;
        }else{
            pEncima++;
        }

        if(imcP3==-1){
            pDebajo++;
        } else if (imcP3==0) {
            pIdeal++;
        }else{
            pEncima++;
        }

        if(imcP4==-1){
            pDebajo++;
        } else if (imcP4==0) {
            pIdeal++;
        }else{
            pEncima++;
        }

        pDebajo*=25;
        pIdeal*=25;
        pEncima*=25;

        mayores*=25;

        System.out.println("El porcentaje de personas que estan debajo de su peso es de: " + pDebajo+"%");
        System.out.println("El porcentaje de personas con el peso ideal es de: "+pIdeal+"%");
        System.out.println("El porcentaje de personas con sobrepeso es de: "+pEncima+"%");

        System.out.println("El porcentaje de mayores de edad es de: "+mayores+"%");
        System.out.println("El porcentaje de menores de edad es de: "+(100-mayores)+"%" );
    }
}