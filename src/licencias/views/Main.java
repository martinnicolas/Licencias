/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package licencias.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

/**
 *
 * @author martin
 */
public class Main extends javax.swing.JFrame {

    private AgentesJPanel panel_agentes; 
    private LicenciasJPanel panel_licencias; 
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LicenciasPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("LicenciasPU").createEntityManager();
        agenteQuery = java.beans.Beans.isDesignTime() ? null : LicenciasPUEntityManager.createQuery("SELECT a FROM Agente a");
        agenteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : agenteQuery.getResultList();
        licenciaQuery = java.beans.Beans.isDesignTime() ? null : LicenciasPUEntityManager.createQuery("SELECT l FROM Licencia l");
        licenciaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : licenciaQuery.getResultList();
        licenciaQuery1 = java.beans.Beans.isDesignTime() ? null : LicenciasPUEntityManager.createQuery("SELECT l FROM Licencia l");
        licenciaList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : licenciaQuery1.getResultList();
        barra_menu = new javax.swing.JMenuBar();
        menu_archivo = new javax.swing.JMenu();
        menu_agentes = new javax.swing.JMenuItem();
        menu_licencias = new javax.swing.JMenuItem();
        menu_salir = new javax.swing.JMenuItem();
        menu_acerca = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Licencias");
        setMinimumSize(new java.awt.Dimension(1240, 760));
        setPreferredSize(new java.awt.Dimension(1240, 760));

        menu_archivo.setText("Archivo");

        menu_agentes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menu_agentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agentes.png"))); // NOI18N
        menu_agentes.setText("Agentes");
        menu_agentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_agentesActionPerformed(evt);
            }
        });
        menu_archivo.add(menu_agentes);

        menu_licencias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        menu_licencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/licencias.png"))); // NOI18N
        menu_licencias.setText("Licencias");
        menu_licencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_licenciasActionPerformed(evt);
            }
        });
        menu_archivo.add(menu_licencias);

        menu_salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menu_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        menu_salir.setText("Salir");
        menu_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_salirActionPerformed(evt);
            }
        });
        menu_archivo.add(menu_salir);

        barra_menu.add(menu_archivo);

        menu_acerca.setText("Acerca de");
        barra_menu.add(menu_acerca);

        setJMenuBar(barra_menu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menu_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menu_salirActionPerformed

    private void menu_agentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_agentesActionPerformed
        // TODO add your handling code here:
        System.out.println("Entro al menu Agentes");
        //Si ya está el otro Jpanel añadido al contenedor, entonces se elimina
        try{
            this.remove(panel_licencias);
            //Creamos una nueva instancia de panelHijoSuma
            panel_agentes = new AgentesJPanel();
            //Agregamos la instancia al JFrame, con un layout al centro
            this.add(panel_agentes, BorderLayout.CENTER);
            //Hacemos que el JFrame tenga el tamaño de todos sus elementos
            this.validate();
        }
        catch(Exception e){
            //Creamos una nueva instancia de panelHijoSuma
            panel_agentes = new AgentesJPanel();
            //Hacemos que el JFrame tenga el tamaño de todos sus elementos
            this.validate();
        }
    }//GEN-LAST:event_menu_agentesActionPerformed

    private void menu_licenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_licenciasActionPerformed
        // TODO add your handling code here:
        System.out.println("Entro al menu Licencias");
        //Si ya está el otro Jpanel añadido al contenedor, entonces se elimina
        try{
            this.remove(panel_agentes);
            //Creamos una nueva instancia de panelHijoSuma
            panel_licencias = new LicenciasJPanel();
            //Agregamos la instancia al JFrame, con un layout al centro
            this.add(panel_licencias, BorderLayout.CENTER);
            //Hacemos que el JFrame tenga el tamaño de todos sus elementos
            this.validate();
        }
        catch(Exception e){
            //Creamos una nueva instancia de panelHijoSuma
            panel_licencias = new LicenciasJPanel();
            //Hacemos que el JFrame tenga el tamaño de todos sus elementos
            this.validate();
        }
    }//GEN-LAST:event_menu_licenciasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager LicenciasPUEntityManager;
    private java.util.List<licencias.Agente> agenteList;
    private javax.persistence.Query agenteQuery;
    private javax.swing.JMenuBar barra_menu;
    private java.util.List<licencias.Licencia> licenciaList;
    private java.util.List<licencias.Licencia> licenciaList1;
    private javax.persistence.Query licenciaQuery;
    private javax.persistence.Query licenciaQuery1;
    private javax.swing.JMenu menu_acerca;
    private javax.swing.JMenuItem menu_agentes;
    private javax.swing.JMenu menu_archivo;
    private javax.swing.JMenuItem menu_licencias;
    private javax.swing.JMenuItem menu_salir;
    // End of variables declaration//GEN-END:variables
}
