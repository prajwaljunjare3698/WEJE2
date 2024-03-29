package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Emp{
	int id;
	String name;
	int age;
	String gender;
	double sal;
	public Emp(int id, String name, int age, String gender, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", sal=" + sal + "]";
	}	
}

public class Questions {
	public static void main(String[] args) {
		ArrayList<Emp> a = new ArrayList<>();
		a.add(new Emp(1, "akshay", 25, "male", 2700));
		a.add(new Emp(2, "rusi", 24, "male", 6900));
		a.add(new Emp(3, "samruddhi", 27, "female", 1100));
		a.add(new Emp(4, "satish", 28, "male", 9000));
		a.add(new Emp(5, "pratiksha", 24, "female", 4500));
		a.add(new Emp(5, "pratiksha", 24, "female", 3200));
		a.add(new Emp(6, "ajay", 22, "male", 8600));
		
		//greater sal >8000
//		a.stream().filter(e-> e.getSal()>8000).map(e->e.getName()).forEach(System.out::println);
		
//		max sal
//		Emp max = a.stream().max(Comparator.comparing(Emp::getSal)).get();
//		System.out.println(max.getName());
		
//		lowest sal
//		Emp min = a.stream().min(Comparator.comparingDouble(Emp::getSal)).get();
//		System.out.println(min.getName());
		
//		sort by name
//		a.stream().sorted(Comparator.comparing(Emp::getName)).collect(Collectors.toList()).forEach(System.out::println);
		
//		sort by name if names are same then by sal
//		a.stream().sorted(Comparator.comparing(Emp::getName).thenComparing(Emp::getSal)).collect(Collectors.toList()).forEach(System.out::println);
		
		
//		oldest age emp
//		Emp oldest = a.stream().sorted(Comparator.comparing(Emp::getAge).reversed()).limit(1).findFirst().get();
//		System.out.println(oldest);
		
//		name of male emp
//		a.stream().filter(e-> e.getGender().equalsIgnoreCase("male")).collect(Collectors.toList()).forEach(System.out::println);
		
//		count male emp
//		long count = a.stream().filter(e-> e.getGender().equalsIgnoreCase("male")).count();
//		System.out.println(count);
		
//		sal of male emp
//		a.stream().filter(e-> e.getGender().equalsIgnoreCase("male")).collect(Collectors.toList()).forEach(System.out::println));
//		System.out.println(list);
		
//		total sal of male Emp
//		a.stream().filter(e-> e.getGender().equalsIgnoreCase("male")).
				
//		no of emp in each dept
//		Map<String, Long> dept = a.stream().collect(Collectors.groupingBy(Emp::getGender,Collectors.counting()));
//		System.out.println(dept);
		
//		avg sal
//		Double avg = a.stream().collect(Collectors.averagingDouble(Emp::getSal));
//		System.out.println(avg);
		
//		total sal
//		Double totalSal = a.stream().collect(Collectors.summingDouble(Emp::getSal));
//		System.out.println(totalSal);
		
//		top 3 sal
//		List<Emp> first = a.stream().sorted(Comparator.comparing(Emp::getSal).reversed()).limit(3).collect(Collectors.toList());
//		System.out.println(first);
		
		
		
//		first non repeating char from string		
//		String input = "abdvabadvb";
//        Character result =  input.chars()      //string stream
//             .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i))) //convert to lowercase & then to Character object
//             .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //store in a map with the count
//             .entrySet().stream()  //entryset stream
//             .filter(entry -> entry.getValue() == 1L)
//             .map(entry -> entry.getKey())
//             .findFirst().get();
//	    System.out.println(result);
	        
//		first repeated char from string
//		String input = "abdvabadvb";
//      Character first =  input.chars()      //string stream
//           .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i))) //convert to lowercase & then to Character object
//           .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //store in a map with the count
//           .entrySet().stream()  //entryset stream
//           .filter(entry -> entry.getValue() > 1L)
//           .map(entry -> entry.getKey())
//           .findFirst().get();
//	    System.out.println(first);		
		
//		convert string list to integer/long
//		List<String> l = new ArrayList<>(Arrays.asList("12","14","89","673","53"));
//		List<Integer> intValues = l.stream().map(e-> Integer.parseInt(e)).collect(Collectors.toList());
//		System.out.println(intValues       );
		
//		by method refference
//		List<Integer> intValues = l.stream().map(Integer::parseInt).collect(Collectors.toList());
//		System.out.println(intValues);
		
		
		
		
		
		
		
	}
}
