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
public class Parqueo {

    ArrayList<Vehiculo> Registrar;

    public Parqueo(ArrayList<Vehiculo> RegistroVehiculo) {
        this.Registrar = RegistroVehiculo;
    }

    public Parqueo() {
        this.Registrar = new ArrayList();
    }
     
    public ArrayList<Vehiculo> getRegistroVehiculo() {
        return Registrar;
    }

    public void setRegistroVehiculo(ArrayList<Vehiculo> RegistroVehiculo) {
        this.Registrar = RegistroVehiculo;
    }
    
    public double recuado(){
        double sum=0;
        
        for (int i = 0; i < Registrar.size(); i++) {
            sum += Registrar.get(i).pagoTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        String datos = "";
        for (int i = 0; i < Registrar.size(); i++) {
            datos += Registrar.get(i).toString() + "\n";
        }
        return datos;
    }

}
