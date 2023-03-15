package p02.c01;

public class SistemaLanzador {

	public static void main(String[] args) {
		
		// Variables (Parque)
		Parque parque = new Parque();
		
		// Crear los hilos
		Thread puertaA = new Thread(new ActividadEntradaPuerta(parque, 'A'));
		Thread puertaB = new Thread(new ActividadEntradaPuerta(parque, 'B'));
		
		// Lanzar los hilos
		puertaA.start();
		puertaB.start();
		

	}

}
