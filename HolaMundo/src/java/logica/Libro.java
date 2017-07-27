/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author LabingXEON
 */
public class Libro {
    private String titulo;
    private String autor;
    private int numPag;
    private int calificacion;

    public Libro(String titulo, String autor) {
        this.titulo=titulo;
        this.autor=autor;
        this.numPag=0;
        this.calificacion=0;
    }
    
    public Libro(String titulo, String autor, int numPag, int calificacion){
        this.titulo=titulo;
        this.autor=autor;
        this.numPag=numPag;
        this.calificacion=calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    
    
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", numPag=" + numPag + ", calificacion=" + calificacion + '}';
    }
    
    
    
            
}
