package org.examples.hello;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	private int id;

	private String author;

	private String title;

}
