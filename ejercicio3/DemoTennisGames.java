/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Azucena
 */
public class DemoTennisGames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoublesTennisGame TennisDoble = new DoublesTennisGame();
        
        TennisDoble.setNombreJugador1("werrer");
        TennisDoble.setNombreJugador2("Ferrer");
        TennisDoble.setPuntosFinEnt1(3);
        TennisDoble.setPuntosFinEnt2(2);
        TennisDoble.setSocio1("Gere");
        TennisDoble.setSocio2("Futy");
        
        System.out.println(TennisDoble.getNombreJugador1());
        System.out.println(TennisDoble.getNombreJugador2());
        System.out.println(TennisDoble.getPuntosFinal1());
        System.out.println(TennisDoble.getPuntosFinal2());
        System.out.println(TennisDoble.getSocio1());
        System.out.println(TennisDoble.getSocio2());
        
    }
    
}
