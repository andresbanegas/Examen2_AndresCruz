/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_andrescruz;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author MBanegas
 */
public class Tripulada extends Naves{

    String despegue;
    ArrayList<Astronauta> astronautas = new ArrayList();

    public Tripulada(String despegue, String num_serie, Planeta destino, double velocidad) {
        super(num_serie, destino, velocidad);
        this.despegue = despegue;
    }

    public String getDespegue() {
        return despegue;
    }

    public void setDespegue(String despegue) {
        this.despegue = despegue;
    }

    public ArrayList<Astronauta> getAstronautas() {
        return astronautas;
    }

    public void setAstronautas(ArrayList<Astronauta> astronautas) {
        this.astronautas = astronautas;
    }

    public String getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(String num_serie) {
        this.num_serie = num_serie;
    }

    public Planeta getDestino() {
        return destino;
    }

    public void setDestino(Planeta destino) {
        this.destino = destino;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Tripulada{" + "despegue=" + despegue + ", astronautas=" + astronautas + '}';
    }

    @Override
    public double[] calcularTiempo() {
        double[] tiempos = new double[2];
        tiempos[0] = ida();
        tiempos[1] = regreso();
        return tiempos;
    }

    public double ida() {
        return super.destino.getDistancia() / (super.velocidad * (Math.pow(pesos(), 2) / 100));
    }

    public double regreso() {
        return super.destino.getDistancia() / (super.velocidad * (pesos() / 100));
    }

    public double pesos() {
        double totp = 0;
        for (int i = 0; i < astronautas.size(); i++) {
            totp += astronautas.get(i).getPeso();
        }
        return totp;
    }
}
