package Services;

public class PrintBook {

    public static String pBook(String isbn, String titulo, String autor, int numPags) {
        return "Libro{"+ "ISBN="+ isbn + ", Titulo=" + titulo + ", Autor=" + autor + ", Paginas=" + numPags + "}";
    }
}
