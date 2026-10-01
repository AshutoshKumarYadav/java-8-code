package PracticeJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeesData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Emplyoees> listOfEmployees = Arrays.asList(
				new Emplyoees("Alice",30,"HR","female",10.00,2015,2016)
				);
		
		List<Emplyoees> listOfEmployeess = new ArrayList<>();
		listOfEmployeess.add(new Emplyoees("Alice",30,"HR","female",10.00,2015,2016));
		listOfEmployeess.add(new Emplyoees("Ram",15,"IT","Male",20.00,2017,2020));
		listOfEmployeess.add(new Emplyoees("Ashutosh",12,"HR","female",10.00,2009,2021));
		listOfEmployeess.add(new Emplyoees("Ban",18,"Sales","Male",30.00,2010,2016));
		listOfEmployeess.add(new Emplyoees("Catt",20,"Marketing","Male",60.00,2011,2016));
		listOfEmployeess.add(new Emplyoees("Dog",9,"HR","Male",20.00,2015,2023));
		listOfEmployeess.add(new Emplyoees("Asdf",45,"Sales","female",30.00,2012,2019));
		listOfEmployeess.add(new Emplyoees("Nice",23,"Marketing","Male",30.00,2014,2024));
		listOfEmployeess.add(new Emplyoees("Durga",46,"IT","female",100.00,2013,2025));
		listOfEmployeess.add(new Emplyoees("Rohith",25,"Marketing","female",80.00,2015,2023));
		
		//Filter employees with salary greater than a certain amount 
		List<Emplyoees> salaryGrt = listOfEmployeess.stream().filter(x->x.getSalary()>50).collect(Collectors.toList());
		System.out.println("Salary greater than 50 : "+salaryGrt);
		System.out.println("*************************************************\n");
		
		
		//skip top 3 on the basis of salary and print rest
		List<Emplyoees> skipTopThree = listOfEmployeess.stream().sorted(Comparator.comparingDouble(Emplyoees::getSalary).reversed()).skip(3).collect(Collectors.toList());
		System.out.println("skipTopThree : "+skipTopThree);
		//Fetched top 3 salary
		List<Emplyoees> salaryTop3 = listOfEmployeess.stream().sorted(Comparator.comparingDouble(Emplyoees::getSalary).reversed()).limit(3).collect(Collectors.toList());
		System.out.println("salaryTop3 : "+salaryTop3);
		
		//Given an employee list , sort employee based on there salary in descending order.
		
		List<Emplyoees> salaryDesc = listOfEmployeess.stream().sorted(Comparator.comparingDouble(Emplyoees::getSalary).reversed()).collect(Collectors.toList());
		System.out.println("Desc Name : " + salaryDesc.getFirst().getName().toString() + " Salary : "+salaryDesc.getFirst().getSalary());
		
		List<Emplyoees> salaryDesc1 = listOfEmployeess.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).collect(Collectors.toList());
		System.out.println("Desc salary : "+ salaryDesc1);
		
		//How many male or female employee are there in company
		Map<String,Long> gender = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getGender,Collectors.counting()));
		System.out.println(gender);
		
		
		
		//Print the name of all department in the organization
		//Map<String, String> allDept = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getDepartment,Emplyoees::getName));
		listOfEmployeess.stream().map(Emplyoees::getDepartment).distinct().forEach(System.out::println);
		//System.out.println(allDept);
		
		
		//Average age of male and female employee
		Map<String,Double> ageMaleAndFemale = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getGender,Collectors.averagingInt(Emplyoees::getAge)));
		System.out.println(ageMaleAndFemale);
		
		//get the detail of highest paid salary in the organization
		Optional<Emplyoees> highestSalary = listOfEmployeess.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Emplyoees::getSalary)));
		System.out.println(highestSalary);
		System.out.println(" Name :"+highestSalary.get().getName()+"\n Salary: "+highestSalary.get().getSalary());
		
		//get the name of employee who have joined after 2015
		System.out.println("*******************************************************");
		listOfEmployeess.stream().filter(x->x.getDateOfjoining()>=2015).map(Emplyoees::getName).forEach(System.out::println);
		
		//Count the number of employee in each department
		System.out.println("*******************************************************");
		Map<String,Long> numberOfEmpEachDept = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getDepartment,Collectors.counting()));
		System.out.println(numberOfEmpEachDept);
		
		//What is the avarage salary of each department
		System.out.println("*******************************************************");
		Map<String,Double> avrgSalary = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getDepartment,Collectors.averagingDouble(Emplyoees::getSalary)));
		System.out.println(avrgSalary);
		
		//get the details of youngest male emloyee in product department (IT)
		System.out.println("*******************************************************");
		Optional<Emplyoees> youngestEmp = listOfEmployeess.stream().filter(x->x.getGender()=="Male" && x.getDepartment()=="IT").min(Comparator.comparingInt(Emplyoees::getAge));
		System.out.println(youngestEmp);
		
		//Who has thge most working experince in the organization
		System.out.println("*******************************************************");
		Optional<Emplyoees> mostExp = listOfEmployeess.stream().sorted(Comparator.comparingInt(Emplyoees::getDateOfjoining)).findFirst();
		System.out.println(mostExp);
		System.out.println("*******************************************************working experince");
		Optional<Emplyoees> numInt = listOfEmployeess.stream().max(Comparator.comparingInt(x->x.getLastDateInCompany()-x.getDateOfjoining()));
		System.out.println(numInt);
		
		//how many male and female employee are there in sales and marketing departement
		System.out.println("*******************************************************");
		Map<String, Long> mFemaleIt_Dept = listOfEmployeess.stream().filter(x->x.getDepartment()=="IT").collect(Collectors.groupingBy(Emplyoees::getGender,Collectors.counting()));
		System.out.println(mFemaleIt_Dept);
		
		// what is the average salary of male and female employee
		System.out.println("*******************************************************");
		Map<String,Double> aVerageSalary = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getGender,Collectors.averagingDouble(Emplyoees::getSalary)));
		System.out.println(aVerageSalary);
		
		//List down name of all employee in eaach departement
		System.out.println("*******************************************************");
		Map<String, List<Emplyoees>> allEmpInEachDept =listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getDepartment));
		Set<Entry<String, List<Emplyoees>>> entry = allEmpInEachDept.entrySet();
		for(Entry<String, List<Emplyoees>> en:entry) {
			System.out.println("Employees In "+en.getKey());
			List<Emplyoees> ls = en.getValue();
			System.out.println(ls.stream().map(Emplyoees::getName).collect(Collectors.toList()));
		}
		
		
		//list down average salary and total salary of the whole organization
		System.out.println("*******************************************************");
		DoubleSummaryStatistics lsSalary = listOfEmployeess.stream().collect(Collectors.summarizingDouble(Emplyoees::getSalary));
		System.out.println("Average Salary : "+lsSalary.getAverage()+" \n Total salary "+lsSalary.getSum());
		
		//Separate the employees who are younger or equal to 25 years from those employee who are older than 25 years.
		System.out.println("*******************************************************");
		Map<Boolean, List<Emplyoees>> lsPartition = listOfEmployeess.stream().collect(Collectors.partitioningBy(x->x.getAge()>= 25));
		Set<Entry<Boolean, List<Emplyoees>>> entry1 = lsPartition.entrySet();
		for(Entry<Boolean, List<Emplyoees>> en : entry1) {
			if(en.getKey()) {
				System.out.println("Employees older than 25");
			}else {
				System.out.println("Employees younger than or equal to 25 years:");
				List<Emplyoees> ls = en.getValue();
				for(Emplyoees e: ls) {
					System.out.println("*********"+e.getName()+"*********");
				}
			}
			
			
		}
		
		
		
		//Who is the oldest employee in the organization and what is his age and from which departement?
		
		Optional<Emplyoees> oldestEmployee = listOfEmployeess.stream().sorted(Comparator.comparingInt(Emplyoees::getDateOfjoining)).findFirst();
		System.out.println("*********************");
		System.out.println("********* Oldest Age of Emp: "+oldestEmployee.get().getAge()+"\n ************** Dept : "+oldestEmployee.get().getDepartment());
		
		
	}

}
