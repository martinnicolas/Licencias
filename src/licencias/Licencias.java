/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package licencias;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import licencias.views.Main;

/**
 *
 * @author martin
 */
public class Licencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {            
            /*Defino la ventana como decorable, en caso de que quiera usar alguna decoracion*/
            JFrame.setDefaultLookAndFeelDecorated(true);
            /*Defino la apariencia de la aplicaci?n (ver substance 5.0)*/
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            /*Creo el modelo, y le digo que cree la Ventana Principal de la Aplicaci?n*/
            // TODO code application logic here
            new Main().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Licencias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Licencias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Licencias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Licencias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
