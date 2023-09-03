//JAVA PROGRAM FOR A LENGTH CONVERTER
//FAYSAL HOSSAIN TOMAL #221002220

package swingpractise;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        ClrButton = new javax.swing.JButton();
        SubButton = new javax.swing.JButton();
        LabelFrom = new javax.swing.JLabel();
        LabelTo = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        Text1 = new javax.swing.JTextField();
        Label2 = new javax.swing.JLabel();
        Text2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Combo1 = new javax.swing.JComboBox<>();
        Combo2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Length Converter by Faysal");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ClrButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ClrButton.setText("Clear");
        ClrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClrButtonActionPerformed(evt);
            }
        });

        SubButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SubButton.setText("Submit");
        SubButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubButtonActionPerformed(evt);
            }
        });

        LabelFrom.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelFrom.setText("From");

        LabelTo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelTo.setText("To");

        Label1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Label1.setText("Length =");

        Text1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text1ActionPerformed(evt);
            }
        });

        Label2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Label2.setText("Converted =");

        Text2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swingpractise/sw.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        Combo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Metre", "Inch", "Mile", "Feet" }));

        Combo2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Metre", "Inch", "Mile", "Feet" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(LabelTo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelFrom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Text1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(Text2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SubButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ClrButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelFrom)
                            .addComponent(Combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelTo)
                            .addComponent(Combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label1)
                            .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubButton)
                    .addComponent(ClrButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClrButtonActionPerformed

        Text1.setText("");
        Text2.setText("");
    }//GEN-LAST:event_ClrButtonActionPerformed

    private void SubButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubButtonActionPerformed
        
        double in = Double.parseDouble(Text1.getText());
       
        if(Combo1.getSelectedItem().toString() == "Metre" && Combo2.getSelectedItem().toString() == "Metre"){
            String x = "" +String.format("%.5f", in);
            Text2.setText(x);
        }
        
        else if(Combo1.getSelectedItem().toString() == "Inch" && Combo2.getSelectedItem().toString() == "Inch"){
            String x = "" +String.format("%.5f", in);
            Text2.setText(x);
        }
        
        else if(Combo1.getSelectedItem().toString() == "Mile" && Combo2.getSelectedItem().toString() == "Mile"){
            String x = "" +String.format("%.5f", in);
            Text2.setText(x);
        }
        
        else if(Combo1.getSelectedItem().toString() == "Feet" && Combo2.getSelectedItem().toString() == "Feet"){
            String x = "" +String.format("%.5f", in);
            Text2.setText(x);
        }
        
        else if(Combo1.getSelectedItem().toString() == "Metre" && Combo2.getSelectedItem().toString() == "Inch"){
            double out = 39.37 * in;
            String x = "" +String.format("%.5f", out);
            Text2.setText(x);
        }
        
        else if(Combo1.getSelectedItem().toString() == "Metre" && Combo2.getSelectedItem().toString() == "Mile"){
            double out = in / 1609.00;
            String x = "" +String.format("%.5f", out);
            Text2.setText(x);
        }
        
        else if(Combo1.getSelectedItem().toString() == "Metre" && Combo2.getSelectedItem().toString() == "Feet"){
            double out = in * 3.281;
            String x = "" +String.format("%.5f", out);
            Text2.setText(x);
        }
        
        else if(Combo1.getSelectedItem().toString() == "Inch" && Combo2.getSelectedItem().toString() == "Metre"){
            double out = in / 39.37;
            String x = "" +String.format("%.5f", out);
            Text2.setText(x);
        }
        
        else if(Combo1.getSelectedItem().toString() == "Inch" && Combo2.getSelectedItem().toString() == "Mile"){
            double out = in / 63360.00;
            String x = "" +String.format("%.5f", out);
            Text2.setText(x);
        }
        
        else if(Combo1.getSelectedItem().toString() == "Inch" && Combo2.getSelectedItem().toString() == "Feet"){
            double out = in / 12.00;
            String x = "" +String.format("%.5f", out);
            Text2.setText(x);
        }
        
        else if(Combo1.getSelectedItem().toString() == "Mile" && Combo2.getSelectedItem().toString() == "Metre"){
            double out = in * 1609.00;
            String x = "" +String.format("%.5f", out);
            Text2.setText(x);
        }
        
        else if(Combo1.getSelectedItem().toString() == "Mile" && Combo2.getSelectedItem().toString() == "Inch"){
            double out = in * 63360.00;
            String x = "" +String.format("%.5f", out);
            Text2.setText(x);
        }
        
        else if(Combo1.getSelectedItem().toString() == "Mile" && Combo2.getSelectedItem().toString() == "Feet"){
            double out = in * 5280.00;
            String x = "" +String.format("%.5f", out);
            Text2.setText(x);
        }
        
        else if(Combo1.getSelectedItem().toString() == "Feet" && Combo2.getSelectedItem().toString() == "Metre"){
            double out = in / 3.281;
            String x = "" +String.format("%.5f", out);
            Text2.setText(x);
        }
        
        else if(Combo1.getSelectedItem().toString() == "Feet" && Combo2.getSelectedItem().toString() == "Inch"){
            double out = in * 12.00;
            String x = "" +String.format("%.5f", out);
            Text2.setText(x);
        }
        
        else if(Combo1.getSelectedItem().toString() == "Feet" && Combo2.getSelectedItem().toString() == "Mile"){
            double out = in / 5280.00;
            String x = "" +String.format("%.5f", out);
            Text2.setText(x);
        }
    }//GEN-LAST:event_SubButtonActionPerformed

    private void Text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text1ActionPerformed

    }//GEN-LAST:event_Text1ActionPerformed

    private void Text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text2ActionPerformed

    }//GEN-LAST:event_Text2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClrButton;
    private javax.swing.JComboBox<String> Combo1;
    private javax.swing.JComboBox<String> Combo2;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel LabelFrom;
    private javax.swing.JLabel LabelTo;
    private javax.swing.JButton SubButton;
    private javax.swing.JTextField Text1;
    private javax.swing.JTextField Text2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
