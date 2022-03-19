package _04_Thread_Pool;

public class WorkPool implements Runnable{

	private Thread threads[];
	public boolean isRunning = true;
	//on slide #26
	//on slide #26
	//on slide #26
	//on slide #26
	
	public WorkPool() {
		 	int totalThreads = Runtime.getRuntime().availableProcessors() - 1;
		 	threads = new Thread[totalThreads];
		 	for(int i = 0; i < threads.length; i++) {
		 		threads[i] = new Thread(this);
		 		threads[i].start();
		 	}
	}
	@Override
	public void run() {
		
	}
	
	public int getThreadCount() {
		return threads.length;
	}

}