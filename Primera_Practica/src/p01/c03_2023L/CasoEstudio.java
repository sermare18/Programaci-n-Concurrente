package p01.c03_2023L;

public class CasoEstudio {

	public static void main(String[] args) {
		// Creación hilos concurrentes
		Thread hilo = new Thread(new MyUniqueThread('c',1000,5));
		
		
		// Ejecución hilos concurrentes
		hilo.start();
		

	}

}
