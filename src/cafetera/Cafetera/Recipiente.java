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
public class Recipiente {
    
    private final int capacidad;
    private Cafe tipoDeCafe;
    private int cafeDisponible;

    public Recipiente(int capacidad, Cafe tipoDeCafe, int cafeDisponible) {
        this.capacidad = capacidad;
        this.tipoDeCafe = tipoDeCafe;
        this.cafeDisponible = cafeDisponible;
    }
    
    public void vaciarRecipiente(){
        this.cafeDisponible = 0;
        System.out.println("El recipiente de: " + this.tipoDeCafe + " está vacío.\n");
    }

    public int getCapacidad() {
        return capacidad;
    }
    
    
    public Cafe getTipoDeCafe() {
        return tipoDeCafe;
    }

    public void setTipoDeCafe(Cafe tipoDeCafe) {
        this.tipoDeCafe = tipoDeCafe;
    }

    public int getCafeDisponible() {
        return cafeDisponible;
    }

    public void setCafeDisponible(int cafeDisponible) {
        this.cafeDisponible = cafeDisponible;
    }
    
   @Override
    public String toString(){
        return "El recipiente tiene una capacidad de " + this.capacidad + " ml.\nTiene " + this.tipoDeCafe + "\nTiene " + this.cafeDisponible + " ml de café disponible\n";
    }
    
}
