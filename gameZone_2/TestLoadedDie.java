/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_2;

/**
 *
 * @author Azucena
 */
public class TestLoadedDie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int vecesMayor = 0;
        for (int i = 0; i < 1000; i++) {
            Die dado1 = new Die();
            Die dado2 = new Die();

            if (dado1.getRandomValue() > dado2.getRandomValue()) {
                vecesMayor++;
            }
        }
        System.out.println("veces mayor dado 1 contra dado 2: "+vecesMayor);
        
        vecesMayor =0 ;
         for (int i = 0; i < 1000; i++) {
            Die dado1 = new Die();
            LoadedDie dado2 = new LoadedDie();

            if (dado1.getRandomValue() > dado2.getRandomValue()) {
                vecesMayor++;
            }
        }
        System.out.println("veces mayor dado 1 contra dado loaded: "+vecesMayor);
    }

}
