/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;

import javax.swing.JMenuBar;

/**
 *
 * @author fx
 */
public class varias {
    public int idDataBase;
    public varias(){
        
    }
    //Deshabilitar menues
    public void deshabilitarMenues(JMenuBar menu){
        for(int i = 0; i< menu.getMenuCount();i++){
            for(int h = 0; h< menu.getMenu(i).getItemCount();h++){
                menu.getMenu(i).getItem(h).setVisible(false);
            }
        }
    } 
}