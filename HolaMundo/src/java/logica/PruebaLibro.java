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
public class PruebaLibro {
    public static void main(String[] args) {
        ConjuntoLibros libros=new ConjuntoLibros();
        Libro l1=new Libro("Alice in Wonderland","Lewis Carroll | FreeBoo",320,8);
        libros.AñadirLibros(l1);
        l1=new Libro("El método Lean Startup","Eric Ries",700,7);
        libros.AñadirLibros(l1);
        System.out.println(libros.toString());
        libros.Mayor();
        libros.Menor();
        libros.ModificarCalificacion("El método Lean Startup",8);
        libros.AñadirLibros(new Libro("Alice in Wonderland","Lewis Carroll | FreeBoo",320,8));
        System.out.println(libros.toString());
    }
}
