package p01.c02_2023L;

public class MyThread_ implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i < 1000000; i++) {
			if (i % 2 == 0) {
				try {
					Thread.sleep(1000); // Dormimos el hilo 1seg
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			for (int j=0; j<10000; j++) {
				System.out.print("-");
			}
		}
		System.out.println();
		
	}
	
	

}