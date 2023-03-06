package p01.c03_2023L;

public class EjemploSetPriority {
    public static void main(String[] args) {
        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run() {
            	for(int i=0; i<10000000; i++) {
            		System.out.println("El hilo 1 tiene prioridad " + Thread.currentThread().getPriority());
            		System.out.println();
            	}
                
            }
        });
        
        Thread hilo2 = new Thread(new Runnable() {
            @Override
            public void run() {
            	for(int i=0; i<10000000; i++) {
            		System.out.println("El hilo 1 tiene prioridad " + Thread.currentThread().getPriority());
            		System.out.println();
            	}	
            }            
        });
        
        Thread hilo3 = new Thread(new Runnable() {
            @Override
            public void run() {
            	for(int i=0; i<10000000; i++) {
            		System.out.println("El hilo 1 tiene prioridad " + Thread.currentThread().getPriority());
            		System.out.println();
            	}	
            }           
        });
        
        hilo1.setPriority(Thread.MIN_PRIORITY); // Prioridad mínima
        hilo2.setPriority(Thread.NORM_PRIORITY); // Prioridad normal (predeterminada)
        hilo3.setPriority(Thread.MAX_PRIORITY); // Prioridad máxima
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}

/*
 * ¿Qué se puede decir del orden en el que se activan los hilos? Cambia las prioridades de los hilos 
 * Thread.setPriority() y analiza los resultados de ejecución y el orden de activación.
 * 
 * Durante la ejecución, el orden de activación de los hilos no está garantizado, ya que es manejado 
 * por el planificador de hilos del sistema operativo. Sin embargo, debido a que el hilo3 tiene la 
 * prioridad más alta, es más probable que sea activado antes y que termine antes que los otros hilos.
 * 
 * En cuanto a los resultados de ejecución, se espera que cada hilo imprima su propia prioridad en 
 * cada iteración del bucle. Dado que los tres hilos realizan la misma tarea, se espera que la salida 
 * de la consola sea una mezcla de las líneas impresas por los tres hilos. Sin embargo, como hilo3 
 * tiene la prioridad más alta, es posible que imprima más líneas que los otros dos hilos. 
 * Además, es posible que algunas líneas impresas por hilo1 no se vean en la salida debido a que se 
 * ejecuta con la prioridad más baja.
 * 
 * En general, el resultado de la ejecución dependerá del sistema operativo y del planificador de 
 * hilos específicos utilizados en la máquina en la que se ejecute el código.
 */
