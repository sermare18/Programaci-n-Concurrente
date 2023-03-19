package p02.c02;

import java.util.Random;

public class ActividadEntradaPuerta implements Runnable {
	
	// Máximo número de entrdas al parque por cada puerta
	private static final int NUMENTRADAS = 20;
	
	// Parque
	private IParque parque;
	
	// Puerta
	private char puerta;
	
	//Constructor
	public ActividadEntradaPuerta(IParque parque, char puerta) {
		this.parque = parque;
		this.puerta = puerta;
	}
	

	@Override
	public void run() {
		
		// Entrar al parque 20 veces
		for (int i = 0; i < NUMENTRADAS; i++) {
			parque.entrarAlParque(puerta);
		}
		
	}



}
