package test.java;

import main.java.Biblioteca;
import main.java.Libro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class BibliotecaTest {

    private Biblioteca biblioteca;
    private Libro libro1;
    private Libro libro2;

    @BeforeEach
    void setUp() {
        // Crear objetos de la biblioteca y libros para las pruebas
        biblioteca = new Biblioteca();
        libro1 = new Libro("El Hobbit", "J.R.R. Tolkien", 1937);
        libro2 = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 1997);
    }

    @Test
    void testAgregarLibro() {
        // Verificar que se agrega un libro correctamente
        assertTrue(biblioteca.agregarLibro(libro1), "El libro debería agregarse correctamente.");
        assertTrue(biblioteca.getLibros().contains(libro1), "El libro debería estar en la lista de libros.");
    }

    @Test
    void testEliminarLibro() {
        // Agregar libro primero
        biblioteca.agregarLibro(libro1);
        // Verificar que se elimina un libro correctamente
        assertTrue(biblioteca.eliminarLibro(libro1), "El libro debería eliminarse correctamente.");
        assertFalse(biblioteca.getLibros().contains(libro1), "El libro debería ser eliminado de la lista.");
    }

    @Test
    void testEncuentraLibroPorTituloExistente() {
        // Agregar libro primero
        biblioteca.agregarLibro(libro1);
        // Buscar libro por título
        Libro encontrado = biblioteca.encuentraLibroPorTitulo("El Hobbit");
        assertNotNull(encontrado, "El libro debería ser encontrado por título.");
        assertEquals(libro1, encontrado, "El libro encontrado debería ser el mismo que el agregado.");
    }

    @Test
    void testEncuentraLibroPorTituloNoExistente() {
        // Buscar libro por título que no existe
        Libro encontrado = biblioteca.encuentraLibroPorTitulo("Cien años de soledad");
        assertNull(encontrado, "El libro no debería ser encontrado.");
    }

    @Test
    void testEncuentraLibrosPorAutorExistente() {
        // Agregar libros primero
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        // Buscar libros por autor
        List<Libro> encontrados = biblioteca.encuentraLibrosPorAutor("J.R.R. Tolkien");
        assertNotNull(encontrados, "La lista de libros debería ser diferente de null.");
        assertTrue(encontrados.contains(libro1), "La lista debería contener el libro de Autor1.");
    }

    @Test
    void testEncuentraLibrosPorAutorNoExistente() {
        // Agregar libros primero
        biblioteca.agregarLibro(libro1);
        // Buscar libros por autor que no existe
        List<Libro> encontrados = biblioteca.encuentraLibrosPorAutor("Isabel Allende");
        assertTrue(encontrados.isEmpty(), "La lista de libros debería estar vacía.");
    }
}

