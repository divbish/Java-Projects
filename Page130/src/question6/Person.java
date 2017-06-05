package question6;

public class Person {
	private String name;
	public int age;
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public void setAge(int newAge)
	{
		age = newAge;
	}
	public void setVariables(String newName, int newAge)
	{
		setName(newName);
		setAge(newAge);
	}
	public void printVariable()
	{
		System.out.println("Name is "+ name+" age is "+ age);
	}
	
	public boolean equals(Person obj)
	{
		if (name.equals(obj.name) && age == obj.age)
			return true;
		else
			return false;
	}
	
	public void increaseAge(int y)
	{
		y = y+1;
		System.out.println(" i am in Person class and value of x is "+y);
	}
	
	public void trickyIncreaseAge(int y)
	{
		age = age+1;
	}

}
