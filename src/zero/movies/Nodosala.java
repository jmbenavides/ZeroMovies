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
public class Nodosala {
    String nombre;
    int capacidad;
    Listasilla lsi;
    Nodosala link;


    public Nodosala(String nombre, int num){
        this.nombre=nombre;
        this.capacidad=num;
        this.lsi= new Listasilla(num);
    }    
    
    @Override
    public String toString(){
        return nombre;
    }
    
    
}
