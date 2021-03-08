/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author Azucena
 */
public class DemoCabinRental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CabinRental renta1 = new CabinRental(2,2);
      System.out.println(renta1.getAlquiler());
      
      HolidayCabinRental renta2 = new HolidayCabinRental(2,2);
       System.out.println(renta2.getAlquiler());
    }
    
}
