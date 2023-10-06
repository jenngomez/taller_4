package com.yenifergomez.dominio;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MaquinaGuayabita {

    private String nombreMaquina;
    private List<Jugador> jugadoresGuayabita;
    //private int nroJugadores=0;
    //private int apuestaInicial=0;
    private int poteJuego;
    private Dado dado;

    public MaquinaGuayabita(String nombreMaquina) {
        this.nombreMaquina = nombreMaquina;
    }
    public MaquinaGuayabita() {
        jugadoresGuayabita = new ArrayList<>();
        dado =new Dado();
    }

    public void jugarGuayabita(){
           //Realizar la verificación con try-catch
            //Icon icon3 = new ImageIcon(MaquinaGuayabita.class.getResource("jugador.png"));

           int nroJugadores = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuántos jugadores desea inscribir?","Número de Jugadores",JOptionPane.QUESTION_MESSAGE));
           int apuestaInicial = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuál es el valor mínimo de la apuesta inicial?","Apuesta inicial",JOptionPane.QUESTION_MESSAGE));
           long nroJugadores2 = nroJugadores;
           for (int i=0; i <= nroJugadores2; i++){
            String nombreJugador = JOptionPane.showInputDialog(null, "Ingrese el nombre del jugador " + (i+1) + " :","Guayabita",JOptionPane.INFORMATION_MESSAGE);
            int dineroJugador = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el dinero del jugador "+ (i+1) + " :","Guayabita",JOptionPane.INFORMATION_MESSAGE));
            jugadoresGuayabita.add(new Jugador(nombreJugador,dineroJugador));
            }
    }

    /*public void pedirJugadores(){
        ImageIcon icon3 = new ImageIcon("/Users/jennifergomez/Documents/TÉCNICA EN SISTEMAS/DISEÑO SOFTWARE IV/INTELLIJ/Taller_4_YeniferGomez/src/main/java/com/yenifergomez/dominio/jugador.png");

        JOptionPane.showInputDialog(null,"¿Cuántos jugadores desea inscribir?","Número de Jugadores",JOptionPane.QUESTION_MESSAGE);
    }
    public static void  mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje,"POO",JOptionPane.PLAIN_MESSAGE);
    }*/

}
