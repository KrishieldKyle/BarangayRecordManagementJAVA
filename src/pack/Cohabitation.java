/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import java.io.File;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.filechooser.FileSystemView;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import static pack.Dashboard.flag;
import static pack.Dashboard.indexes;
import static pack.Dashboard.searchIndex;

/**
 *
 * @author Justine
 */
public class Cohabitation extends javax.swing.JFrame {

    private static File home = FileSystemView.getFileSystemView().getHomeDirectory();
    private static String DIR = home.getAbsolutePath();
    String name = "justine", address = "" ,father="",mother="",stat="",gender="";
    int age;
    String bday = "";

    Date dat = new Date();
    SimpleDateFormat sf = new SimpleDateFormat("MMMM dd, yyyy");
    String date = sf.format(dat);
    
    /**
     * Creates new form Cohabitation
     */
    public Cohabitation() {
        initComponents();
         this.setResizable(false);
        this.setTitle("Cohabitation");
//        if (flag == false) {
//            name = Variables.Fullname.get(searchIndex);
//            bday = (String) Variables.Birthday.get(searchIndex);
//            address = (String) Variables.FullAddress.get(searchIndex);
//            father = (String) Variables.FullnameFather.get(searchIndex);
//            mother = (String) Variables.FullnameMother.get(searchIndex);
//            gender = (String) Variables.Gender.get(searchIndex);
//
//        } else {
//            name = Variables.Fullname.get(indexes.get(searchIndex));
//            bday = (String) Variables.Birthday.get(indexes.get(searchIndex));
//            address = (String) Variables.FullAddress.get(indexes.get(searchIndex));
//            father = (String) Variables.FullnameFather.get(indexes.get(searchIndex));
//            mother = (String) Variables.FullnameMother.get(indexes.get(searchIndex));
//            gender = (String) Variables.Gender.get(indexes.get(searchIndex));
//        }
//
//        if(gender.equals("Male"))
//        {
//            stat = "BINATA";
//        }
//        else if(gender.equals("Female"))
//        {
//            stat = "DALAGA";
//        }
//        
//        int bdayD = Integer.parseInt((String) bday.subSequence(bday.length() - 4, bday.length()));
//        int currentD = Integer.parseInt((String) date.subSequence(date.length() - 4, date.length()));
//
//        age = currentD - bdayD;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        asawaText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        edadText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        asawaText.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        asawaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                asawaTextKeyTyped(evt);
            }
        });
        getContentPane().add(asawaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 346, 34));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("Pangalan ng Asawa:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 157, 25));

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 176, -1, 33));

        jButton2.setText("Okay");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 176, -1, 33));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("Edad ng Asawa:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 157, 25));

        edadText.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        edadText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edadTextKeyTyped(evt);
            }
        });
        getContentPane().add(edadText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 346, 34));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void asawaTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_asawaTextKeyTyped
      
    }//GEN-LAST:event_asawaTextKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(!asawaText.getText().equals("")&&!edadText.getText().equals(""))
       {
        try {
                FileOutputStream outStream = new FileOutputStream(home.getAbsolutePath() + "\\Pagpapatunay.docx");
                XWPFDocument doc = new XWPFDocument();

//            InputStream pic = new FileInputStream("C:\\Users\\carlj\\Desktop\\staIlenaLogo.png");
//            byte [] picbytes = IOUtils.toByteArray(pic);
//            doc.addPictureData(picbytes, Document.PICTURE_TYPE_PNG);
                XWPFParagraph para = doc.createParagraph();
                para.setAlignment(ParagraphAlignment.CENTER);
                XWPFRun paraRun = para.createRun();

                paraRun.setBold(true);
                paraRun.setFontSize(12);
                paraRun.setFontFamily("Times New Roman");
                paraRun.setText("Republic of the Philippines");
                paraRun.addBreak();
                paraRun.setText("Province of Bulacan");
                paraRun.addBreak();
                paraRun.setText("Municipality of Hagonoy");
                paraRun.addBreak();
                paraRun.setText("Barangay Sta. Elena");
                paraRun.addBreak();

                XWPFParagraph para2 = doc.createParagraph();
                para2.setAlignment(ParagraphAlignment.LEFT);
                XWPFRun paraRun2 = para2.createRun();

                paraRun2.setBold(true);
                paraRun2.setFontSize(13);
                paraRun2.setFontFamily("Times New Roman");
                paraRun2.setText("DOROTEO M. REYES III                                                      Telephone#: 794-0541");

                XWPFParagraph para3 = doc.createParagraph();
                para3.setAlignment(ParagraphAlignment.LEFT);
                XWPFRun paraRun3 = para3.createRun();

                paraRun3.setBold(false);
                paraRun3.setFontSize(13);
                paraRun3.setFontFamily("Times New Roman");
                paraRun3.setText("BARANGAY CAPTAIN");
                paraRun3.addBreak();
                paraRun3.setText("=============================================================");

                XWPFParagraph para4 = doc.createParagraph();
                para4.setAlignment(ParagraphAlignment.CENTER);
                XWPFRun paraRun4 = para4.createRun();

                paraRun4.setBold(true);
                paraRun4.setFontSize(17);
                paraRun4.setFontFamily("Times New Roman");
                paraRun4.setText("TANGGAPAN NG PUNONG BARANGAY");
                paraRun4.addBreak();
                paraRun4.addBreak();
                paraRun4.setText("C-O-H-A-B-I-T-A-T-I-O-N");
                paraRun4.addBreak();
                
                XWPFParagraph para5 = doc.createParagraph();
                para5.setAlignment(ParagraphAlignment.RIGHT);
                XWPFRun paraRun5 = para5.createRun();

                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("EEE, MMMM dd, yyyy");
                String date = s.format(d);

                paraRun5.setBold(false);
                paraRun5.setFontSize(12);
                paraRun5.setFontFamily("Times New Roman");
                paraRun5.setUnderline(UnderlinePatterns.SINGLE);
                paraRun5.setText(date);

                XWPFParagraph para6 = doc.createParagraph();
                para6.setAlignment(ParagraphAlignment.LEFT);
                XWPFRun paraRun6 = para6.createRun();

                paraRun6.setBold(false);
                paraRun6.setFontSize(12);
                paraRun6.setFontFamily("Times New Roman");
                paraRun6.setText("Sa Kinauukulan:");

                XWPFParagraph para7 = doc.createParagraph();
                para7.setAlignment(ParagraphAlignment.LEFT);
                XWPFRun paraRun7 = para7.createRun();
                para7.setFirstLineIndent(300);
                
                paraRun7.setBold(false);
                paraRun7.setFontSize(12);
                paraRun7.setFontFamily("Times New Roman");
                paraRun7.setText("Ito po ay nagpapatunay na sina "+name+", "+age+" taong gulang at "+asawaText.getText()+", "+edadText.getText()+" taong gulang, pawang mga nakatira sa "+address+" ay matagal ng nagsasama na parang tunay na mag – asawa.");
                        
                XWPFParagraph para8 = doc.createParagraph();
                para8.setAlignment(ParagraphAlignment.LEFT);
                para8.setFirstLineIndent(300);
                XWPFRun paraRun8 = para8.createRun();

                paraRun8.setBold(false);
                paraRun8.setFontSize(12);
                paraRun8.setFontFamily("Times New Roman");
                paraRun8.setText("Ang pagpapatunay na ito ay sa kahilingan nina "+name+" at "+asawaText.getText()+" para magamit sa anumang hangarin na legal o naaayon sa batas.");

                XWPFParagraph para11 = doc.createParagraph();
                para11.setAlignment(ParagraphAlignment.RIGHT);
                XWPFRun paraRun11 = para11.createRun();

                paraRun11.setBold(true);
                paraRun11.setFontSize(13);
                paraRun11.setFontFamily("Times New Roman");
                paraRun11.addBreak();             
                paraRun11.addBreak();
                paraRun11.addBreak();
                paraRun11.setText("______________________");
                paraRun11.addBreak();
                paraRun11.setText("DOROTEO M. REYES III");

                XWPFParagraph para12 = doc.createParagraph();
                para12.setAlignment(ParagraphAlignment.LEFT);
                XWPFRun paraRun12 = para12.createRun();

                paraRun12.setBold(false);
                paraRun12.setFontSize(12);
                paraRun12.setFontFamily("Times New Roman");
                paraRun12.setText("                                                                                                                      Barangay Captain");

                doc.write(outStream);
                outStream.close();
                //pic.close();
                JOptionPane.showMessageDialog(null, "Document created.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            Desktop desktop = Desktop.getDesktop();
            try {
                File f = new File(DIR + "\\Pagpapatunay.docx");
                desktop.open(f);  // opens application (MSWord) associated with .doc file
            } catch (Exception ex) {
                // WordDocument.this is to refer to outer class's instance from inner class
                JOptionPane.showMessageDialog(Cohabitation.this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            this.dispose();
       }
       else
       {
           JOptionPane.showMessageDialog(null,"Please fill up the field.");
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void edadTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edadTextKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_edadTextKeyTyped

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
            java.util.logging.Logger.getLogger(Cohabitation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cohabitation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cohabitation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cohabitation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cohabitation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField asawaText;
    private javax.swing.JTextField edadText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
