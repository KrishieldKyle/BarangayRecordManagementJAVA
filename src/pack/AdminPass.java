/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

/**
 *
 * @author Administrator
 */
public class AdminPass extends javax.swing.JPanel {

    
    public AdminPass() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        oldPw = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        newPw = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        newPw2 = new javax.swing.JPasswordField();

        setPreferredSize(new java.awt.Dimension(304, 176));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setText("Change Admin Password");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 299, 31);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Old Password");
        add(jLabel2);
        jLabel2.setBounds(50, 50, 90, 30);
        add(oldPw);
        oldPw.setBounds(140, 50, 150, 30);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("New Password");
        add(jLabel3);
        jLabel3.setBounds(50, 100, 90, 30);
        add(newPw);
        newPw.setBounds(140, 100, 150, 30);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Re-Type New Password");
        add(jLabel4);
        jLabel4.setBounds(0, 140, 140, 30);
        add(newPw2);
        newPw2.setBounds(140, 140, 150, 30);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JPasswordField newPw;
    public static javax.swing.JPasswordField newPw2;
    public static javax.swing.JPasswordField oldPw;
    // End of variables declaration//GEN-END:variables
}