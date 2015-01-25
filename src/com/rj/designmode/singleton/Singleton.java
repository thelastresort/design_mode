package com.rj.designmode.singleton;

public class Singleton {
	//双重检查加锁
	private volatile static Singleton sUniqueInstance;

	private Singleton() {
	};

	public static Singleton getISingleton() {
		if (sUniqueInstance == null) {
			synchronized (Singleton.class) {
				if (sUniqueInstance == null) {
					sUniqueInstance = new Singleton();
				}
			}
		}
		return sUniqueInstance;
	}
	
}
