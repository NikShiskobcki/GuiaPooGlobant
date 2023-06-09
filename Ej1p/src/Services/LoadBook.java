package Services;

import Models.Libro;

public class LoadBook {
        public static void load(String isbn, String titulo, String autor, int numPags){
                Libro bk = new Libro(isbn,titulo,autor,numPags);
        }

}
