package PracticeJava;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		List<Emplyoees> salaryGrtthanFifty = listOfEmployeess.stream().filter(x->x.getSalary()>50).collect(Collectors.toList());
		//System.out.println("******** salaryGrtthanFifty : "+salaryGrtthanFifty);
		
		//skip top 3 on the basis of salary  and print rest
		List<Emplyoees> emplSkip = listOfEmployeess.stream().sorted(Comparator.comparingDouble(Emplyoees::getSalary).reversed()).skip(3).collect(Collectors.toList());
		//System.out.println("************* emplSkip : "+emplSkip);
		
		//Fetched top 3 salary
		List<Emplyoees> topThreeFetched = listOfEmployeess.stream().sorted(Comparator.comparingDouble(Emplyoees::getSalary).reversed()).limit(3).collect(Collectors.toList());
		//System.out.println("******************** topThreeFetched : "+topThreeFetched);
		
		//Given an employee list , sort employee based on there salary in descending order.
		List<Emplyoees> sortEmplDesc = listOfEmployeess.stream().sorted(Comparator.comparingDouble(Emplyoees::getSalary).reversed()).collect(Collectors.toList());
		//System.out.println("************ sortEmplDesc : "+sortEmplDesc);
		
		
		
		//How many male or female employee are there in company
		Map<String, Long> maleFemaleCount = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getGender,Collectors.counting()));
		//System.out.println("********* maleFemaleCount : "+ maleFemaleCount);
		
		
		//Print the name of all department in the organization
		Map<String, List<Emplyoees>> listOfDepart = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getDepartment));
		//System.out.println("********** listOfDepart : "+listOfDepart);
		List<String> allDept  = listOfEmployeess.stream().map(Emplyoees::getDepartment).distinct().collect(Collectors.toList());
		//System.out.println("********** allDept : "+allDept);
		
		//Average age of male and female employee
		Map<String, Double> averageMaleFemale = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getGender,Collectors.averagingDouble(Emplyoees::getAge)));
		//System.out.println("************** averageMaleFemale : "+ averageMaleFemale);
		
		//get the detail of highest paid salary in the organization (if we want single output)
		List<Emplyoees> highestSalary = listOfEmployeess.stream().sorted(Comparator.comparingDouble(Emplyoees::getSalary).reversed()).collect(Collectors.toList());
		//System.out.println("**************** highestSalary : "+ highestSalary);
		
		List<Double> highestSalry1 = listOfEmployeess.stream().map(Emplyoees::getSalary).sorted().collect(Collectors.toList());
		//System.out.println("*********** highestSalry1 : "+highestSalry1.reversed());
		
		List<Emplyoees> highestSalry3 = listOfEmployeess.stream().sorted(Comparator.comparingDouble(Emplyoees::getSalary).reversed()).collect(Collectors.toList());
		//System.out.println("*********** highestSalry3 : "+highestSalry3);
		
		Optional<Emplyoees> highestSalry2 = listOfEmployeess.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Emplyoees::getSalary)));
		//System.out.println("*************** highestSalry2 : "+highestSalry2);
		
		//get the name of employee who have joined after 2015
		List<String> joinedAfter = listOfEmployeess.stream().filter(x->x.getDateOfjoining()>=2015).map(Emplyoees::getName).collect(Collectors.toList());
		//System.out.println("*************** joinedAfter : "+joinedAfter);
		//Count the number of employee in each department
		Map<String, Long> countEmpl = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getDepartment,Collectors.counting()));
		//System.out.println("************** countEmpl: "+countEmpl);
		
		//What is the avarage salary of each department
		Map<String, Double> averageSalary = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getDepartment,Collectors.averagingDouble(Emplyoees::getSalary)));
		//System.out.println("************** averageSalary : "+averageSalary);
		
		//get the details of youngest male emloyee in product department (IT)
		Optional<Emplyoees> getYoungestEmpl = listOfEmployeess.stream().filter(x->x.getGender()=="Male" && x.getDepartment()=="IT").min(Comparator.comparingInt(Emplyoees::getAge));
		//System.out.println("****************** getYoungestEmpl : "+getYoungestEmpl);
		
		
		List<Emplyoees> getYoungestEmpl1 = listOfEmployeess.stream().filter(x->x.getGender()=="Male" && x.getDepartment()=="IT").sorted(Comparator.comparingInt(Emplyoees::getAge)).collect(Collectors.toList());
		//System.out.println("****************** getYoungestEmpl : "+getYoungestEmpl1);
		
		List<Emplyoees> getYoungestEmpl2 = listOfEmployeess.stream().distinct().filter(x->"Male".equalsIgnoreCase(x.getGender()) && "IT".equalsIgnoreCase(x.getDepartment())).sorted(Comparator.comparingInt(Emplyoees::getAge)).collect(Collectors.toList());
		//System.out.println("****************** getYoungestEmpl : "+getYoungestEmpl2);
		
		List<Emplyoees> youngestMaleITEmployees = listOfEmployeess.stream()
			    .distinct()
			    .filter(x -> "Male".equals(x.getGender()) && "IT".equals(x.getDepartment()))
			    .sorted(Comparator.comparingInt(Emplyoees::getAge))
			    .collect(Collectors.toList());

			//System.out.println("****************** Youngest Male IT Employees: " + youngestMaleITEmployees);

		//Who has the most working experience in the organization
			Optional<Emplyoees> mostWorkingExp = listOfEmployeess.stream().max(Comparator.comparingInt(Emplyoees::getDateOfjoining));
			//System.out.println("********** mostWorkingExp : "+mostWorkingExp);
		
		//how many male and female employee are there in sales and marketing departement
			Map<String, List<Emplyoees>> maleFemaleSalesMar = listOfEmployeess.stream().filter(x->"".equalsIgnoreCase(x.getDepartment()) || "".equalsIgnoreCase(x.getDepartment()))
			.collect(Collectors.groupingBy(Emplyoees::getGender));
			
			//System.out.println("************ maleFemaleSalesMar : "+maleFemaleSalesMar);
		
		// what is the average salary of male and female employee
			Map<String, Double> listMaleFemale = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getGender,Collectors.averagingDouble(Emplyoees::getSalary)));
			//System.out.println("*************** listMaleFemale : "+listMaleFemale);
		
		//List down name of all employee in each department
			Map<String, List<Emplyoees>> listEmpName = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getDepartment));
			Set<Entry<String,List<Emplyoees>>> entry = listEmpName.entrySet();
			for(Entry<String,List<Emplyoees>> en : entry) {
				//System.out.println("Employees In "+en.getKey());
				List<Emplyoees> empListValue = en.getValue();
				//System.out.println("****** empListValue :"+empListValue.stream().map(Emplyoees::getName).collect(Collectors.toList()));
			}
			
			//listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getDepartment)).forEach((x,y)->System.out.println("Employees in "+x+":" + y.stream().map(Emplyoees::getName).collect(Collectors.toList())));
			
		
		//list down average salary and total salary of the whole organization
			DoubleSummaryStatistics listAverage = listOfEmployeess.stream().collect(Collectors.summarizingDouble(Emplyoees::getSalary));
			//System.out.println("************* listAverage : "+listAverage.getAverage() + "*************** total sum "+listAverage.getSum());
		
		
		//Separate the employees who are younger or equal to 25 years from those employee who are older than 25 years.
			//listOfEmployeess.stream().collect(Collectors.partitioningBy(x->x.getAge()>=25)).forEach((x,y)->System.out.println(" Younger than "+ x +" Older "+y));
			Map<Boolean, List<Emplyoees>> listEmpl = listOfEmployeess.stream().collect(Collectors.partitioningBy(x->x.getAge()>=25));
			Set<Entry<Boolean,List<Emplyoees>>> setEmp = listEmpl.entrySet();
			for(Entry<Boolean,List<Emplyoees>> en :setEmp ) {
				//System.out.println("Younger than  "+en.getKey());
				List<Emplyoees> listEmp = en.getValue();
				//System.out.println("Older than  "+listEmp.stream().collect(Collectors.toList()));
			}
		
		//Who is the oldest employee in the organization and what is his age and from which departement?
			Optional<Emplyoees> listOldestEmpl = listOfEmployeess.stream().sorted(Comparator.comparingInt(Emplyoees::getDateOfjoining)).findAny();
			System.out.println("************* Age  : "+listOldestEmpl.get().getAge()+" Department "+ listOldestEmpl.get().getDepartment());	
		
	}

}
