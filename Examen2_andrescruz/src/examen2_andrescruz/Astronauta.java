/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_andrescruz;

/**
 *
 * @author MBanegas
 */
public class Astronauta {
    String nombre;
    String nacionalidad;
    double sueldo;
    String experiencia;
    String sexo;
    double peso;

    public Astronauta(String nombre, String nacionalidad, double sueldo, String experiencia, String sexo, double peso) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.sueldo = sueldo;
        this.experiencia = experiencia;
        this.sexo = sexo;
        this.peso = peso;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + " Nacionalidad=" + nacionalidad + " Sueldo=" + sueldo + " Experiencia=" + experiencia + " Sexo=" + sexo + " Peso=" + peso;
    }
    
    
}
