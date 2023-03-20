package p02.c01;

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
		
		Random random = new Random();
        int tiempoDeEspera = random.nextInt(5 - 1 + 1) + 1; // Genera un número aleatorio entre 1 y 5
		
		// Entrar al parque 20 veces
		for (int i = 0; i < NUMENTRADAS; i++) {
			
			try {
				Thread.sleep(tiempoDeEspera * 1000); // Pausa la ejecución del hilo durante el tiempo de espera
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			parque.entrarAlParque(puerta);
		}
		
	}



}
