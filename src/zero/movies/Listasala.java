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
public class Listasala {
    Nodosala ptr;   
    
    public void add(Nodosala n){
        Nodosala p=ptr;
        if(p==null){
            ptr=n;
        }else{
            while(p.link!= null){
                p=p.link;
            }
            p.link=n;
        }      
    }    
    
    public void delete(String nombre){
        Nodosala ant=null;
        Nodosala p=ptr;
        if(p!=null){
            while(p!=null && p.nombre!=nombre){
                ant=p;
                p=p.link;
            }        
        
            if(p==ptr){
                ptr=p;
            }else{
                if(p.nombre==nombre){
                    ant.link=p.link;
                } 
            }
        }else{
            System.out.println("la lista ya esta vacia");
        }
               
    }
    
    public void consult(){
        Nodosala p=ptr;
        if(p!=null){
            while(p!= null){
                Nodosilla q=p.lsi.ptr;
                while(q!=null){
                    System.out.println("sala "+p);
                    System.out.println(q+":");
                    
                    q=q.link;
                }
                
                p=p.link;
            }
        }else{
            System.out.println("lista de las salas vacia");
        }
    }
    
    public void consult(String sala){
        Nodosala p=ptr;
        if(p!=null){
            while(p!= null && p.nombre!=sala){ 
                p=p.link;
            }
            Nodosilla q=p.lsi.ptr;
            while(q!=null){
                System.out.println("sala "+p);
                System.out.println(q+":");

                q=q.link;
            }
        }else{
            System.out.println("lista de las salas vacia");
        }
    }
    
    public void edit(String sala,int numdesillas){
        Nodosala p=ptr;
        if(p!=null){
            while(p!=null && p.nombre!=sala){
                p=p.link;
            }
            if(sala==p.nombre){
                p.lsi=null;
                p.lsi=new Listasilla(numdesillas);
            }
        }else{
            System.out.println("la lista de salas esta vacia");
        }
        
    }
    
    public void edit(String sala,String nsala){
        Nodosala p=ptr;
        if(p!=null){
            while(p!=null && p.nombre!=sala){
                p=p.link;
            }
            if(sala==p.nombre){
                p.nombre=nsala;            
            }
        }else{
            System.out.println("la lista de salas esta vacia");
        }
    }
    
    public void edit(String sala,String nsala,int numdesillas){
        Nodosala p=ptr;
        if(p!=null){
            while(p!=null && p.nombre!=sala){
                p=p.link;
            }
            if(sala==p.nombre){
                p.nombre=nsala;
                p.lsi=null;
                p.lsi=new Listasilla(numdesillas);
            }
        }else{
            System.out.println("la lista de salas esta vacia");
        }
    }
}
