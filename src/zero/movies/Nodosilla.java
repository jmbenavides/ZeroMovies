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
public class Nodosilla {
    int numero;
    boolean disponible;
    Nodosilla link;
    
    public Nodosilla(int numero){
        this.numero= numero;
        this.disponible=true;
    }
    
    @Override
    public String toString(){
       return numero+","+disponible; 
    }
    
    
}
