package com.spring.jpa.scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
//@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public abstract class Singletone {

	@Autowired
	private Prototype prototype;

	@Lookup
	abstract Prototype createProtoObject();

	public Prototype getPrototype() {
		Prototype p = createProtoObject();
		return p;
	}

	public void setPrototype(Prototype prototype) {
		this.prototype = prototype;
	}

	public Singletone() {
		System.out.println("Singleton Constructor invoked");
	}

}
