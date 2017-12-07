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
public class Domestico extends Animal1{

    @Override
    public void correr() {
        System.out.println("El animal domestico corre despacio");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comer() {
        System.out.println("El animal domestico come poco");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dormir() {
        System.out.println("El animal domestico duerme moderadamente");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void saltar(){
    System.out.println("El animal Domestico salta");
    }
    
}
