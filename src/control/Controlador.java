/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.ArchPdf;
import modelo.Carro;
import modelo.Moto;
import modelo.Parqueo;
import modelo.Vehiculo;
import vista.VentPrincipal;
import vista.frmListaParqueo;
import vista.frmRegisEnt;
import vista.frmRegisSal;

/**
 *
 * @author Michael
 */
public class Controlador implements ActionListener {

    VentPrincipal frmVP;
    frmListaParqueo frmRegVeh;
    frmRegisEnt frmFRE;
    frmRegisSal frmFRS;
    Parqueo objP;
    ArchPdf aPdf;
    Vehiculo objV;
    Moto objMT;
    Carro objCR;

    public Controlador(ArchPdf aPdf, VentPrincipal frmVP, frmListaParqueo frmRegVeh, frmRegisEnt frmFRE, frmRegisSal frmFRS, Parqueo objP) {

        this.frmVP = frmVP;
        this.frmRegVeh = frmRegVeh;
        this.frmFRE = frmFRE;
        this.frmFRS = frmFRS;
        this.objP = objP;
        this.aPdf = aPdf;

        frmVP.getJdpEscritorio().add(frmFRE);
        frmVP.getJdpEscritorio().add(frmFRS);

        frmVP.getOpmRegEntVeh().addActionListener(this);
        frmVP.getOpmRegSalVeh().addActionListener(this);
        frmVP.getOpmSalir().addActionListener(this);
        frmVP.getOpmRegVeh().addActionListener(this);

        frmFRE.getCmbTipoVehiculoEnt().addActionListener(this);
        frmFRE.getBtnRegistrarEnt().addActionListener(this);
        frmFRS.getCmbTipoVehiculoSal().addActionListener(this);
        frmFRS.getBtnRegistrarSal().addActionListener(this);
        frmFRS.getBtnCrearRecibo().addActionListener(this);
    }

    public Controlador() {
        this.frmVP = new VentPrincipal();
        this.frmRegVeh = new frmListaParqueo();
        this.frmFRE = new frmRegisEnt();
        this.frmFRS = new frmRegisSal();
        this.objP = new Parqueo();
        this.objCR = null;
        this.objMT = null;
        this.objV = null;
        this.aPdf = new ArchPdf();

        frmVP.getJdpEscritorio().add(frmFRE);
        frmVP.getJdpEscritorio().add(frmFRS);

        frmVP.getOpmRegEntVeh().addActionListener(this);
        frmVP.getOpmRegSalVeh().addActionListener(this);
        frmVP.getOpmSalir().addActionListener(this);
        frmVP.getOpmRegVeh().addActionListener(this);

        frmFRE.getCmbTipoVehiculoEnt().addActionListener(this);
        frmFRE.getBtnRegistrarEnt().addActionListener(this);
        frmFRS.getCmbTipoVehiculoSal().addActionListener(this);
        frmFRS.getBtnRegistrarSal().addActionListener(this);
        frmFRS.getBtnCrearRecibo().addActionListener(this);

    }

    public void iniciar() {
        frmVP.setVisible(true);
        frmVP.setSize(550, 420);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == frmVP.getOpmRegEntVeh()) {
            frmFRE.setVisible(true);
            frmFRS.setVisible(false);
        }

        if (e.getSource() == frmVP.getOpmRegSalVeh()) {
            frmFRE.setVisible(false);
            frmFRS.setVisible(true);
        }

        if (e.getSource() == frmVP.getOpmRegVeh()) {
            frmRegVeh.setVisible(true);
        }

        if (e.getSource() == frmVP.getOpmSalir()) {
            int resp = JOptionPane.showConfirmDialog(frmVP,
                    "Desea terminar ejecuci+on?",
                    "Salir", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                frmVP.dispose();
            }
        }

        if (e.getSource() == frmFRE.getBtnRegistrarEnt()
                && frmFRE.getCmbTipoVehiculoEnt().getSelectedIndex() == 0) {
            Carro objC = new Carro();
            objC.setPlaca(frmFRE.getTxtPlacaEnt().getText());

            String tiempo[] = frmFRE.getTxtRegEntrada().getText().split(":");

            for (int i = 0; i < tiempo.length; i++) {
                objC.getCalPag()[i] = Double.parseDouble(tiempo[i]);
            }
            objC.getHE().setHh((int) objC.getCalPag()[0]);
            objC.getHE().setMm((int) objC.getCalPag()[1]);
            objC.getHE().setSs((int) objC.getCalPag()[2]);

            objP.getRegistroVehiculo().add(objC);
            agregarTablaCarro(objC, frmRegVeh.getTblRegVeh());
        }

        if (e.getSource() == frmFRE.getBtnRegistrarEnt()
                && frmFRE.getCmbTipoVehiculoEnt().getSelectedIndex() == 1) {
            Moto objM = new Moto();
            objM.setPlaca(frmFRE.getTxtPlacaEnt().getText());

            String tiempo[] = frmFRE.getTxtRegEntrada().getText().split(":");

            for (int i = 0; i < tiempo.length; i++) {
                objM.getCalPag()[i] = Double.parseDouble(tiempo[i]);
            }

            objM.getHE().setHh((int) objM.getCalPag()[0]);
            objM.getHE().setMm((int) objM.getCalPag()[1]);
            objM.getHE().setSs((int) objM.getCalPag()[2]);

            objP.getRegistroVehiculo().add(objM);
            agregarTablaMoto(objM, frmRegVeh.getTblRegVeh());
        }

