package com.hrithik.DesignPattern.AdapterDesign;

public class EmployeeEventAdapter extends Employee implements Event {

	@Override
	public void womensDay() {

		System.out.println("Chief guest of the event is : " + this.name);
		System.out.println("Her designation is : " + this.designation);

	}

}
