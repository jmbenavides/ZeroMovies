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
public class Funcion {
    
    int HourtoMin(String t){
        int suma=0;
        t=t+":";
        suma=suma+Integer.parseInt(dividir(t,":",0))*60;
        suma=suma+Integer.parseInt(dividir(t,":",1));
        
        return suma;
    }
    
    public String dividir(String x,String z,int y){
        int  c=0;    
        int i=0;
        String parte="";        
        while( i<x.length() && c<=y){
            if(z.equals(x.substring(i, i+1))){                
                parte=x.substring(0,i);
                x=x.substring(i+1, x.length());
                i=0;
                c++;
            }
            i++;
            
        }
        
        return parte;
    }
    
            
}
