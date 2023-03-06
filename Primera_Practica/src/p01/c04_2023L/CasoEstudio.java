package p01.c04_2023L;

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
		
		/*
		 * Este ejecutor crea un conjunto de hilos que se reutilizan si están disponibles. 
		 * Si hay muchos trabajos en espera y no hay suficientes hilos disponibles para manejarlos, 
		 * se crean nuevos hilos. Si los hilos no se utilizan durante un tiempo, se eliminan. 
		 * Este es un buen ejecutor para trabajar con tareas de corta duración que se agregan 
		 * continuamente.
		 */
		//ExecutorService exec = Executors.newCachedThreadPool();
		
		/*
		 * Este ejecutor crea un conjunto de hilos fijos que se reutilizan. El número de hilos se 
		 * especifica en el momento de la creación y no cambia. Este es un buen ejecutor para trabajar 
		 * con tareas que deben ejecutarse en un orden específico y para limitar el número de tareas 
		 * que se ejecutan simultáneamente.
		 */
		//ExecutorService exec = Executors.newFixedThreadPool(1);
		
		/* Este ejecutor crea un solo hilo para ejecutar las tareas. Si se agrega una tarea mientras 
		 * otra tarea se está ejecutando, la segunda tarea se encola hasta que la primera tarea se 
		 * complete. Este es un buen ejecutor para trabajar con tareas que deben ejecutarse en un 
		 * orden específico y para evitar problemas de concurrencia.
		 */
		//ExecutorService exec = Executors.newSingleThreadExecutor();
		
		/*
		 * Este ejecutor crea un conjunto fijo de dos hilos que se reutilizan. El número de hilos se 
		 * especifica en el momento de la creación y no cambia. Este es un buen ejecutor para 
		 * trabajar con tareas que deben ejecutarse en un orden específico y para limitar el número 
		 * de tareas que se ejecutan simultáneamente.
		 */
		//ExecutorService exec = Executors.newFixedThreadPool(2);
		
		/*
		 * Este ejecutor crea un conjunto fijo de tres hilos que se reutilizan. El número de hilos se 
		 * especifica en el momento de la creación y no cambia. Este es un buen ejecutor para 
		 * trabajar con tareas que deben ejecutarse en un orden específico y para limitar el número 
		 * de tareas que se ejecutan simultáneamente.
		 */
		//ExecutorService exec = Executors.newFixedThreadPool(3);
		
		
		//exec.execute(hilo_x);
		//exec.execute(hilo_O);
		//exec.execute(hilo_);
		
		//exec.shutdown();
		
		
	}

}

/*
 * ¿Cuando se aconseja utilizar ejecutores en vez del método Thread.start()?
 * 
 * Se aconseja utilizar ejecutores en lugar de invocar directamente el método Thread.start() en las 
 * siguientes situaciones:
 * 
 * Gestión de tareas: Los ejecutores ofrecen una forma fácil y eficiente de gestionar tareas en una 
 * aplicación. En lugar de tener que administrar la creación y finalización de hilos de forma manual, 
 * los ejecutores pueden encargarse de la creación y asignación de hilos automáticamente, lo que reduce 
 * la complejidad del código.
 * 
 * Uso de recursos compartidos: Cuando varias tareas necesitan acceder a recursos compartidos, es 
 * importante evitar conflictos de concurrencia. Los ejecutores proporcionan mecanismos para coordinar 
 * y sincronizar el acceso a los recursos compartidos, lo que reduce la probabilidad de errores y 
 * aumenta la eficiencia del sistema.
 * 
 * Escalabilidad: Los ejecutores permiten una mayor escalabilidad que la creación de hilos manuales. 
 * Al utilizar un conjunto de hilos gestionados por el ejecutor, es posible asignar dinámicamente 
 * el número de hilos necesarios para gestionar el flujo de trabajo. Esto significa que el sistema 
 * puede adaptarse a cambios en la demanda de tareas sin comprometer el rendimiento.
 * 
 * En general, los ejecutores proporcionan una forma más eficiente y fácil de gestionar hilos y tareas 
 * en una aplicación que el uso directo de la clase Thread. Además, los ejecutores ofrecen una mayor 
 * flexibilidad y escalabilidad, lo que puede ser especialmente útil en aplicaciones con alta demanda 
 * de recursos y concurrencia.
 * 
 * 
 * ¿Qué se entiende por degrade gracefully de una aplicación?
 * 
 * el "degrade gracefully" es una estrategia importante de diseño de software que se enfoca en la 
 * capacidad de una aplicación para responder de manera útil y comprensible en situaciones de falla 
 * o sobrecarga del sistema, lo que ayuda a mejorar la experiencia del usuario y la confiabilidad 
 * del sistema.
 */
