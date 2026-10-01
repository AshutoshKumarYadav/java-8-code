package PracticeJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Testp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//output  {Sales=2, ETS=1, IT=2}
		
		
		List<__Office>listOfOffice=new ArrayList<__Office>(
		Arrays.asList(new __Office(101,"Sales"),
		new __Office(201,"IT"),
		new __Office(301,"IT"),
		new __Office(401,"Sales"),
		new __Office(501,"ETS")
		));
		Map<String,Long>res= listOfOffice.stream().collect(Collectors.groupingBy(__Office::getDeptName,Collectors.counting()));
		System.out.println(res);
		List<String>res1= listOfOffice.stream().map(__Office::getDeptName).collect(Collectors.toList());
		System.out.println(res1);
		
	}

}


class __Office 
{
int deptId;
String deptName;
public int getDeptId() {
return deptId;
}
public void setDeptId(int deptId) {
this.deptId = deptId;
}
public String getDeptName() {
return deptName;
}
public void setDeptName(String deptName) {
this.deptName = deptName;
}
public __Office(int deptId, String deptName) {
super();
this.deptId = deptId;
this.deptName = deptName;
}
@Override
public String toString() {
return "Office [deptId=" + deptId + ", deptName=" + deptName + "]";
}
public __Office() {
super();
}
}     
/*
 * public class Test { //output {Sales=2, ETS=1, IT=2} public static void
 * main(String[] args) { List<__Office>listOfOffice=new ArrayList<__Office>(
 * Arrays.asList(new __Office(101,"Sales"), new __Office(201,"IT"), new
 * __Office(301,"IT"), new __Office(401,"Sales"), new __Office(501,"ETS") ));
 * Map<String,Long>res= }
 */
