/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafetera.Cafetera;

import java.util.List;

/**
 *
 * @author Guada
 */
public class Cafetera {
    
    private final int capacidadMaxima;
    private List<Recipiente> tipoDeCafe;
    private int cafeVendidoTotal;

    public Cafetera(List<Recipiente> tipos) {
        this.tipoDeCafe=tipos;
        this.capacidadMaxima = this.capacidadCafetera();
    }

    
    public void prepararCafe(int codigo, int cantiLitros){        
        
        Recipiente recipiente = tipoDeCafe.get(codigo);
        
        if (codigo > tipoDeCafe.size()){
            System.out.println("Elija un tipo de café válido.\n");
        }
        else{
            if (recipiente.getCafeDisponible() >= cantiLitros) {
                recipiente.setCafeDisponible(recipiente.getCafeDisponible() - cantiLitros);
                this.cafeVendidoTotal += cantiLitros;
                System.out.println("Su " + recipiente.getTipoDeCafe() + " está listo.\n");

            }
            else if (recipiente.getCafeDisponible() > 0) {
                System.out.println("Hay " + recipiente.getCafeDisponible() + " ml disponibles.\n");
                this.cafeVendidoTotal += recipiente.getCafeDisponible();
                recipiente.setCafeDisponible(0);
            }
            else {
                System.out.println("No hay café disponible. Regrese más tarde.\n");
                //llenarCafetera();
            }
        }
    }
    
    public void mostrarOpcionesDeCafe (){
        System.out.println("Las opciones de café son: ");
        for (int i = 0; i < this.tipoDeCafe.size(); i++) {
            System.out.println(tipoDeCafe.get(i).getTipoDeCafe());
        }
        System.out.println("");
    }
    
    public Double gananciaDiaria (double costo, double precio){
        Double gananciaDiaria = ((precio * cafeVendidoTotal) - (costo * cafeVendidoTotal));
        System.out.println("La ganancia del día es de: $" + gananciaDiaria + "\n");
        return gananciaDiaria;
    }
    
    public void reset(){
        this.cafeVendidoTotal = 0;
    }
    
    @Override
    public String toString(){
        return "La cafetera tiene una capacidad de " + this.capacidadMaxima + " ml.\nTiene 3 recipientes: " + this.tipoDeCafe.get(0).getTipoDeCafe() +
        ", " + this.tipoDeCafe.get(1).getTipoDeCafe() + " y " + this.tipoDeCafe.get(2).getTipoDeCafe() +
        "\nLLeva " + this.cafeVendidoTotal + " ml vendidos.\n";
    }
    
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public List<Recipiente> getTipoDeCafe() {
        return tipoDeCafe;
    }
    
    public void llenarRecipiente(Recipiente recipiente){
        recipiente.setCafeDisponible(recipiente.getCapacidad());
        System.out.println("El recipiente de: " + recipiente.getTipoDeCafe() + " está lleno con: " + recipiente.getCafeDisponible() + " ml.\n");
    }

    public void setTipoDeCafe(List<Recipiente> tipoDeCafe) {
        this.tipoDeCafe = tipoDeCafe;
    }
    
    public int getCafeVendidoTotal() {
        return cafeVendidoTotal;
    }

    public void setCafeVendidoTotal(int cafeVendidoTotal) {
        this.cafeVendidoTotal = cafeVendidoTotal;
    }
    
    public final int capacidadCafetera(){
        int capacidad = 0;
        
        for (int i = 0; i < tipoDeCafe.size(); i++) {
            capacidad += tipoDeCafe.get(i).getCapacidad();
        }        
        return capacidad;
    }
    
    
}
