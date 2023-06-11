package com.hrithik.DesignPattern.Singleton;

public class LazySingleton {
	
	public static LazySingleton lazy1;
	public static int count;
	
	private LazySingleton()
	{
		count++;
	}
	
	public static LazySingleton getObject()
	{
		if(lazy1 == null)
		{
			lazy1 = new LazySingleton();
		}
		return lazy1;
	}

}
