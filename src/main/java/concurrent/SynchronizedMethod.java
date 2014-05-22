/**
 * 
 */
package concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author hari
 * 
 */
public class SynchronizedMethod {

	private static List<Integer> list1 = new ArrayList<>();
	private static List<Integer> list2 = new ArrayList<>();
	
	private static Object lock1 = new Object();
	private static Object lock2 = new Object();

	private static  void foo() {
		synchronized(lock1) {
			Random random = new Random();
			for (int i = 0; i < 1000; i++) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				list1.add(random.nextInt(100));
			}
		}
		
	}

	private static synchronized void bar() {
		synchronized (lock2) {

			Random random = new Random();
			for (int i = 0; i < 1000; i++) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				list2.add(random.nextInt(100));
			}
		
		}
	}

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();

		ExecutorService service1 = Executors.newFixedThreadPool(2);
		int size = 2;
		for (int i = 0; i < size; i++) {
			service1.submit(new Runnable() {

				@Override
				public void run() {
					foo();
				}
			});
		}

		ExecutorService service2 = Executors.newFixedThreadPool(2);
		for (int i = 0; i < size; i++) {
			service2.submit(new Runnable() {

				@Override
				public void run() {
					bar();
				}
			});
		}
		
		service1.shutdown();
		service2.shutdown();
		service1.awaitTermination(1, TimeUnit.HOURS);
		service2.awaitTermination(1, TimeUnit.HOURS);
		
		long end = System.currentTimeMillis();
		System.out.println("Time is " + (end - start));
		System.out.println("List1 : " + list1.size());
		System.out.println("List2 : " + list2.size());

	}
}
