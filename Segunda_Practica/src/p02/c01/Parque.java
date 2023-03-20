package p02.c01;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Parque implements IParque{
	
	// N personas totales
	private int personasTotales;
	
	// N personas por puerta Hashtable<Char, Integer> (solo puede entrar un hilo a la vez
	private Hashtable<Character, Integer> dict;
	
	
	public Parque() {
		this.personasTotales = 0;
		this.dict = new Hashtable<Character, Integer>();
		
	}

	public synchronized void entrarAlParque(char puerta) {
		
		// Actualizar numero personas totales
		this.personasTotales++;
		
		// Inicializar claves
		if(!dict.containsKey(puerta)) {
			dict.put(puerta, 0);
		}
		
		// Actualizar los contadores 
		dict.put(puerta, dict.get(puerta) + 1);
		
		// Mensaje 
		this.enviarMensaje(puerta);
		
		// Comprobar el invariante 
		checkInvariante();
		
		
		
	}
	
	public void enviarMensaje(char puerta) {
		System.out.printf("\nEntrada al parque por puerta %c", puerta);
		System.out.printf("\n--> Personas en el parque %d", personasTotales);
		System.out.printf("\n----> Por puerta A %d", dict.get('A') != null ? dict.get('A') : 0);
		System.out.printf("\n----> Por puerta B %d", dict.get('B') != null ? dict.get('B') : 0);
	}
	
	public void checkInvariante() {
		
		Collection<Integer> valores = dict.values();
		
		int sumatorioPuertas = 0;
		
		for (Integer valor : valores) {
		    sumatorioPuertas += valor;
		}
		
		assert(personasTotales == sumatorioPuertas);
	}
	
}
