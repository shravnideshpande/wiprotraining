package milestone3assisment.milestone3assisment.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import milestone3assisment.milestone3assisment.Employee;

public class EmployeeMain {

	public static void main (String[]args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("employeecontext.xml");
		
		Employee employee = (Employee) context.getBean("e1");
		
		     Map<String,Integer> sr=new HashMap<>();
		     
		       sr = employee.getSkillRatings();
		  
		       ArrayList<String> arrayList = new ArrayList<String>();
		       
		         for(Map.Entry<String,Integer> valueEntry: sr.entrySet()) {
		        	 
		        	 if(valueEntry.getValue()>=8) {
		        		 arrayList.add(valueEntry.getKey());
		        	 }
		         }
	               System.out.println(arrayList);
	               context.close();
	              
	}
	
}
