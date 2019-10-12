/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starcarrental;
import java.awt.Dimension;
import starcarrental.View.*;
/**
 *
 * @author Alejandro
 */
public class StarCarRental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Calling the entry point
        Login log =  new Login();
        //log.setPreferredSize(new Dimension(500, 500));
        /*
        log.setSize(500, 500);
        log.setMinimumSize(new Dimension(500, 0));
        log.setMaximumSize(new Dimension(500, Integer.MAX_VALUE));*/
        log.setLocationRelativeTo(null);
        log.setResizable(false);
        log.setVisible(true);
        //new starcarrental.View.Login().setVisible(true);
        
    }
    
}
