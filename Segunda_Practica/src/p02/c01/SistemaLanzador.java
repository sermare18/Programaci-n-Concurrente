package p02.c01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SistemaLanzador {

	public static void main(String[] args) {
		
		// Variables (Parque)
		Parque parque = new Parque();
		
		// Crear los hilos
		Thread puertaA = new Thread(new ActividadEntradaPuerta(parque, 'A'));
		Thread puertaB = new Thread(new ActividadEntradaPuerta(parque, 'B'));
		
		ExecutorService exec = Executors.newFixedThreadPool(2);
		
		// Lanzar los hilos
		//puertaA.start();
		//puertaB.start();
		
		exec.execute(puertaA);
		exec.execute(puertaB);
		exec.shutdown();
		

	}

}
