/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportes;

//import emab.admon.Adm_empleados;
//import emab.admon.Adm_vehiculos;
import java.awt.Image;
import javax.swing.JPanel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import transportes.view.Administracion.Frm_Usuario_Proyecto;
import transportes.view.Facturacion.frm_Ingreso_Reporte_C;

/**
 *
 * @author Developer
 */
public class MainWindow extends javax.swing.JFrame {

    boolean estado_Menu;
    String rol_usuario;
    public static final int V_HEIGHT = 611;
    public static final int V_WIDTH = 1057;

    public MainWindow(Boolean estado) {

//        if (estado) {
//            cambiarVentana();
//        }
    }

    public MainWindow() {

        initComponents();
        Fondo fondo = new Fondo();
        abrir_ventana(fondo);
//        ventanaInicial();
//        quitar_icono();
    }

//    private void ventanaInicial() {
//        FondoIndex.removeAll();
//        final Navegacion navegacion = new Navegacion();
//        navegacion.setBounds(0, 0, V_WIDTH, V_HEIGHT);
//        FondoIndex.add(navegacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
//        ocultar_Admon();
//        ocultar_reportes();
//        navegacion.addButton1ActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                rol_usuario = navegacion.consultar2();
//                if (rol_usuario.equals("")) {
//                    setEstado(false);
//                } else {
//                    setEstado(true);
//                }
//                //setEstado(navegacion.consultar());
//            }
//        });
//    }
    public void abrir_ventana(JPanel panel) {
        FondoIndex.removeAll();
        panel.setBounds(0, 0, V_WIDTH, V_HEIGHT);
        FondoIndex.add(panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoIndex = new javax.swing.JLayeredPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setResizable(false);

        FondoIndex.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FondoIndex.setPreferredSize(new java.awt.Dimension(1004, 680));

        javax.swing.GroupLayout FondoIndexLayout = new javax.swing.GroupLayout(FondoIndex);
        FondoIndex.setLayout(FondoIndexLayout);
        FondoIndexLayout.setHorizontalGroup(
            FondoIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1065, Short.MAX_VALUE)
        );
        FondoIndexLayout.setVerticalGroup(
            FondoIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );

        jMenu1.setText("Inicio");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Administración");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Facturación");

        jMenuItem2.setText("Ingreso Diario");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoIndex, javax.swing.GroupLayout.DEFAULT_SIZE, 1067, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoIndex, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        frm_Ingreso_Reporte_C frm = new frm_Ingreso_Reporte_C();
        abrir_ventana(frm);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

//    private void quitar_icono() {
//        Image icon = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB_PRE);
//        this.setIconImage(icon);
//    }
    public void setIconImage(Image image) {
        ArrayList<Image> imageList = new ArrayList<Image>();
        if (image != null) {
            imageList.add(image);
        }
        setIconImages(imageList);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane FondoIndex;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
