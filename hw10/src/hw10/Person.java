package hw10;

import java.util.Scanner;

public class Person {
	
	private String name;
	private double age;
	
	public void setName(String newName)
	{
		name = newName;
	}
	public void setAge(double newAge)
	{
		age = newAge;
		if (age>0)
			age = newAge;
		else 
			System.out.println("Enter valid age");
	}
	public void setPerson(String newName, double newAge) 
	{
		setName(newName);
		setAge(newAge);
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getAge()
	{
		return age;
	}

}
