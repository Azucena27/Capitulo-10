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
public class CabinRental {
    
    private int noCabina;
    public double alquiler;
    private int noSemanas;

    public CabinRental(int noCabina, int noSemanas){
        this.noCabina = noCabina;
        switch (this.noCabina){
            case 1: 
                alquiler = 950;
                break;
            case 2: 
                alquiler = 950;
                break;
            case 3: 
                alquiler = 950;
                break;
            default: 
                alquiler = 1100;
        }
        this.alquiler = alquiler*noSemanas;
    }
    /**
     * @return the noCabina
     */
    public int getNoCabina() {
        return noCabina;
    }

    /**
     * @param noCabina the noCabina to set
     */
    public void setNoCabina(int noCabina) {
        this.noCabina = noCabina;
    }

    /**
     * @return the alquiler
     */
    public double getAlquiler() {
        return alquiler;
    }

    /**
     * @param alquiler the alquiler to set
     */
    public void setAlquiler(double alquiler) {
        this.alquiler = alquiler;
    }

    /**
     * @return the noSemanas
     */
    public int getNoSemanas() {
        return noSemanas;
    }

    /**
     * @param noSemanas the noSemanas to set
     */
    public void setNoSemanas(int noSemanas) {
        this.noSemanas = noSemanas;
    }
    
    
}
