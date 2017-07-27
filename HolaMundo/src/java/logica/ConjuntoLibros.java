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
public class ConjuntoLibros {
    private Libro[] libros;
    private int cantidad;

    public ConjuntoLibros() {
        this.cantidad=0;
        this.libros=new Libro[10];
    }
    
    public void AñadirLibros(Libro a){
        boolean b=false;
        for(int i=0;i<cantidad;i++){
           if(a.getAutor().equals(libros[i].getAutor()) && a.getTitulo().equals(libros[i].getTitulo())){
                b=true;
                break;
            }
        }
        if(!b && cantidad<10){
            libros[cantidad]=a;
            cantidad++;
        }else{
            System.out.println("No se puede hacer");
        }
    }
    
    public String Mayor(){
        Libro mayor=libros[0];
        for(int i=0;i<cantidad;i++){
            Libro l=libros[i];
            if(l.getCalificacion()>mayor.getCalificacion()){
                mayor=l;
            }
        }
        return ("El libro con la mayor calificación es: "+mayor);
    }

    public String Menor(){
        Libro menor=libros[0];
        for(int i=0;i<cantidad;i++){
            Libro l=libros[i];
            if(l.getCalificacion()<menor.getCalificacion()){
                menor=l;
            }
        }
        return ("El libro con la menor calificación es: "+menor);
    }
    
    public void ModificarCalificacion(String a, int cal) {
        for(int i=0;i<cantidad;i++){
            Libro l=libros[i];
            if(l.getTitulo().equals(a)){
                l.setCalificacion(cal);
                break;
            }
        }
    }
    
    @Override
    public String toString() {
        String s="Libros: \n";
        for(int i=0;i<cantidad;i++){
            s+=""+libros[i].getTitulo()+", "+libros[i].getAutor()+", "+libros[i].getNumPag()+", "+libros[i].getCalificacion()+"\n";
        }
        return s; //To change body of generated methods, choose Tools | Templates.
    }


    
    

}
