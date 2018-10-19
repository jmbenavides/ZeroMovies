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
public class Listasilla {
    int numsillas;
    Nodosilla ptr;
    
    
    public Listasilla(int num){
        this.numsillas=num;
        for (int i = 0; i < num; i++) {
            add(new Nodosilla(i));
        }
        
    }
    
    public void add(Nodosilla n){
        Nodosilla p=ptr;
        if(p==null){
            ptr=n;
        }else{
            while(p.link!= null){
                p=p.link;
            }
            p.link=n;
        }      
    }    
    
}
