/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafetera.Cafetera;

/**
 *
 * @author Guada
 */
public class Cafe {
    
    private String tipoDeCafe;

    public Cafe(String tipoDeCafe) {
        this.tipoDeCafe = tipoDeCafe;
    }

    public String getTipoDeCafe() {
        return tipoDeCafe;
    }

    public void setTipoDeCafe(String tipoDeCafe) {
        this.tipoDeCafe = tipoDeCafe;
    }
    
    
     @Override
    public String toString(){
        return this.tipoDeCafe;
    }
    
    
    
    

    

    
    
    
    
}
