/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal1;

/**
 *
 * @author alum_tes_c
 */
public class Salvaje extends Animal1 {

    @Override
    public void correr() {
        System.out.println("El animal Salvaje corre rapido");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comer() {
        System.out.println("El animal Salvaje come rapido");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dormir() {
        System.out.println("El animal Salvaje duerme poco");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void saltar(){
        System.out.println("El animal Salvaje salta");
    }
    
}
