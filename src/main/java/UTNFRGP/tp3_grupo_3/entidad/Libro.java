package UTNFRGP.tp3_grupo_3.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="Libro")
public class Libro implements Serializable {
    @Id
    @Column
    private String isbn;

    @Column
    private String titulo;

    @Column
    private String  fechaLanzamiento;

    @Column
    private String idioma;

    @Column
    private String cantidadPaginas;

    @Column
    private String autor;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(String cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Genero> getGenero() {
        return genero;
    }

    public void setGenero(List<Genero> genero) {
        this.genero = genero;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    private String descripcion;
    private List<Genero> genero;
    private Biblioteca biblioteca;

    public Libro(String isbn, String titulo, String fechaLanzamiento, String idioma, String cantidadPaginas, String autor, String descripcion, List<Genero> genero, Biblioteca biblioteca) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.idioma = idioma;
        this.cantidadPaginas = cantidadPaginas;
        this.autor = autor;
        this.descripcion = descripcion;
        this.genero = genero;
        this.biblioteca = biblioteca;
    }


}
