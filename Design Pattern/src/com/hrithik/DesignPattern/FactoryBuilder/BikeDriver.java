package com.hrithik.DesignPattern.FactoryBuilder;

import java.util.Scanner;

public class BikeDriver {

	static Bike bike;

	public static void main(String[] args) {

		try {
			BikeFactory().buyBike();
			;
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private static Bike BikeFactory() {

		System.out.println("Please Enter Your Choice : \n" + "1.R15\n" + "2.Ninja Zx10R\n" + "3.BMW S1000r");

		Scanner sc = new Scanner(System.in);
		int chioce = sc.nextInt();
		switch (chioce) {
		case 1:
			bike = new R15();
			break;
		case 2:
			bike = new NinjaZx10R();
			break;

		case 3:
			bike = new S1000r();
			break;

		default:
			break;
		}

		return bike;
	}

}