        if (e.getSource() == frmFRS.getBtnRegistrarSal()
                && frmFRS.getCmbTipoVehiculoSal().getSelectedIndex() == 0) {
            Carro objC = new Carro();
            int FilaSelect = frmRegVeh.getTblRegVeh().getSelectedRow();
            if (FilaSelect >= 0) {
                frmFRS.txtPlacaSal.setText(frmRegVeh.getTblRegVeh().getValueAt(FilaSelect, 1).toString());
                frmFRS.txtRegEnt1.setText(frmRegVeh.getTblRegVeh().getValueAt(FilaSelect, 2).toString());
                objC.setPlaca(frmFRS.getTxtPlacaSal().getText());

                String tiempo1[] = frmFRS.getTxtRegEnt1().getText().split(":");

                for (int i = 0; i < tiempo1.length; i++) {
                    objC.getCalPag()[i] = Double.parseDouble(tiempo1[i]);
                }

                objC.getHE().setHh((int) objC.getCalPag()[0]);
                objC.getHE().setMm((int) objC.getCalPag()[1]);
                objC.getHE().setSs((int) objC.getCalPag()[2]);

                String tiempo2[] = frmFRS.getTxtRegSalida().getText().split(":");
                for (int i = 0; i < tiempo2.length; i++) {
                    objC.getCalPag()[i] = Double.parseDouble(tiempo2[i]);
                }

                objC.getHS().setHh((int) objC.getCalPag()[0]);
                objC.getHS().setMm((int) objC.getCalPag()[1]);
                objC.getHS().setSs((int) objC.getCalPag()[2]);

                objV = objC;
                objP.getRegistroVehiculo().add(objC);
                JOptionPane.showMessageDialog(frmVP, objV.toString());
                agregarTablaCarro(objC, frmRegVeh.getTblRegVeh());

            } else {
                JOptionPane.showMessageDialog(frmVP, "Fila No Seleccionada");
            }
        }

        if (e.getSource() == frmFRS.getBtnRegistrarSal()
                && frmFRS.getCmbTipoVehiculoSal().getSelectedIndex() == 1) {
            Moto objM = new Moto();
            int FilaSelect = frmRegVeh.getTblRegVeh().getSelectedRow();

            if (FilaSelect >= 0) {
                frmFRS.txtPlacaSal.setText(frmRegVeh.getTblRegVeh().getValueAt(FilaSelect, 1).toString());
                frmFRS.txtRegEnt1.setText(frmRegVeh.getTblRegVeh().getValueAt(FilaSelect, 2).toString());
                objM.setPlaca(frmFRS.getTxtPlacaSal().getText());

                String tiempo1[] = frmFRS.getTxtRegEnt1().getText().split(":");

                for (int i = 0; i < tiempo1.length; i++) {
                    objM.getCalPag()[i] = Double.parseDouble(tiempo1[i]);
                }

                objM.getHE().setHh((int) objM.getCalPag()[0]);
                objM.getHE().setMm((int) objM.getCalPag()[1]);
                objM.getHE().setSs((int) objM.getCalPag()[2]);

                String tiempo2[] = frmFRS.getTxtRegSalida().getText().split(":");
                for (int i = 0; i < tiempo2.length; i++) {
                    objM.getCalPag()[i] = Double.parseDouble(tiempo2[i]);
                }

                objM.getHS().setHh((int) objM.getCalPag()[0]);
                objM.getHS().setMm((int) objM.getCalPag()[1]);
                objM.getHS().setSs((int) objM.getCalPag()[2]);

                objV = objM;
                objP.getRegistroVehiculo().add(objM);
                
                JOptionPane.showMessageDialog(frmVP, objV.toString());
                agregarTablaMoto(objM, frmRegVeh.getTblRegVeh());

            } else {
                JOptionPane.showMessageDialog(frmVP, "Fila No Seleccionada");
            }
        }

        if (e.getSource() == frmFRS.getBtnCrearRecibo()) {
            if (objV != null) {
                aPdf.crear_PDF(objV);
            } else {
                JOptionPane.showMessageDialog(frmVP, "Error no se han registrado los datos ");
            }
        }

    }

    public void agregarTablaCarro(Carro objC, JTable tabla) {
        Object datos[] = {"Carro", objC.getPlaca(), objC.getHE().toString(),
            objC.getHS().toString(), objC.pagoTotal()};

        DefaultTableModel plantilla = (DefaultTableModel) tabla.getModel();
        plantilla.addRow(datos);
        frmRegVeh.getLblRecuado().setText(String.valueOf(objP.recuado()));
    }

    public void agregarTablaMoto(Moto objM, JTable tabla) {
        Object datos[] = {"Moto", objM.getPlaca(), objM.getHE().toString(),
            objM.getHS().toString(), objM.pagoTotal()};
        DefaultTableModel plantilla = (DefaultTableModel) tabla.getModel();
        plantilla.addRow(datos);
        frmRegVeh.getLblRecuado().setText(String.valueOf(objP.recuado()));
    }

}
