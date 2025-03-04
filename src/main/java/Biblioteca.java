package main.java;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una biblioteca, que almacena una lista de libros y proporciona
 * métodos para agregar, eliminar y buscar libros.
 *
 * @author Alexander Roman Diaz (alexander.roman981@comunidadunir.net)
 * @version 2.0
 */
public class Biblioteca {
    /**
     * Lista de libros que contiene la biblioteca.
     */
    private final List<Libro> libros;

    /**
     * Constructor vacío que inicializa la lista de libros.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * Constructor que inicializa la lista de libros con una lista preexistente.
     *
     * @param libros Lista de libros con los que se inicializa la biblioteca.
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Agrega un libro a la biblioteca.
     *
     * @param libro El libro a agregar.
     * @return true si el libro fue agregado correctamente, false si no.
     */
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    /**
     * Elimina un libro de la biblioteca.
     *
     * @param libro El libro a eliminar.
     * @return true si el libro fue eliminado correctamente, false si no.
     */
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    /**
     * Obtiene la lista de libros de la biblioteca.
     *
     * @return Lista de libros de la biblioteca.
     */
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * Busca un libro en la biblioteca por su título.
     *
     * @param titulo El título del libro a buscar.
     * @return El libro si se encuentra en la biblioteca, null si no se encuentra.
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Método para buscar un libro por autor.
     *
     * @deprecated Este método ha sido reemplazado por {@link #encuentraLibrosPorAutor(String)}.
     * @param autor El autor del libro a buscar.
     * @return El primer libro que coincide con el autor, o null si no se encuentra.
     */
    @Deprecated
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Busca todos los libros de un autor en la biblioteca.
     *
     * @param autor El autor de los libros a buscar.
     * @return Una lista de libros del autor. Si no se encuentran libros, se devuelve una lista vacía.
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
