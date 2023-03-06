package p01.c01_2023L;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CasoEstudio {
	/**
	 * 
	 * Crea tres tipos diferentes de hilos y los lanza con el método strat(). Cada
	 * uno de ellos escribirá 10^6 veces un carácter por pantalla. El primero escribe 
	 * el carácter 'x', el segundo el carácter 'o' y el tercero el carácter '-'.
	 * 
	 * @author sergiomartinreizabal 
	 */

	public static void main(String[] args) {
		
		// Creación hilos concurrentes
		Thread hilo_x = new Thread(new MyThreadX());
		Thread hilo_O = new Thread(new MyThreadO());
		Thread hilo_ = new Thread(new MyThread_());
		
		//ExecutorService exec = Executors.newCachedThreadPool();
		//ExecutorService exec = Executors.newSingleThreadExecutor();
		//ExecutorService exec = Executors.newFixedThreadPool(2);
		
		/*
		 * El método crea un objeto "ScheduledExecutorService" que implementa un grupo de subprocesos 
		 * que pueden ejecutar tareas de forma periódica o programada.
		 */
		//ScheduledExecutorService exec = Executors.newScheduledThreadPool(1);
		// Planificar la tarea que se repite cada 5 segundos
		//exec.scheduleAtFixedRate(hilo_x, 0, 5, TimeUnit.SECONDS);
		
		//exec.execute(hilo_x);
		//exec.execute(hilo_O);
		//exec.execute(hilo_);
		
		//exec.shutdown();
		
		
		// Ejecución hilos concurrentes
		hilo_x.start();
		hilo_O.start();
		hilo_.start();
		
	}

}

/*
 * Preguntas: Ejecuta el programa varias veces y analiza el resultado de cada ejecución. 
 * ¿Son las trazas de ejecución siempre iguales? Describe el funcionamiento del planificador de hilos.
 * El método yield de la clase Thread se encarga de dejar paso a otro hilo para que se ejecute, 
 * ¿ha cambiado algo en la ejecución?
 * 
 * El resultado de cada ejecución puede ser diferente debido al funcionamiento del planificador
 * de hilos. El planificador de hilos es un componente del sistema operativo encargado de asignar 
 * los recursos de procesamiento disponibles entre los hilos en ejecución. El planificador asigna a 
 * cada hilo un pequeño trozo de tiempo de procesamiento en el procesador de manera intercalada para 
 * que los hilos avancen en su ejecución.
 * 
 * Es importante mencionar que el planificador de hilos no garantiza un orden específico de ejecución 
 * de los hilos. En cada ejecución, el planificador puede cambiar el orden de ejecución de los hilos, 
 * lo que puede producir resultados diferentes.
 * 
 * El método yield() de la clase Thread se encarga de hacer que el hilo actual ceda el control 
 * al planificador para que otro hilo pueda ejecutarse.
 * 
 * En el programa descrito en la pregunta, el método yield() no tiene ningún efecto visible en
 * la ejecución del programa ya que cada hilo está imprimiendo en pantalla un carácter y luego 
 * esperando por un corto tiempo antes de imprimir el siguiente carácter. El método yield() solo 
 * tendría un efecto significativo si los hilos estuvieran realizando alguna tarea intensiva en 
 * términos de procesamiento y estuvieran esperando por algún recurso para completar su tarea. 
 * En ese caso, el método yield() podría ayudar a mejorar la eficiencia del programa.
 */
