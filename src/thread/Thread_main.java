package thread;

public class Thread_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread_run[]th = new Thread_run[5];
		for(int n = 0; n < 4; n++) {
			th[n] = new Thread_run();
			th[n].start();
		}
		
		Thread_runnable[]th2 = new Thread_runnable[5];
		for(int n = 0; n < 4; n++) {
			th2[n] = new Thread_runnable();
			th2[n].run ();
		}
		
		for(int i = 0; i < 4; i++) {
		 try {
			th[i].join();
		 } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
		}
		
		for(int i=0;i<10;i++) { 
			System.out.println("main‚©‚ço—Í:"+i);
		}

	}
	
}	
