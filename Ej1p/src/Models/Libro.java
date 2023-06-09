package Models;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int numPags;

    //Empty constructor
    public Libro(){

    }

    public Libro(String isbn, String titulo, String autor, int numPags){
        this.isbn=isbn;
        this.titulo=titulo;
        this.autor=autor;
        this.numPags=numPags;

    }

    //Getters and setters
    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(String isbn){
        this.isbn=isbn;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }

    public int getNumPags(){
        return numPags;
    }
    public void setNumPags(int numPags){
        this.numPags=numPags;
    }


}
