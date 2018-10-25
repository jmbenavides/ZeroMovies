/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zero.movies;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Jorge Benavides
 */
public class Listapelicula {
    Nodopelicula ptr;
    File peliculas= new File("peliculas.txt");
    
    public Listapelicula(){
        
    }
    
    
    public void add(Nodopelicula n){
        Nodopelicula p=ptr;
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
        Nodopelicula ant=null;
        Nodopelicula p=ptr;
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
    
    public void delete(int n){
        Nodopelicula ant=null;
        Nodopelicula p=ptr;
        int cont=0;
        if(p!=null){
            while(p!=null && cont!=n){
                System.out.println("delete p "+p.toString());
                ant=p;
                p=p.link;
                cont++;
            }
            
            if(cont<=n && p==null){
                System.out.println(" la posicion no se encuentra dentro la lista cont:"+cont+" n:"+ n);
            }else{                
                if(cont==n){
                    if(p==ptr){
                        ptr=p.link;
                    }else{
                        System.out.println("delete ant "+ant.toString());
                        //System.out.println("p "+p.toString());
                        ant.link=p.link;
                    } 
                }
            }
        }else{
            p=null;
        }
        
               
    }
    
    public void consult(){
        Nodopelicula p=ptr;
        if(p!=null){
            while(p!=null){
                System.out.println("consulta "+p);
                p=p.link;
            }
        }else{
            System.out.println("lista de peliculas vaciasxxx");
        }
    }
    
    public void consult(String pel){
        Nodopelicula p=ptr;
        if(p!=null){
            while(p!=null && p.nombre!=pel){                
                p=p.link;
            }
            if(p.nombre==pel){
                System.out.println(p);
            }
        }else{
            System.out.println("lista de peliculas vacias");
        }
    }
    
    public void edit(int n, String npel,int o){
        Nodopelicula p=ptr;
        int cont=0;
        if(p!=null){
            while(p!=null && cont!=n){
                p=p.link;
                cont++;
            }
            if(n==cont){
                switch(o){
                    case 1: 
                        p.nombre=npel;
                    break;
                    case 2:
                        p.genero=npel;
                    break;
                    case 3:
                        p.imagen=npel;
                    break;
                }   
                
            }
        }else{
            System.out.println("la lista de peliculas esta vacia");
        }
    }
    
    public void edit(int n, int dur){
        Nodopelicula p=ptr;
        int cont=0;
        if(p!=null){
            while(p!=null && cont!=n){
                p=p.link;
                cont++;
            }
            if(cont==n){
                p.duracion=dur;
            }
        }else{
            System.out.println("la lista de peliculas esta vacia");
        }
    }
    
    public void edit(String pel,String npel, String gen, String img, int dur){
        Nodopelicula p=ptr;
        if(p!=null){
            while(p!=null && p.nombre!=pel){
                p=p.link;
            }
            if(p.nombre==pel){
                p.nombre=npel;
                //p.imagen=img;
                p.duracion=dur;
                p.genero=gen;
            }
        }else{
            System.out.println("la lista de peliculas esta vacia");
        }
    }
    
    public void createFile(){
        try{
        // creo el documento en caso de que este no exista y escribo en él el caracter "#" para mostrar que esta vacio
            if(!peliculas.exists()){
                FileWriter fw = new FileWriter(peliculas);BufferedWriter bw = new BufferedWriter(fw);
                bw.write("#");
                bw.newLine();
                bw.close();
            }
        }catch(IOException e){
            
        }
        
    }
    
    public void writeinFile(){
        try{
            
            Nodopelicula p=ptr;
            if(p!=null){
                while(p!=null){   
                        System.out.println("Writeinfile p "+p.toString());
                        FileReader fr = new FileReader(peliculas);BufferedReader br = new BufferedReader(fr);  
                        
                        if(br.readLine().equals("#")){
                            FileWriter fw1 = new FileWriter(peliculas);BufferedWriter bw1 = new BufferedWriter(fw1);            
                            bw1.write(p.nombre+"#"+p.genero+"#"+p.duracion+"#"+p.imagen+"#");
                            bw1.newLine();
                            bw1.close();
                            
                        }else{
                            
                            FileWriter fw = new FileWriter(peliculas, true);BufferedWriter bw = new BufferedWriter(fw);
                            bw.write(p.nombre+"#"+p.genero+"#"+p.duracion+"#"+p.imagen+"#");
                            bw.newLine();
                            bw.close();
                           
                        }
                    
                                      
                    p=p.link;
                }
            }else{                
                
            }
        }catch(IOException e){
            System.out.println("212");
        }
    }
    
    public void erase(){
        try{
            FileWriter fw = new FileWriter(peliculas);BufferedWriter bw = new BufferedWriter(fw);
            bw.write("#");
            bw.close();
        }catch(IOException e){
            
        }
    }
}
