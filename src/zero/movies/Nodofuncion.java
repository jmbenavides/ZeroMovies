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
    int numero;
    Nodopelicula pelicula;
    Nodosala sala;
    String tipo;
    int duracion;
    Nodofuncion link;
    
    
    public Nodofuncion(String pelicula, String sala, int duracion, String tipo, int numero){
        ZeroMovies zm=new ZeroMovies();
        Nodosala s=zm.ls.ptr;
        Nodopelicula p=zm.lp.ptr;
        if(s!=null){
            while(s!=null && s.nombre!=sala){
                s=s.link;
            } 
            if(s.nombre==sala){
                this.sala=s;
            }
        }else{
            System.out.println("la sala no se encuentra");
        }
        
        if(p!=null){
            while(p!=null && p.nombre!=pelicula){
                p=p.link;
            } 
            if(p.nombre==pelicula){
                this.pelicula=p;
            }
        }else{
            System.out.println("la pelicula no se encuentra");
        }
        this.duracion=duracion;
        this.tipo=tipo;
        this.numero=numero;
    }
    
}
 