/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejo.de.eventos;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Gui extends javax.swing.JFrame {

    Metodos m = new Metodos();

    /**
     * Creates new form Gui
     */
    public Gui() {
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

        numUno = new javax.swing.JTextField();
        numDos = new javax.swing.JTextField();
        resultado = new javax.swing.JTextField();
        suma = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();
        divicion = new javax.swing.JButton();
        raizUno = new javax.swing.JButton();
        raizDos = new javax.swing.JButton();
        mayor = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        numUno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numUno.setText("0");

        numDos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numDos.setText("0");

        resultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resultado.setText("Resultado");
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        suma.setText("+");
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });

        resta.setText("-");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });

        multiplicacion.setText("x");
        multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionActionPerformed(evt);
            }
        });

        divicion.setText("/");
        divicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divicionActionPerformed(evt);
            }
        });

        raizUno.setText("Raiz 1");
        raizUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizUnoActionPerformed(evt);
            }
        });

        raizDos.setText("Raiz 2");
        raizDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizDosActionPerformed(evt);
            }
        });

        mayor.setText("Mayor");
        mayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mayorActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        jLabel1.setText("Numero Uno:");

        jLabel2.setText("Numero Dos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numUno, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numDos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mayor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(raizDos))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(divicion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(raizUno))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(suma)
                                .addGap(18, 18, 18)
                                .addComponent(resta)
                                .addGap(18, 18, 18)
                                .addComponent(multiplicacion)))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(limpiar)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(suma)
                            .addComponent(resta)
                            .addComponent(multiplicacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(divicion)
                            .addComponent(raizUno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(raizDos)
                            .addComponent(mayor)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numUno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numDos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(limpiar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadoActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        try {
            int uno = Integer.parseInt(numUno.getText());
            int dos = Integer.parseInt(numDos.getText());

            resultado.setText(m.suma(uno, dos));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite Ambos Numeros");
        }
    }//GEN-LAST:event_sumaActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        try {
            int uno = Integer.parseInt(numUno.getText());
            int dos = Integer.parseInt(numDos.getText());

            resultado.setText(m.resta(uno, dos));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite Ambos Numeros");
        }
    }//GEN-LAST:event_restaActionPerformed

    private void multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionActionPerformed
        try {
            int uno = Integer.parseInt(numUno.getText());
            int dos = Integer.parseInt(numDos.getText());

            resultado.setText(m.multiplica(uno, dos));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite Ambos Numeros");
        }
    }//GEN-LAST:event_multiplicacionActionPerformed

    private void divicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divicionActionPerformed
        try {
            int uno = Integer.parseInt(numUno.getText());
            int dos = Integer.parseInt(numDos.getText());

            resultado.setText(m.divide(uno, dos));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite Ambos Numeros");
        }
    }//GEN-LAST:event_divicionActionPerformed

    private void raizUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizUnoActionPerformed
        try {
            resultado.setText(m.raiz(numUno.getText()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite El Numero Uno");
        }
    }//GEN-LAST:event_raizUnoActionPerformed

    private void raizDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizDosActionPerformed
        try {
            resultado.setText(m.raiz(numDos.getText()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite El Numero Dos");
        }
    }//GEN-LAST:event_raizDosActionPerformed

    private void mayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mayorActionPerformed
        try {
            int uno = Integer.parseInt(numUno.getText());
            int dos = Integer.parseInt(numDos.getText());

            resultado.setText(m.mayor(uno, dos));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite Ambos Numeros");
        }
    }//GEN-LAST:event_mayorActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        numUno.setText("");
        numDos.setText("");
        resultado.setText("Resultado");
    }//GEN-LAST:event_limpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton divicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton mayor;
    private javax.swing.JButton multiplicacion;
    private javax.swing.JTextField numDos;
    private javax.swing.JTextField numUno;
    private javax.swing.JButton raizDos;
    private javax.swing.JButton raizUno;
    private javax.swing.JButton resta;
    private javax.swing.JTextField resultado;
    private javax.swing.JButton suma;
    // End of variables declaration//GEN-END:variables
}
