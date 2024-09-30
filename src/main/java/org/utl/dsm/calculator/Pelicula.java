package org.utl.dsm.calculator;

public class Pelicula {
    private String titulo;
    private String genero;
    private String anio;
    private String director;

    public Pelicula() {

    }

    public Pelicula(String titulo, String genero, String anio, String director) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Titulo:'" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", anio='" + anio + '\'' +
                ", director='" + director + '\'';
    }
}
