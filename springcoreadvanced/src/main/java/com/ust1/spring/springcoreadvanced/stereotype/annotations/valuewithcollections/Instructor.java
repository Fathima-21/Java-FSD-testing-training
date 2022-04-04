package com.ust1.spring.springcoreadvanced.stereotype.annotations.valuewithcollections;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("prototype")
@Component("ins")
public class Instructor {


	@Value("10")
	int id;
	@Value("Aryan")
	String name;
	@Value("#{topics}")
	private List<String> topics;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + "]";
	}
	

	

}
	

