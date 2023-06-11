package com.hrithik.DesignPattern.Singleton;

public class SingletonMain {

	public static void main(String[] args) {

		LazySingleton lazy1 = LazySingleton.getObject();
		System.out.println(lazy1);

		LazySingleton lazy2 = LazySingleton.getObject();
		System.out.println(lazy2);

		EagerSingleton eager1 = EagerSingleton.getObj();
		System.out.println(eager1);

		EagerSingleton eager2 = EagerSingleton.getObj();
		System.out.println(eager2);

	}

}
