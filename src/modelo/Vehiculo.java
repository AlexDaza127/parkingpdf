/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Michael
 */
public abstract class Vehiculo {

    Hora HE;
    Hora HS;
    private String placa;
    private double calPag[];

    public Vehiculo(Hora HE, Hora HS, String placa, double[] calPag) {
        this.HE = HE;
        this.HS = HS;
        this.placa = placa;
        this.calPag = calPag;
    }

    public Vehiculo() {
        this.HE = new Hora();
        this.HS = new Hora();
        this.placa = placa;
        this.calPag = new double[3];
    }

    public Hora getHE() {
        return HE;
    }

    public void setHE(Hora HE) {
        this.HE = HE;
    }

    public Hora getHS() {
        return HS;
    }

    public void setHS(Hora HS) {
        this.HS = HS;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double[] getCalPag() {
        return calPag;
    }

    public void setCalPag(double[] calPag) {
        this.calPag = calPag;
    }

    public double pagoTotal() {
        double pagoT = 0;
        if (HS.getHh() == 0) {
            pagoT = 0;
        } else {
            pagoT = ((HS.getHh() - HE.getHh()) * pago());
        }
        return pagoT;
    }
    double recTotal=0;
    public double recuado(double[] suma){
        
        
        for (int i = 0; i < suma.length; i++) {
          recTotal += suma[i]; 
        }
        
        return recTotal;
    }
    @Override
    public String toString() {
        return "\nTotal pagar = " + pagoTotal()
                + "\nhoraEntrada = " + HE.toString()
                + "\nhoraSalida = " + HS.toString()
                + "\nplaca = " + placa;
    }

    public abstract double pago();

}
