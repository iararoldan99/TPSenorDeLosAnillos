package app.personajes;

import java.util.ArrayList;
import java.util.List;
import app.armas.Arma;


/**
 * Personaje
 */
public class Personaje {

    private String nombre;
    private int salud;
    private int stamina;
    private int defensa;
    private boolean seleccionado;
//agrego factorDeVelocidadDeAtaque. Aca seria la base necesaria para que el ataqueEpico de Vilya tenga sentido y, por cierto, funcione jaja.

private double factorDeVelocidadDeAtaque;

    public double getFactorDeVelocidadDeAtaque() {
        return factorDeVelocidadDeAtaque;
    }

    public void setFactorDeVelocidadDeAtaque(double factorDeVelocidadDeAtaque) {
        this.factorDeVelocidadDeAtaque = 0.15;

    }
    
//agrego factorRegeneracionSalud.

private double factorRegeneracionSalud;
    public double getFactorRegeneracionSalud() {
        return factorRegeneracionSalud;
    }

    public void setFactorRegeneracionSalud(double factorRegeneracionSalud) {
        this.factorRegeneracionSalud = factorRegeneracionSalud;
    }

//agrego factorRegeneracionStamina

private double factorRegeneracionStamina;
    public double getFactorRegeneracionStamina() {
        return factorRegeneracionStamina;
    }

    public void setFactorRegeneracionStamina(double factorRegeneracionStamina) {
        this.factorRegeneracionStamina = factorRegeneracionStamina;
    }

//agrego danioDeAtaque

private int danioDeAtaque;
    public int getDanioDeAtaque() {
        return danioDeAtaque;
    }

    public void setDanioDeAtaque(int danioDeAtaque){
        this.danioDeAtaque = danioDeAtaque;
    }


    private List<Arma> armas = new ArrayList<>();

    public Personaje() {    }

    public Personaje(String nombre, int salud, int stamina) {
        this.nombre = nombre;
        this.salud = 100;
        this.stamina = stamina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public List<Arma> getArmas() {
        return armas;
    }

    public void setArmas(List<Arma> armas) {
        this.armas = armas;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public boolean isSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(boolean seleccionado) {
        this.seleccionado = seleccionado;
    }

    public boolean estaVivo() {

        if(this.getSalud() == 0 || this.getSalud() < 1){
            return false;
        }
        return true;

    }
    public void atacar(Personaje personaje, Arma arma){
        System.out.println("El personaje empezo a atacar");


    }

}





    

     

    

    

    