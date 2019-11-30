/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Michael
 */
public class Carro extends Vehiculo{

    public Carro(Hora HE, Hora HS, String placa, double[] calPag) {
        super(HE, HS, placa, calPag);
    }
    
    public Carro() {
        super();
    }
    
    @Override
    public String toString() {
        return "\nTipo Vehiculo = Carro" + super.toString();
    }

    @Override
    public double pago() {
        return 6000;
    }
    
}
