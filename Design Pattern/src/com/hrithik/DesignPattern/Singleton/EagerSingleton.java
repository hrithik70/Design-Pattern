package com.hrithik.DesignPattern.Singleton;

public class EagerSingleton {
	
	public static EagerSingleton eager1 = new EagerSingleton();
	public static int count;
	
	private EagerSingleton()
	{
		count++;
	}
	
	public static EagerSingleton getObj()
	{
		return eager1;
	}

}
