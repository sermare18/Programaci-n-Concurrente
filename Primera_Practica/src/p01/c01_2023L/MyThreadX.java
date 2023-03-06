package p01.c01_2023L;

public class MyThreadX implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i=0; i < 10; i++) {
			/*
			if(i==2) {
				Thread.yield(); //El hilo que se encuentre en esta línea suelte el núcleo
			}
			*/
			System.out.print("x");
			// Hacemos que el hilo actual ceda el control al planificador
            //Thread.yield();
		}
		System.out.println();
		
	}
	
	

}
