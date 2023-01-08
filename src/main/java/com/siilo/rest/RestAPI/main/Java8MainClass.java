package com.siilo.rest.RestAPI.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.siilo.rest.RestAPI.model.Employee;

public class Java8MainClass {
	
	public static void main(String [] args)
	{
		
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				for(int i=0 ; i<3 ;i++)
				{
				
					System.out.println("Hello world from thread" + 
				Thread.currentThread().getName());
		
				}
			}
		};
		
		
			
			Runnable run2 = () -> 
			{
				for(int i=0 ;i<3;i++)
				{
					
				System.out.println("Running the thread 2 using lamda"
						 + Thread.currentThread().getName());
			
				}
				};
				
				Thread t = new Thread(run);
				t.start(); 
				Thread t2 = new Thread(run2);
				t2.start(); 
				
				
		Comparator<String> compu = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		};		
		List<String> strList = Arrays.asList("Priyanshu" , "Shivanshu" ,"Nishant", "Atharv");
		Collections.sort(strList, compu);
		strList.forEach(System.out::println);

		List<String> strList2 = Arrays.asList("Suman" , "Alka" ,"neha", "apoorva");
		Comparator<String> s= (st1, st2) -> st1.compareTo(st2);		
		Collections.sort(strList2, s);
		strList2.forEach(System.out::println);

		
				
		
		/*
		 * BufferedReader buffer = new BufferedReader( new
		 * InputStreamReader(Java8MainClass.class.getResourceAsStream("emp.txt")));
		 */
		
		
		/*
		 * Stream<String> stream = reader.lines(); List<Employee> empList = new
		 * ArrayList<>(); stream.map(line -> { String[] arr = line.split(","); Employee
		 * emp = new Employee(); emp.setEmpId(Integer.parseInt(arr[0]));
		 * emp.setName(arr[1]); emp.setSkills(arr[2]); empList.add(emp); return emp; }
		 * 
		 * ).forEach(System.out::println);
		 */
		List<Employee> empList = new ArrayList<>();
		Employee emp = new Employee();
		emp.setEmpId(88);
		emp.setName("Priyanshu");
		emp.setSkills("JAVA");
		empList.add(emp);
		Employee emp2 = new Employee();
		emp2.setEmpId(2);
		emp2.setName("Shivanshu");
		emp2.setSkills("Go");
		empList.add(emp2);
		Employee emp3 = new Employee();
		emp3.setEmpId(7);
		emp3.setName("Divyanshu");
		emp3.setSkills("JAVA");
		empList.add(emp3);
		Employee emp4 = new Employee();
		emp4.setEmpId(4);
		emp4.setName("Atahrv");
		emp4.setSkills("BigData");
		empList.add(emp4);
		List<Integer> list=empList.stream().map(
				x -> x.getEmpId()
				).collect(Collectors.toList());
		
		System.out.println(empList.stream().min(Comparator.comparing(Employee :: getEmpId)).get());
		
		System.out.println(list.stream().min(Integer::compare).get());
		System.out.println(list.stream().max(Integer::compare).get());
		
 		
		
		//Ist way of sorting
		empList.sort(Comparator.comparing(a -> a.getEmpId()));
		empList.forEach(System.out::println);
		//Second Higets Ssalry or emp id
		Optional<Employee> empOpt=empList.stream().sorted(Comparator.comparingInt(Employee::getEmpId).reversed()).skip(1).findFirst();		
		System.out.println(empOpt.get());
		
			List<Employee> empSort =empList.stream().sorted(Comparator.comparingInt(Employee::getEmpId).reversed()).collect(Collectors.toList());
			System.out.println("Second higgetehs" +empSort.get(1));
			/*
		 * list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		 * 
		 * System.out.println(list.stream().allMatch(x-> x >0));
		 * 
		 * // list.stre
		 */	}

}
