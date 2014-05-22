/**
 * 
 */
package javaBasics;

/**
 * @author hari
 *
 */
public class ThreadJoin {
	private static int count;
	
	private static synchronized int increment() {
		return count++;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i =0;i<1000; i++) {
					increment();
				}
				
			}


		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i =0;i<1000; i++) {
					increment();
				}
				
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println("Count is " + count);
	}

}
