package com.yenifergomez.dominio;

public class Jugador {

    private String nombreJugador;
    private int dineroJugador;
    private int apuestaJugador;

    public Jugador() {
    }

    public Jugador(String nombreJugador, int dineroJugador) {
        this.nombreJugador = nombreJugador;
        this.dineroJugador = dineroJugador;
        this.apuestaJugador=0;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public int getDineroJugador() {
        return dineroJugador;
    }

    public int getApuestaJugador() {
        return apuestaJugador;
    }
}
