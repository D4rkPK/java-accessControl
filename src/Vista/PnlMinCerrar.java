/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Brandon
 */
public class PnlMinCerrar extends javax.swing.JPanel {

    /**
     * Creates new form PnlMinCerrar
     */
    public PnlMinCerrar() {
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

        BtnMinimizar = new javax.swing.JButton();
        BtnCerrar = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(1, 2));

        BtnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BtnMinimizar2.png"))); // NOI18N
        BtnMinimizar.setToolTipText("Minimizar");
        BtnMinimizar.setBorder(null);
        BtnMinimizar.setBorderPainted(false);
        BtnMinimizar.setContentAreaFilled(false);
        BtnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMinimizar.setFocusable(false);
        BtnMinimizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BtnMinimizar3.png"))); // NOI18N
        BtnMinimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BtnMinimizar1.png"))); // NOI18N
        add(BtnMinimizar);

        BtnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BtnCerrar2.png"))); // NOI18N
        BtnCerrar.setToolTipText("Cerrar");
        BtnCerrar.setBorder(null);
        BtnCerrar.setBorderPainted(false);
        BtnCerrar.setContentAreaFilled(false);
        BtnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCerrar.setFocusable(false);
        BtnCerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BtnCerrar3.png"))); // NOI18N
        BtnCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BtnCerrar1.png"))); // NOI18N
        add(BtnCerrar);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnCerrar;
    public javax.swing.JButton BtnMinimizar;
    // End of variables declaration//GEN-END:variables
}