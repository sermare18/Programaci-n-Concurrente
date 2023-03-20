package p02.c02;

public class AdaptadorParqueSincronizado implements IParque {
	
	// Instancia de parque
	private IParque parque;
	
	private static AdaptadorParqueSincronizado instancia = new AdaptadorParqueSincronizado();
	
	// Patrón Singleton
	private AdaptadorParqueSincronizado() {
		parque = new Parque();
	}

	@Override
	public synchronized void entrarAlParque(char puerta) {
		parque.entrarAlParque(puerta);
		
	}
	
	public static AdaptadorParqueSincronizado getInstancia() {
		return instancia;
	}

}
