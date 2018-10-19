/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zero.movies;

/**
 *
 * @author Jorge Benavides
 */
public class Nodopelicula {
    String nombre;
    String genero;
    String imagen;
    int duracion;
    Nodopelicula link;
    
    public Nodopelicula(String nombre, String genero, String imagen,int duracion){
        this.nombre=nombre;
        this.genero=genero;
        this.imagen=imagen;
        this.duracion=duracion;
    }
    
    public String toString(){
        return nombre+","+genero+","+imagen+","+duracion;
    }
}
