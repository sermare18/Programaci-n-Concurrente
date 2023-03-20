package p02.c02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SistemaLanzador {
	
	// Constante que hace referencia al número de hilos (puertas) del parque
	private static final int NUM_HILOS = 5;

	public static void main(String[] args) {
		
		// Variables (Parque)
		IParque parque = AdaptadorParqueSincronizado.getInstancia();
		
		// Crear arreglo de hilos
		Thread[] hilos = new Thread[NUM_HILOS];
		
		// Inicializar los hilos en un ciclo for y agregarlos a un ExecutorService
		ExecutorService exec = Executors.newFixedThreadPool(NUM_HILOS);

		for (int i = 0; i < NUM_HILOS; i++) {
		    char identificador = (char)('A' + i);
		    hilos[i] = new Thread(new ActividadEntradaPuerta(parque, identificador), "Puerta" + identificador);
		    exec.execute(hilos[i]);
		}

		exec.shutdown();
		
	}

}
