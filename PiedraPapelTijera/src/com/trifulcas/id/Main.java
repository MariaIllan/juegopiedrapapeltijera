package com.trifulcas.id;

public class Main {

	public static void main(String[] args) {
		 Jugador eva = new Jugador("Eva", new Teclado());
         Jugador juan = new Jugador("Juan", new CPU());
         //tres parámetros
         Juego ppt = new Juego(eva, juan, new JuegoPPT());
         //cuatro parámetros
         //Juego ppt = new Juego(eva, juan, new JuegoPPT(), new Consola());
         System.out.println(ppt.jugar());      
	}

}
