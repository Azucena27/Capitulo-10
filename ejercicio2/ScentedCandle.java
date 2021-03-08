/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Azucena
 */
public class ScentedCandle extends Candle{
    
    public static final Integer COST = 3;
    
    private Scent scent;
    
    public Scent getScent() {
        return scent;
    }

    public void setScent(Scent scent) {
        this.scent = scent;
    }

    @Override
    public Integer calcularPrecio(){
        return getHeight() * COST;
    }
}
