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
public class TestAbstract {
     public static void main(String[] args){
      Domestico dom1=new Domestico(); 
      dom1.correr();
      dom1.comer();
      dom1.dormir();
      dom1.saltar();
      
      Salvaje salv01=new Salvaje();
      salv01.correr();
      salv01.comer();
      salv01.dormir();
      salv01.saltar();
     }
}
