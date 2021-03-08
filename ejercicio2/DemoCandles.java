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
public class DemoCandles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Candle candle = new Candle();
        
        candle.setColor(Color.ROSA);
        candle.setHeight(5);
        
        System.out.println(candle.getColor());
        System.out.println(candle.getHeight());
        System.out.println(candle.getPrecio());
        
        ScentedCandle scent = new ScentedCandle();
        
        scent.setColor(Color.AMARRILLO);
        scent.setHeight(5);
        
        System.out.println(scent.getColor());
        System.out.println(scent.getHeight());
        System.out.println(scent.getPrecio());
        
    }
    
}
