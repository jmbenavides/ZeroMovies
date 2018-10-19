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
public class ZeroMovies {
    Listapelicula lp;
    Listasala ls;
    Listafuncion lf;
    Listausuario lu;
    
    public ZeroMovies(){
        
    }
    
    
    public static void main(String[] args) {
        
        administrador ad= new administrador();        
        ad.setVisible(true);
        ZeroMovies zm= new ZeroMovies();
        
        Listapelicula lp= new Listapelicula();
        Listasala ls=new Listasala();
        Listafuncion lf=new Listafuncion();
        Listausuario lu=new Listausuario();
        
       
       
    }
    
}
