package org.examples.hello;

import javax.persistence.EntityManager;

public class HelloServiceImpl implements HelloService {

	private EntityManager entityManager;

	public void sayHello() {
		System.out.println("Say Hello from the service");

	}

	public void setEntityManager(EntityManager e) {
		System.out.println("Setting entity manager" + e.toString());
		this.entityManager = e;
	}

}
