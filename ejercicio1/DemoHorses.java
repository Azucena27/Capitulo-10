/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Azucena
 */
public class DemoHorses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        RaceHorse caballo = new RaceHorse();
        
        caballo.setNombre("Félix");
        caballo.setColor("Blanco");
        caballo.setAñoNaci("12/10/2001");
        caballo.setNoCarreras(6);
        
        System.out.println(caballo.getNombre());
        System.out.println(caballo.getColor());
        System.out.println(caballo.getAñoNaci());
        System.out.println(caballo.getNoCarreras());
    }
    
}
