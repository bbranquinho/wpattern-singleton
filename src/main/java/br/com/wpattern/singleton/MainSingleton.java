package br.com.wpattern.singleton;

import br.com.wpattern.singleton.classes.SingletonClass;

public class MainSingleton {

	public static void main(String[] args) {

		SingletonClass singleton1 = SingletonClass.getInstance();

		singleton1.process();
		singleton1.setValue(1);
		singleton1.process();

		SingletonClass singleton2 = SingletonClass.getInstance();

		singleton2.process();
		singleton2.setValue(2);

		singleton1.process();

		singleton2.process();

	}

}
