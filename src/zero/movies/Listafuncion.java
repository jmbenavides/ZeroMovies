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
public class Listafuncion {
    Nodofuncion ptr;
    
    public void add(Nodofuncion n){
        Nodofuncion p=ptr;
        if(p==null){
            ptr=n;
        }else{
            while(p.link!= null){
                p=p.link;
            }
            p.link=n;
        }      
    }    
    
    public void delete(int numero){
        Nodofuncion ant=null;
        Nodofuncion p=ptr;
        if(p!=null){
            while(p!=null && p.numero!=numero){
                ant=p;
                p=p.link;
            }
            if(p==ptr){
                ptr=p;
            }else{
                if(p.numero==numero){
                    ant.link=p.link;
                } 
            }
        }else{
            System.out.println("la lista ya esta vacia");
        }
               
    }
    
}
