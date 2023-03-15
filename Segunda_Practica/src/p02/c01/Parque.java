package p02.c01;

import java.util.Collection;
import java.util.Hashtable;

public class Parque implements IParque{
	
	// N personas totales
	private int personasTotales = 0;
	
	// N personas por puerta Hashtable<Char, Integer> (solo puede entrar un hilo a la vez
	private Hashtable<Character, Integer> dict = new Hashtable<Character, Integer>();

	public void entrarAlParque(char puerta) {
		
		// Inicializar claves
		if(!dict.containsKey(puerta)) {
			dict.put(puerta, 0);
		}
		
		// Actualizar los contadores 
		dict.put(puerta, dict.get(puerta) + 1);
		
		// Actualizar numero personas totales
		this.personasTotales++;
		
		// Mensaje 
		this.enviarMensaje(puerta);
		
		// Comprobar el invariante 
		
		Collection<Integer> valores = dict.values();
		
		int sumatorioPuertas = 0;
		
		for (Integer valor : valores) {
		    sumatorioPuertas += valor;
		}
		
		assert(personasTotales == sumatorioPuertas);
		
		
	}
	
	public void enviarMensaje(char puerta) {
		System.out.printf("\nEntrada al parque por puerta %c", puerta);
		System.out.printf("\n--> Personas en el parque %d", personasTotales);
		System.out.printf("\n----> Por puerta A %d", dict.get('A'));
		System.out.printf("\n----> Por puerta B %d", dict.get('B'));
	}
	
}
