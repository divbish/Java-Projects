
public class TitledPerson extends Person{
	private String title;
	
	public TitledPerson(){
	}
	public TitledPerson(String newName, String newTitle){
		super(newName);
		title = newTitle;
	}
	
	public void setTitle(String newTitle){
		title = newTitle;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void writeOutput(){
		System.out.println("Title: "+ this.getTitle() + "Name: " + this.getName());
	}
	
	public void reset(String newName, String newTitle){
		this.setName(newName);
		this.setTitle(newTitle);
	}
	
	public boolean equals(TitledPerson secondTitledPerson){
		if (this.getName().equals(secondTitledPerson.getName()) && this.getTitle().equals(secondTitledPerson.getTitle())){
			return true;
		}
		else
			return false;
	}

}
