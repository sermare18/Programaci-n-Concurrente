package p01.c02_2023L;

public class CasoEstudio {

	public static void main(String[] args) throws InterruptedException {
		
		Thread hiloX = new Thread(new MyThreadX());
		Thread hiloO = new Thread(new MyThreadO());
		Thread hilo_ = new Thread(new MyThread_());
		
		hiloX.start();
		hiloX.join(); // Esperamos a que acabe
		System.out.println("Hilo X Finalizado");
		
		hiloO.start();
		hiloO.join();
		System.out.println("Hilo O Finalizado");
		
		hilo_.start();
		hilo_.join();
		System.out.println("Hilo - Finalizado");
	}
}