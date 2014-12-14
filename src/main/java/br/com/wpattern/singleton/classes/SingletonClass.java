package br.com.wpattern.singleton.classes;

import org.apache.log4j.Logger;

import br.com.wpattern.singleton.interfaces.ISingletonClass;

public class SingletonClass implements ISingletonClass {

	private static Logger logger = Logger.getLogger(SingletonClass.class);

	private static SingletonClass singletonClass = null;

	private Integer value = null;

	// Construtor privado.
	private SingletonClass() {
	}

	public static SingletonClass getInstance() {
		if (singletonClass == null) {
			singletonClass = new SingletonClass();
		}

		return singletonClass;
	}

	@Override
	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public void process() {
		logger.info(String.format("Called method \"process()\" with Value [%s].", this.value));
	}

}
