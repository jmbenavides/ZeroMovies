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
public class Listasilla {
    int numsillas;
    Nodosilla ptr;
    File sillas;
    
    public Listasilla(int num,int x){
        this.numsillas=num;
        for (int i = 0; i < num; i++) {
            add(new Nodosilla(i));
        }
        this.sillas=new File(x+".txt");
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
    
     public void createFile(){
        try{
        // creo el documento en caso de que este no exista y escribo en él el caracter "#" para mostrar que esta vacio
            if(!sillas.exists()){
                FileWriter fw = new FileWriter(sillas);BufferedWriter bw = new BufferedWriter(fw);
                bw.write("#");
                bw.newLine();
                bw.close();
            }
        }catch(IOException e){
            
        }
        
    }
    
    public void writeinFile(){
        try{            
            System.out.println("listpelicula write in file");
            Nodosilla p=ptr;
            if(p!=null){
                while(p!=null){   
                        System.out.println("Writeinfile p "+p.toString());
                        FileReader fr = new FileReader(sillas);BufferedReader br = new BufferedReader(fr);  
                        
                        if(br.readLine().equals("#")){
                            FileWriter fw1 = new FileWriter(sillas);BufferedWriter bw1 = new BufferedWriter(fw1);            
                            //bw1.write(p.nombre+"#"+p.genero+"#"+p.duracion+"#"+p.imagen+"#");
                            bw1.newLine();
                            bw1.close();
                            
                        }else{
                            
                            FileWriter fw = new FileWriter(sillas, true);BufferedWriter bw = new BufferedWriter(fw);
                            //bw.write(p.nombre+"#"+p.genero+"#"+p.duracion+"#"+p.imagen+"#");
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
    
    
    
}
