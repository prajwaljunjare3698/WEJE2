package com.jspider.Practice;


public class StudentBuilder {
	
	public static StudentEntity create() {
		return StudentEntity.builder().name("akash").description("descent body").id(1).build();
	}
	
	public static void main(String[] args) {
//		StudentEntity create = create();
		System.out.println(create());
	}
}