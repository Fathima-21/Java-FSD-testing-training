package com.ust1.spring.springcoreadvanced.spel;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//we can specify the value/ name of the object to be created within curly braces in the component annotation, then the camel case object wont be created.
@Scope("prototype")
@Component("ins")
public class Instructor {


	@Value("#{T(java.lang.Math).abs(-99)}")
	int id=45;
	@Value("#{'Fathima'.toUpperCase()}")
	String name;
	@Value("#{topics}")
	private List<String> topics;
	
	@Value("#{4+5>11?true:false}")
	private boolean active;
	

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
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", active=" + active + "]";
	}

	

	

}
