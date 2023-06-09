//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas.

import Models.Libro;
import Services.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String isbn;
        String titulo;
        String autor;
        int numPags;

        System.out.println("Ingrese isbn");
        isbn=read.next();
        System.out.println("Ingrese titulo");
        titulo=read.next();
        System.out.println("Ingrese autor");
        autor=read.next();
        System.out.println("Ingrese numero de paginas");
        numPags=read.nextInt();
        LoadBook.load(isbn,titulo,autor, numPags);

        System.out.println(PrintBook.pBook(isbn,titulo,autor, numPags));
    }
}