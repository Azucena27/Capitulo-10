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
public class TennisGame {
    
    private String nombreJugador1;
    private String nombreJugador2;
    private Integer puntosFinEnt1;
    private Integer puntosFinEnt2;
    private String puntosFinal1;
    private String puntosFinal2;

    public void jugadores(){
        this.setNombreJugador1(getNombreJugador1());
        this.setNombreJugador2(getNombreJugador2());
    }
    
    public void puntajeFinal(Integer puntosFinEnt1 ,Integer puntosFinEnt2){
        this.setPuntosFinEnt1(getPuntosFinEnt1());
        
        if(this.getPuntosFinEnt1() >= 0 && this.getPuntosFinEnt1() <= 4){
            System.out.println(this.getPuntosFinEnt1());
        }else{
            setPuntosFinal1("Error");
        }
        
        this.setPuntosFinEnt2(getPuntosFinEnt2());
        if(this.getPuntosFinEnt2() >= 0 && this.getPuntosFinEnt2() <= 4){
            System.out.println(this.getPuntosFinEnt2());
        }else{
            setPuntosFinal2("Error");
        }
        
        if(this.getPuntosFinEnt1() == 4){
             if(this.getPuntosFinEnt2() == 4){
             setPuntosFinal1("Error");
             setPuntosFinal2("Error");
            }
         }
    }
    /**
     * @return the nombreJugador1
     */
    public String getNombreJugador1() {
        return nombreJugador1;
    }

    /**
     * @param nombreJugador1 the nombreJugador1 to set
     */
    public void setNombreJugador1(String nombreJugador1) {
        this.nombreJugador1 = nombreJugador1;
    }

    /**
     * @return the nombreJugador2
     */
    public String getNombreJugador2() {
        return nombreJugador2;
    }

    /**
     * @param nombreJugador2 the nombreJugador2 to set
     */
    public void setNombreJugador2(String nombreJugador2) {
        this.nombreJugador2 = nombreJugador2;
    }

    /**
     * @return the puntosFinEnt1
     */
    public Integer getPuntosFinEnt1() {
        return puntosFinEnt1;
    }

    /**
     * @param puntosFinEnt1 the puntosFinEnt1 to set
     */
    public void setPuntosFinEnt1(Integer puntosFinEnt1) {
        this.puntosFinEnt1 = puntosFinEnt1;
    }

    /**
     * @return the puntosFinEnt2
     */
    public Integer getPuntosFinEnt2() {
        return puntosFinEnt2;
    }

    /**
     * @param puntosFinEnt2 the puntosFinEnt2 to set
     */
    public void setPuntosFinEnt2(Integer puntosFinEnt2) {
        this.puntosFinEnt2 = puntosFinEnt2;
        
    }

    /**
     * @return the puntosFinal1
     */
    public String getPuntosFinal1() {
        return puntosFinal1;
    }

    /**
     * @param puntosFinal1 the puntosFinal1 to set
     */
    public void setPuntosFinal1(String puntosFinal1) {
        this.puntosFinal1 = puntosFinal1;
    }

    /**
     * @return the puntosFinal2
     */
    public String getPuntosFinal2() {
        return puntosFinal2;
    }

    /**
     * @param puntosFinal2 the puntosFinal2 to set
     */
    public void setPuntosFinal2(String puntosFinal2) {
        this.puntosFinal2 = puntosFinal2;
    }
          
    
}
