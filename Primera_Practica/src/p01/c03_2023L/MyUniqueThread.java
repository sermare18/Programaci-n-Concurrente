package p01.c03_2023L;

public class MyUniqueThread implements Runnable{
	
	//Variables de la clase
	private char caracter;
	
	private int sleep_time;
	
	private int num_prints;
	
	public MyUniqueThread(char caracter, int sleep_time, int num_prints) {
        this.caracter = caracter;
        this.sleep_time = sleep_time;
        this.num_prints = num_prints;
    }

	@Override
	public void run() {
		
				for (int i=0; i < num_prints; i++) {
					/*
					if(i==2) {
						Thread.yield(); //El hilo que se encuentre en esta línea suelte el núcleo
					}
					*/
					if (i % 2 == 0) {
						try {
							Thread.sleep(sleep_time);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					System.out.print(caracter);
					
					
				}
				System.out.println();
		
	}
	
	

}