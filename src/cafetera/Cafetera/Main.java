/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafetera.Cafetera;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guada
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cafe cafeConLeche = new Cafe ("Café con Leche");
        Cafe cafeSolo = new Cafe ("Café");
        Cafe capuccino = new Cafe ("Capuccino");
        //System.out.println("El tipo del cafe es: " + cafeConLeche.getTipoDeCafe());
        
        Recipiente recipiente1 = new Recipiente(1000, cafeConLeche, 0);
        Recipiente recipiente2 = new Recipiente(1500, cafeSolo, 0);
        Recipiente recipiente3 = new Recipiente(2000, capuccino, 0);
        
        List<Recipiente> listaDeRecipientes = new ArrayList();
        listaDeRecipientes.add(recipiente1);
        listaDeRecipientes.add(recipiente2);
        listaDeRecipientes.add(recipiente3);
        
        Cafetera cafetera1 = new Cafetera (listaDeRecipientes);

        cafetera1.mostrarOpcionesDeCafe();
        
        GananciaTotal gananciaTotal = new GananciaTotal();
        
        cafetera1.llenarRecipiente(recipiente1);
        cafetera1.llenarRecipiente(recipiente2);
        cafetera1.llenarRecipiente(recipiente3);
        
        cafetera1.prepararCafe(0, 200);
        cafetera1.prepararCafe(0, 200);
        cafetera1.prepararCafe(0, 200);
        cafetera1.prepararCafe(0, 200);
        cafetera1.prepararCafe(0, 200);
        cafetera1.prepararCafe(0, 200);
     
        cafetera1.llenarRecipiente(recipiente1);
                    
        recipiente1.vaciarRecipiente();
        
        gananciaTotal.ingresarGanancia(cafetera1.gananciaDiaria(0.05, 0.15));
        
        System.out.println(cafetera1);
        
        cafetera1.reset();
        
        cafetera1.llenarRecipiente(recipiente1);
        
        cafetera1.prepararCafe(1, 300);
        cafetera1.prepararCafe(1, 300);
        cafetera1.prepararCafe(1, 300);
        cafetera1.prepararCafe(1, 300);
        cafetera1.prepararCafe(1, 300);
        cafetera1.prepararCafe(1, 300);
        
        System.out.println("El recipiente de: " + recipiente2.getTipoDeCafe() + " tiene " + recipiente2.getCafeDisponible() + "ml.\n");
        
        
        gananciaTotal.ingresarGanancia(cafetera1.gananciaDiaria(0.05, 0.15));

        
        System.out.println("La ganancia total es de: $ " + gananciaTotal.total());
        
        
    }
    
}
