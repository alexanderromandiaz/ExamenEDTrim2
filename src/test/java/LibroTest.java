package test.java;

import main.java.Libro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase Libro.
 */
class LibroTest {

    private Libro libro;

    @BeforeEach
    void setUp() {
        // Crear un libro para las pruebas
        libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967);
    }

    @Test
    void testGetTitulo() {
        // Verificar que el título es correcto
        assertEquals("Cien Años de Soledad", libro.getTitulo(), "El título del libro debería ser 'Cien Años de Soledad'.");
    }

    @Test
    void testSetTitulo() {
        // Modificar el título y verificar el cambio
        libro.setTitulo("El Amor en los Tiempos del Cólera");
        assertEquals("El Amor en los Tiempos del Cólera", libro.getTitulo(), "El título debería haber sido actualizado.");
    }

    @Test
    void testGetAutor() {
        // Verificar que el autor es correcto
        assertEquals("Gabriel García Márquez", libro.getAutor(), "El autor debería ser 'Gabriel García Márquez'.");
    }

    @Test
    void testSetAutor() {
        // Modificar el autor y verificar el cambio
        libro.setAutor("Isabel Allende");
        assertEquals("Isabel Allende", libro.getAutor(), "El autor debería haber sido actualizado.");
    }

    @Test
    void testGetAnioPublicacion() {
        // Verificar que el año de publicación es correcto
        assertEquals(1967, libro.getAnioPublicacion(), "El año de publicación debería ser 1967.");
    }

    @Test
    void testSetAnioPublicacion() {
        // Modificar el año de publicación y verificar el cambio
        libro.setAnioPublicacion(1985);
        assertEquals(1985, libro.getAnioPublicacion(), "El año de publicación debería haber sido actualizado.");
    }
}
