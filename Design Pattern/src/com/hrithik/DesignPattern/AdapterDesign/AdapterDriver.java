package com.hrithik.DesignPattern.AdapterDesign;

public class AdapterDriver {

	public static void main(String[] args) {
		
		EmployeeEventAdapter ev1 = new EmployeeEventAdapter();
		ev1.id=1;
		ev1.name="Sara Ali Khan";
		ev1.email="saraji@gmail.com";
		ev1.contact=9876541023L;
		ev1.designation="Actress";
		ev1.womensDay();

	}

}
