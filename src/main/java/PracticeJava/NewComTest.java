package PracticeJava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewComTest {
	
	static class ThreadA extends Thread {
		public void run() {
			for(int i=0;i<10;i++) {
				//System.out.println("Ashutosh");
				try {
					Thread.sleep(100);
				}catch(InterruptedException e) {
					e.printStackTrace();
			}
		}
		
	}
	}
	static class ThreadB extends Thread{
		public void run() {
			for(int i=0;i<10;i++) {
				//System.out.println("Kumar");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th = new ThreadA();
		th.start();
		Thread tha = new ThreadB();
		/*
		 * if(th.isAlive()) { System.out.println("Th tread is running"); }
		 */
		
		try {
			th.join();
			th.yield();
			//th.setName("Ashutosh H1");
			//System.out.println(th.getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tha.start();
		//tha.setPriority(Thread.MAX_PRIORITY);
		//System.out.println(tha.getPriority());
		
		
		
		
		
		// find the dublicate element by using java 8
		List<Integer> list = Arrays.asList(1,4,6,3,4,83,5,7);
		List<Integer> collect = list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting())).entrySet().stream()
		.filter(x->x.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.print(collect);
		
		//shift right 0
		List<Integer> numbers = Arrays.asList(0, 1, 0, 3, 12,4,0,5,10);
		Stream<Integer> filter = numbers.stream().filter(x->x==0);
		Stream<Integer> filter1 = numbers.stream().filter(x->x>1);
		
		List<Integer> concat = Stream.concat(filter1, filter).toList();
		System.out.println(concat.toString());
		
		//Print the current date and time in format 12/30/2022 12:30:42
		LocalDate date = LocalDate.now();
		DateTimeFormatter dateTimefor = DateTimeFormatter.ofPattern("MM/dd/YYYY"); 
		String format = dateTimefor.format(date);
		System.out.println(format);
		
		List<Emplyoees> listOfEmployeess = new ArrayList<>();
		listOfEmployeess.add(new Emplyoees("Alice",30,"HR","female",10.00,2015,2016));
		listOfEmployeess.add(new Emplyoees("Ram",15,"IT","Male",20.00,2017,2020));
		listOfEmployeess.add(new Emplyoees("Ram",15,"IT","Male",20.00,2017,2020));
		listOfEmployeess.add(new Emplyoees("Ram",16,"IT","Male",30.00,2017,2020));
		listOfEmployeess.add(new Emplyoees("Ashutosh",12,"HR","female",10.00,2009,2021));
		listOfEmployeess.add(new Emplyoees("Ban",18,"Sales","Male",30.00,2010,2016));
		listOfEmployeess.add(new Emplyoees("Catt",20,"Marketing","Male",60.00,2011,2016));
		listOfEmployeess.add(new Emplyoees("Dog",9,"HR","Male",20.00,2015,2023));
		listOfEmployeess.add(new Emplyoees("Asdf",45,"Sales","female",30.00,2012,2019));
		listOfEmployeess.add(new Emplyoees("Nice",23,"Marketing","Male",30.00,2014,2024));
		listOfEmployeess.add(new Emplyoees("Durga",46,"IT","female",100.00,2013,2025));
		listOfEmployeess.add(new Emplyoees("Rohith",25,"Marketing","female",80.00,2015,2023));
		
		//Filter employees with salary greater than a certain amount
		List<Emplyoees> collect2 = listOfEmployeess.stream().filter(x->x.getSalary()>10).collect(Collectors.toList());
		System.out.println(collect2);
		
		int[] a = {3,5,7,8};
		int[] b= {6,7,4,3};
		//merge this two array into single one
		int[] array = Arrays.stream(new int[][] {a,b}).flatMapToInt(Arrays::stream).toArray();
		Arrays.stream(array).forEach(x-> System.out.print(x+" "));
		
		//Longest possible string
		List<String> prefixWord = Arrays.asList("flower","flow","flight");
		String orElse = prefixWord.stream().reduce(
				(a1,b1)->{
					int i=0;
					while(i<a1.length() && i<b1.length() && a1.charAt(i)==b1.charAt(i)) {
						i++;
					}
					return a1.substring(0,i);
				}).orElse("");
		System.out.println(orElse);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}