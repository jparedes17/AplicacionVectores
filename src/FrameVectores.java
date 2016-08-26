
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jparedes2
 */
public class FrameVectores extends javax.swing.JFrame {

    /**
     * Creates new form FrameVectores
     */
    double v[];
    public FrameVectores() {
        initComponents();
        cmbCrear.setEnabled(true);
        cmbLlenarManual.setEnabled(false);
        cmbLlenarAutom.setEnabled(false);
        cmbMostrar.setEnabled(false);
        cmbBorrar.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLongitud = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmbCrear = new javax.swing.JButton();
        cmbLlenarManual = new javax.swing.JButton();
        cmbLlenarAutom = new javax.swing.JButton();
        cmbMostrar = new javax.swing.JButton();
        cmbBorrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MANEJO DE VECTORES.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Iniciales", 0, 0, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Longitud:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtLongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLongitudKeyTyped(evt);
            }
        });
        jPanel2.add(txtLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 80, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 240, 70));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", 0, 0, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbCrear.setText("Crear");
        cmbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmbCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, -1));

        cmbLlenarManual.setText("Llenar Manual");
        cmbLlenarManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLlenarManualActionPerformed(evt);
            }
        });
        jPanel3.add(cmbLlenarManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 100, -1));

        cmbLlenarAutom.setText("Llenar Autom");
        cmbLlenarAutom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLlenarAutomActionPerformed(evt);
            }
        });
        jPanel3.add(cmbLlenarAutom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, -1));

        cmbMostrar.setText("Mostrar");
        cmbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmbMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, -1));

        cmbBorrar.setText("Borrar");
        cmbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBorrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 100, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 130, 190));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", 0, 0, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 240, 130));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 260, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(545, 379));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCrearActionPerformed
        // TODO add your handling code here:
        int longitud;
        if (txtLongitud.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Ingrese la Longitud", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
        }
        else if(Integer.parseInt(txtLongitud.getText().trim())==0)
        {
            JOptionPane.showMessageDialog(this, "La Longitud no puede ser cero", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
            txtLongitud.selectAll();
        }
        else 
        {
            longitud= Integer.parseInt(txtLongitud.getText().trim());
            v= new double [longitud];
            JOptionPane.showMessageDialog(this, "Vector creado Exitosamente");
        
        cmbCrear.setEnabled(false);
        cmbLlenarAutom.setEnabled(true);
        cmbLlenarManual.setEnabled(true);
        cmbMostrar.setEnabled(false);
        txtLongitud.setEditable(false);
        }
    }//GEN-LAST:event_cmbCrearActionPerformed

    private void txtLongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLongitudKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume(); 
          } 
    }//GEN-LAST:event_txtLongitudKeyTyped

    private void cmbLlenarManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLlenarManualActionPerformed
        // TODO add your handling code here:
        double n;
        for (int i = 0; i < v.length; i++) 
        {
            n= Double.parseDouble(JOptionPane.showInputDialog(this, "Digite el elemento en la posicion"+ i));
            v[i]=n;
        }
        cmbCrear.setEnabled(false);
        cmbLlenarAutom.setEnabled(false);
        cmbMostrar.setEnabled(true);
        cmbBorrar.setEnabled(true);
        cmbLlenarManual.setEnabled(false);
    }//GEN-LAST:event_cmbLlenarManualActionPerformed

    private void cmbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMostrarActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < v.length; i++) 
        {
            txtResultado.append(v[i]+"\n");
        }
        cmbCrear.setEnabled(false);
        cmbLlenarAutom.setEnabled(false);
        cmbMostrar.setEnabled(false);
        cmbBorrar.setEnabled(true);
        cmbLlenarManual.setEnabled(false);
    }//GEN-LAST:event_cmbMostrarActionPerformed

    private void cmbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBorrarActionPerformed
        // TODO add your handling code here:
        txtLongitud.setText("");
        txtResultado.setText("");
        txtLongitud.requestFocusInWindow();
        v= null;
        
        cmbCrear.setEnabled(true);
        cmbLlenarAutom.setEnabled(false);
        cmbMostrar.setEnabled(false);
        cmbBorrar.setEnabled(true);
        cmbLlenarManual.setEnabled(false);
        txtLongitud.setEditable(true);
    }//GEN-LAST:event_cmbBorrarActionPerformed

    private void cmbLlenarAutomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLlenarAutomActionPerformed
        // TODO add your handling code here:
        double n;
        for (int i = 0; i < v.length; i++) 
        {
            n= (int)(Math.random()* 50 + 1);
            v[i]=n;
        }
        cmbCrear.setEnabled(false);
        cmbLlenarAutom.setEnabled(false);
        cmbMostrar.setEnabled(true);
        cmbBorrar.setEnabled(true);
        cmbLlenarManual.setEnabled(false);
    }//GEN-LAST:event_cmbLlenarAutomActionPerformed

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
            java.util.logging.Logger.getLogger(FrameVectores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameVectores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameVectores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameVectores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameVectores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmbBorrar;
    private javax.swing.JButton cmbCrear;
    private javax.swing.JButton cmbLlenarAutom;
    private javax.swing.JButton cmbLlenarManual;
    private javax.swing.JButton cmbMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
