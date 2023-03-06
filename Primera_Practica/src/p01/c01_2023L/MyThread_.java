package p01.c01_2023L;

public class MyThread_ implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i < 10; i++) {
			System.out.print("-");
			// Hacemos que el hilo actual ceda el control al planificador
            //Thread.yield();
		}
		System.out.println();
		
	}
	
	

}