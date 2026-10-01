package PracticeJava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.stream.Collectors;

public class etc{
	
	static class AThread extends Thread{
		public void run() {
			for(int i=0;i<10;i++) {
				System.out.println("Ashutosh");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	static class BThread extends Thread{
		public void run() {
			for(int i=0;i<5;i++) {
				System.out.println("Kumar");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,4,6,3,4,83,5,7);
		Set<Integer> set = new HashSet<>();
		List<Integer> collect = list.stream().filter(x->!set.add(x)).collect(Collectors.toList());
		System.out.println(collect);
		List<Integer> collect2 = list.stream().distinct().collect(Collectors.toList());
		System.out.println(collect2);
		Set<Integer> collect3 = list.stream().collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting())).entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toSet());
		System.out.println(collect3);
		
		Thread t1 = new AThread();
		Thread t2 = new BThread();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Runnable task1 = () ->System.out.println("Task 1 executed "+ Thread.currentThread().getName());
		Runnable task2 = () ->System.out.println("Task 2 executed "+ Thread.currentThread().getName());
		// 1. execute() - Runnable (no result)
		executor.execute(task2);
		
		// 2. submit() - Runnable with Future
		executor.submit(task1);
		executor.submit(task2);
		
		
		// 3. submit() - Callable with result
		Future<String> future2 = executor.submit(()->{
			Thread.sleep(500);
			return "Calleble result";
		});
		future2.get();
		
		// 4. invokeAll() - List of Callables
		List<Callable<String>> task = Arrays.asList(
				()-> "Task 1",
				()-> "Task 2",
				()-> "Task 3"
				);
		
		List<Future<String>> results = executor.invokeAll(task);
		for(Future<String> result : results) {
			System.out.println(result.get());
		}
		executor.shutdown();// Always shut down the executor
		
		
	}

}


