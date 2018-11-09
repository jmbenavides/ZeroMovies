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
public class Nodofuncion {
    int numero=0;
    String pelicula;
    String sala;
    String tipo;
    String horain;
    Nodofuncion link;
    Listasilla ls;
    int c=0;
    
    
    public Nodofuncion(String pelicula, String sala, String horain, String tipo){
        
        this.pelicula=pelicula;
        this.sala=sala;
        this.horain=horain;
        this.tipo=tipo;
        this.numero=c;
        c++;
    }
    
}
 