/**
 * 
 */
package javaBasics;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author hari
 * 
 */
public class TimingOut {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		TimingOut timingOut = new TimingOut();
		final TimingOut.Something sth = timingOut.new Something();

		// System.out.println("Result is " + sth.foobar());
		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<?> future = service.submit(new Callable<Object>() {
			public Object call() throws Exception {
				Object o = sth.foobar();
				return o;
			}
		});
		System.out.println("asdadsa");
		// futureTask.run();
		// try {
		// System.out.println("a is " + futureTask.get());
		// } catch (ExecutionException e1) {
		// System.out.println("Exception: " + e1);
		// }
		try {
			Object o = future.get(5 * 1000, TimeUnit.MILLISECONDS);
			System.out.println("Result is " + o);
		} catch (ExecutionException | TimeoutException e) {
			System.out.println("Exception: " + e);
		}
	}

	public class Something {

		public void foo() throws InterruptedException {
			System.out.println("Date is " + System.currentTimeMillis());
			long millis = 2 * 1000;
			Thread.sleep(millis);

		}

		public Integer foobar() throws InterruptedException {
			System.out.println("Date is " + System.currentTimeMillis());
			long millis = 2 * 1000;
			Thread.sleep(millis);
			System.out.println("Done. " + +System.currentTimeMillis());
			return Integer.valueOf(-1);
		}
	}

}
