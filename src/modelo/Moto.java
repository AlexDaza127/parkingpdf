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
public class Moto extends Vehiculo {

    public Moto(Hora HE, Hora HS, String placa, double[] calPag) {
        super(HE, HS, placa, calPag);
    }

    public Moto() {
        super();
    }

    @Override
    public String toString() {
        return "\nTipo Vehiculo = Moto = " + super.toString();
    }

    @Override
    public double pago() {
        return 2000;
    }

}
