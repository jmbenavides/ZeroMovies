/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zero.movies;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Jorge Benavides
 */

public class Listasala {
    Nodosala ptr;   
    File salas=new File("salas.txt");
    
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
                System.out.println("consult p"+ p);
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
            if(p.nombre==sala){
                System.out.println("consult p"+p);
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
            
        }else{
            System.out.println("la lista de salas esta vacia");
        }
        
    }
    
    
    public void writeinFile(){
        try{            
            Nodosala p=ptr;
            if(p!=null){
                while(p!=null){   
                        System.out.println("Writeinfile p "+p.toString());
                        FileReader fr = new FileReader(salas);BufferedReader br = new BufferedReader(fr);  
                        
                        if(br.readLine().equals("#")){
                            FileWriter fw1 = new FileWriter(salas);BufferedWriter bw1 = new BufferedWriter(fw1);            
                            bw1.write(p.nombre+"#"+p.capacidad+"#");
                            bw1.newLine();
                            bw1.close();
                            
                        }else{
                            
                            FileWriter fw = new FileWriter(salas, true);BufferedWriter bw = new BufferedWriter(fw);
                            bw.write(p.nombre+"#"+p.capacidad+"#");
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
    
    public void createFile(){
        try{
        // creo el documento en caso de que este no exista y escribo en él el caracter "#" para mostrar que esta vacio
            if(!salas.exists()){
                FileWriter fw = new FileWriter(salas);BufferedWriter bw = new BufferedWriter(fw);
                bw.write("#");
                bw.newLine();
                bw.close();
            }
        }catch(IOException e){
            
        }
        
    }
    
    
    public void erase(){
        try{
            FileWriter fw = new FileWriter(salas);BufferedWriter bw = new BufferedWriter(fw);
            bw.write("#");
            bw.close();
        }catch(IOException e){
            
        }
    }
    
}    