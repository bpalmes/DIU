/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.diu5;

import java.awt.event.ItemEvent;

/**
 *
 * @author TESTER
 */
public class Practica5 extends javax.swing.JFrame {

    /**
     * Creates new form Practica5
     */
    public Practica5() {
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

        Logo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        todos = new javax.swing.JCheckBox();
        Rojo = new javax.swing.JCheckBox();
        Verde = new javax.swing.JCheckBox();
        Azul = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        upDerecha = new javax.swing.JRadioButton();
        upIzquierda = new javax.swing.JRadioButton();
        downDerecha = new javax.swing.JRadioButton();
        downIzquierda = new javax.swing.JRadioButton();
        lienzo1 = new com.mycompany.diu5.Lienzo();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        todos.setText("Todos");
        todos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                todosItemStateChanged(evt);
            }
        });
        todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosActionPerformed(evt);
            }
        });

        Rojo.setText("Rojo");
        Rojo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RojoItemStateChanged(evt);
            }
        });
        Rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RojoActionPerformed(evt);
            }
        });

        Verde.setText("Verde");
        Verde.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                VerdeItemStateChanged(evt);
            }
        });
        Verde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerdeActionPerformed(evt);
            }
        });

        Azul.setText("Azul");
        Azul.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                AzulItemStateChanged(evt);
            }
        });
        Azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AzulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(todos)
                    .addComponent(Rojo)
                    .addComponent(Verde)
                    .addComponent(Azul))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(todos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Rojo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Verde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Azul)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Logo.add(upDerecha);
        upDerecha.setText("Arriba Derecha");
        upDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upDerechaActionPerformed(evt);
            }
        });

        Logo.add(upIzquierda);
        upIzquierda.setText("Arriba Izquierda");
        upIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upIzquierdaActionPerformed(evt);
            }
        });

        Logo.add(downDerecha);
        downDerecha.setText("Abajo Derecha");
        downDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downDerechaActionPerformed(evt);
            }
        });

        Logo.add(downIzquierda);
        downIzquierda.setText("Abajo Izquierda");
        downIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downIzquierdaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upDerecha)
                    .addComponent(upIzquierda)
                    .addComponent(downDerecha)
                    .addComponent(downIzquierda))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(upDerecha)
                .addGap(20, 20, 20)
                .addComponent(upIzquierda)
                .addGap(20, 20, 20)
                .addComponent(downDerecha)
                .addGap(20, 20, 20)
                .addComponent(downIzquierda)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        lienzo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout lienzo1Layout = new javax.swing.GroupLayout(lienzo1);
        lienzo1.setLayout(lienzo1Layout);
        lienzo1Layout.setHorizontalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
        );
        lienzo1Layout.setVerticalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setText("Brian Palmés Gómez");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(lienzo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lienzo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_todosActionPerformed

    private void VerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerdeActionPerformed

    private void downDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downDerechaActionPerformed
        // TODO add your handling code here:
        lienzo1.coordenadas(535, 250);
    }//GEN-LAST:event_downDerechaActionPerformed

    private void RojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RojoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RojoActionPerformed

    private void AzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AzulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AzulActionPerformed

    private void upDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upDerechaActionPerformed
        // TODO add your handling code here:
        lienzo1.coordenadas(535, 0);
    }//GEN-LAST:event_upDerechaActionPerformed

    private void upIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upIzquierdaActionPerformed
        // TODO add your handling code here:
        lienzo1.coordenadas(0, 0);
    }//GEN-LAST:event_upIzquierdaActionPerformed

    private void downIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downIzquierdaActionPerformed
        // TODO add your handling code here:
        lienzo1.coordenadas(0, 250);
    }//GEN-LAST:event_downIzquierdaActionPerformed

    private void todosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_todosItemStateChanged
        // TODO add your handling code here:
        int state = evt.getStateChange();
        if (state == ItemEvent.SELECTED) {
            Rojo.setSelected(true);
            Verde.setSelected(true);
            Azul.setSelected(true);
        }
    }//GEN-LAST:event_todosItemStateChanged

    private void RojoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RojoItemStateChanged
        // TODO add your handling code here:
        if(!Verde.isSelected() && !Azul.isSelected()){
            Rojo.setSelected(true);
        } else {
            int state = evt.getStateChange();
            if (state != ItemEvent.SELECTED) {
                todos.setSelected(false);
            }
            lienzo1.pinta(Rojo.isSelected(), Verde.isSelected(), Azul.isSelected());
        }
    }//GEN-LAST:event_RojoItemStateChanged

    private void VerdeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_VerdeItemStateChanged
        // TODO add your handling code here:
        if(!Rojo.isSelected() && !Azul.isSelected()){
            Verde.setSelected(true);
        } else {
            int state = evt.getStateChange();
            if (state != ItemEvent.SELECTED) {
                todos.setSelected(false);
            }
            lienzo1.pinta(Rojo.isSelected(), Verde.isSelected(), Azul.isSelected());
        }
    }//GEN-LAST:event_VerdeItemStateChanged

    private void AzulItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_AzulItemStateChanged
        // TODO add your handling code here:
        if(!Verde.isSelected() && !Rojo.isSelected()){
            Azul.setSelected(true);
        } else {
            int state = evt.getStateChange();
            if (state != ItemEvent.SELECTED) {
                todos.setSelected(false);
            }
            lienzo1.pinta(Rojo.isSelected(), Verde.isSelected(), Azul.isSelected());
        }
    }//GEN-LAST:event_AzulItemStateChanged

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
            java.util.logging.Logger.getLogger(Practica5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Azul;
    private javax.swing.ButtonGroup Logo;
    private javax.swing.JCheckBox Rojo;
    private javax.swing.JCheckBox Verde;
    private javax.swing.JRadioButton downDerecha;
    private javax.swing.JRadioButton downIzquierda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.mycompany.diu5.Lienzo lienzo1;
    private javax.swing.JCheckBox todos;
    private javax.swing.JRadioButton upDerecha;
    private javax.swing.JRadioButton upIzquierda;
    // End of variables declaration//GEN-END:variables
}
