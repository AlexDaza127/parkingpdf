/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Michael
 */
public class frmRegisEnt extends javax.swing.JInternalFrame {

    /** Creates new form VentRegistro */
    public frmRegisEnt() {
        initComponents();
    }

    public JButton getBtnRegistrarEnt() {
        return btnRegistrarEnt;
    }

    public void setBtnRegistrarEnt(JButton btnRegistrarEnt) {
        this.btnRegistrarEnt = btnRegistrarEnt;
    }

    public JComboBox<String> getCmbTipoVehiculoEnt() {
        return cmbTipoVehiculoEnt;
    }

    public void setCmbTipoVehiculoEnt(JComboBox<String> cmbTipoVehiculoEnt) {
        this.cmbTipoVehiculoEnt = cmbTipoVehiculoEnt;
    }

    public JTextField getTxtRegEntrada() {
        return txtRegEntrada;
    }

    public void setTxtRegEntrada(JTextField txtRegEntrada) {
        this.txtRegEntrada = txtRegEntrada;
    }

    public JTextField getTxtPlacaEnt() {
        return txtPlacaEnt;
    }

    public void setTxtPlacaEnt(JTextField txtPlacaEnt) {
        this.txtPlacaEnt = txtPlacaEnt;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbTipoVehiculoEnt = new javax.swing.JComboBox<>();
        lblTipoVehiculo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblEntrada = new javax.swing.JLabel();
        txtPlacaEnt = new javax.swing.JTextField();
        btnRegistrarEnt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtRegEntrada = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Registro de Entrada");

        cmbTipoVehiculoEnt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbTipoVehiculoEnt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro", "Moto" }));

        lblTipoVehiculo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTipoVehiculo.setText("Tipo Vehiculo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Placa");

        lblEntrada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEntrada.setText("Hora Entrada");

        txtPlacaEnt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnRegistrarEnt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrarEnt.setText("Registrar Entrada");

        jLabel1.setText("hh  /  mm /  ss  ");

        txtRegEntrada.setText("          :         :");
        txtRegEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegEntradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEntrada)
                            .addComponent(jLabel2)
                            .addComponent(lblTipoVehiculo))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPlacaEnt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(cmbTipoVehiculoEnt, javax.swing.GroupLayout.Alignment.LEADING, 0, 103, Short.MAX_VALUE)
                            .addComponent(txtRegEntrada, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(btnRegistrarEnt)))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipoVehiculoEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoVehiculo))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPlacaEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEntrada)
                    .addComponent(txtRegEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btnRegistrarEnt)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRegEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegEntradaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarEnt;
    private javax.swing.JComboBox<String> cmbTipoVehiculoEnt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblEntrada;
    private javax.swing.JLabel lblTipoVehiculo;
    private javax.swing.JTextField txtPlacaEnt;
    private javax.swing.JTextField txtRegEntrada;
    // End of variables declaration//GEN-END:variables

}
