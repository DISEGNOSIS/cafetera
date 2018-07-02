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
public class GananciaTotal {
    
    List <Double> gananciaTotal;

    public GananciaTotal() {
        this.gananciaTotal = new ArrayList();
    }

    public List<Double> getGananciaTotal() {
        return gananciaTotal;
    }
    
    public void ingresarGanancia (Double ganancia){
        gananciaTotal.add(ganancia);
    }
    
    public Double total (){
        Double total = 0.0;
        for (Double i: gananciaTotal){
            total += i;
        }
        return total;
    }
    
}
