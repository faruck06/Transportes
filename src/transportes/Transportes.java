/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportes;

import com.alee.laf.WebLookAndFeel;

/**
 *
 * @author Developer
 */
public class Transportes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WebLookAndFeel.install();
        MainWindow principal = new MainWindow();
        principal.setVisible(true);
        principal.setTitle("Sistema de Información Transporte Rio Grande S.A.S.");
        principal.setIconImage(null);
    }

}
