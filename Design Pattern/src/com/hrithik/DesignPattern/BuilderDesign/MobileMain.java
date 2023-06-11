package com.hrithik.DesignPattern.BuilderDesign;

public class MobileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile mobile = new MobileBuilder().brand("Real Me").model("Narzo").colour("Green").getMobile();
		System.out.println(mobile);
	}

}
