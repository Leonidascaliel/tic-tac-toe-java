
public class JogoDaVelha extends javax.swing.JFrame {

    private String j1 = "X";

    public JogoDaVelha() {
        initComponents();

    }

    private void jogar(javax.swing.JButton btn) {

        if (!btn.getText().equals("")) {
            return;
        }

        btn.setText(j1);

        if (verificarVencedor()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Jogador " + j1 + " venceu!");
            resetar();
            return;
        }

        if (verificarEmpate()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Empate!");
            resetar();
            return;
        }

        j1 = j1.equals("X") ? "O" : "X";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campo1 = new javax.swing.JButton();
        campo2 = new javax.swing.JButton();
        campo3 = new javax.swing.JButton();
        campo6 = new javax.swing.JButton();
        campo5 = new javax.swing.JButton();
        campo4 = new javax.swing.JButton();
        campo9 = new javax.swing.JButton();
        campo8 = new javax.swing.JButton();
        campo7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        campo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo1ActionPerformed(evt);
            }
        });

        campo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo2ActionPerformed(evt);
            }
        });

        campo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo3ActionPerformed(evt);
            }
        });

        campo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo6ActionPerformed(evt);
            }
        });

        campo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo5ActionPerformed(evt);
            }
        });

        campo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo4ActionPerformed(evt);
            }
        });

        campo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo9ActionPerformed(evt);
            }
        });

        campo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo8ActionPerformed(evt);
            }
        });

        campo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campo1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campo2)
                        .addGap(18, 18, 18)
                        .addComponent(campo3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campo4)
                                .addGap(18, 18, 18)
                                .addComponent(campo5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campo7)
                                .addGap(18, 18, 18)
                                .addComponent(campo8)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo9)
                            .addComponent(campo6))))
                .addContainerGap(258, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {campo1, campo2, campo3, campo4, campo5, campo6, campo7, campo8, campo9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo2)
                    .addComponent(campo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo6)
                    .addComponent(campo5)
                    .addComponent(campo4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo9)
                    .addComponent(campo8)
                    .addComponent(campo7))
                .addGap(75, 75, 75))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {campo1, campo2, campo3, campo4, campo5, campo6, campo7, campo8, campo9});

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void campo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo1ActionPerformed
        jogar(campo1);
    }//GEN-LAST:event_campo1ActionPerformed

    private void campo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo2ActionPerformed
        jogar(campo2);
    }//GEN-LAST:event_campo2ActionPerformed

    private void campo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo3ActionPerformed
        jogar(campo3);
    }//GEN-LAST:event_campo3ActionPerformed

    private void campo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo4ActionPerformed
        jogar(campo4);
    }//GEN-LAST:event_campo4ActionPerformed

    private void campo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo5ActionPerformed
        jogar(campo5);
    }//GEN-LAST:event_campo5ActionPerformed

    private void campo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo6ActionPerformed
        jogar(campo6);
    }//GEN-LAST:event_campo6ActionPerformed

    private void campo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo7ActionPerformed
        jogar(campo7);
    }//GEN-LAST:event_campo7ActionPerformed

    private void campo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo8ActionPerformed
        jogar(campo8);
    }//GEN-LAST:event_campo8ActionPerformed

    private void campo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo9ActionPerformed
        jogar(campo9);
    }//GEN-LAST:event_campo9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton campo1;
    private javax.swing.JButton campo2;
    private javax.swing.JButton campo3;
    private javax.swing.JButton campo4;
    private javax.swing.JButton campo5;
    private javax.swing.JButton campo6;
    private javax.swing.JButton campo7;
    private javax.swing.JButton campo8;
    private javax.swing.JButton campo9;
    // End of variables declaration//GEN-END:variables

    private void resetar() {
        campo1.setText("");
        campo2.setText("");
        campo3.setText("");
        campo4.setText("");
        campo5.setText("");
        campo6.setText("");
        campo7.setText("");
        campo8.setText("");
        campo9.setText("");

        j1 = "X";
    }

    private boolean verificarEmpate() {
        return !campo1.getText().equals("")
                && !campo2.getText().equals("")
                && !campo3.getText().equals("")
                && !campo4.getText().equals("")
                && !campo5.getText().equals("")
                && !campo6.getText().equals("")
                && !campo7.getText().equals("")
                && !campo8.getText().equals("")
                && !campo9.getText().equals("");
    }

    private boolean verificarVencedor() {

        String b1 = campo1.getText();
        String b2 = campo2.getText();
        String b3 = campo3.getText();
        String b4 = campo4.getText();
        String b5 = campo5.getText();
        String b6 = campo6.getText();
        String b7 = campo7.getText();
        String b8 = campo8.getText();
        String b9 = campo9.getText();

        // Linhas
        if (!b1.equals("") && b1.equals(b2) && b2.equals(b3)) {
            return true;
        }
        if (!b4.equals("") && b4.equals(b5) && b5.equals(b6)) {
            return true;
        }
        if (!b7.equals("") && b7.equals(b8) && b8.equals(b9)) {
            return true;
        }

        // Colunas
        if (!b1.equals("") && b1.equals(b4) && b4.equals(b7)) {
            return true;
        }
        if (!b2.equals("") && b2.equals(b5) && b5.equals(b8)) {
            return true;
        }
        if (!b3.equals("") && b3.equals(b6) && b6.equals(b9)) {
            return true;
        }

        // Diagonais
        if (!b1.equals("") && b1.equals(b5) && b5.equals(b9)) {
            return true;
        }
        if (!b3.equals("") && b3.equals(b5) && b5.equals(b7)) {
            return true;
        }

        return false;
    }
}
