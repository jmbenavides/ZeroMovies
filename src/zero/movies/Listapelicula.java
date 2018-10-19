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
    
    public void consult(){
        Nodopelicula p=ptr;
        if(p!=null){
            while(p!=null){
                System.out.println(p);
                p=p.link;
            }
        }else{
            System.out.println("lista de peliculas vacias");
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
    
    public void edit(String pel, String npel,int o){
        Nodopelicula p=ptr;
        if(p!=null){
            while(p!=null && p.nombre!=pel){
                p=p.link;
            }
            if(p.nombre==pel){
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
    
    public void edit(String pel, int dur){
        Nodopelicula p=ptr;
        if(p!=null){
            while(p!=null && p.nombre!=pel){
                p=p.link;
            }
            if(p.nombre==pel){
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
        Nodopelicula p=ptr;
        while(p!=null){
            try{
                FileReader fr = new FileReader(peliculas);BufferedReader br = new BufferedReader(fr);
                if(br.readLine().equals("#")){
                    FileWriter fw = new FileWriter(peliculas);BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(p.nombre+"#"+p.genero+"#"+p.duracion+"#"+p.imagen+"#");
                    bw.newLine();
                    bw.close();

                }else{

                    FileWriter fw = new FileWriter(peliculas, true);BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(p.nombre+"#"+p.genero+"#"+p.duracion+"#"+p.imagen+"#");
                    bw.newLine();
                    bw.close();
                }
            }catch(IOException e){
                
            } 
            p=p.link;
        }
    }
    
    public void erase(){
        try{
        FileWriter fw = new FileWriter(peliculas);BufferedWriter bw = new BufferedWriter(fw);
        bw.write("#");
        }catch(IOException e){
            
        }
    }
}
