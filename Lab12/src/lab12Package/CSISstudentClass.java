package lab12Package;

public class CSISstudentClass extends StudentClass
{
	String major;
	String minor;
	String academicAdvisor;
	
	public CSISstudentClass ( )
	{
		super();
	}
	
	public void setMajor ( String newMajor)
	{
		major = newMajor;
	}
		
  public void setAcademicAdvisor ( String faculty)
	{
		academicAdvisor = faculty;
	}
	
	public void writeOutput ()
	{
		//super.writeOutput();
		System.out.println ( "your major is " + major);
		System.out.println ( "your advisor is " + academicAdvisor);
		//System.out.println ( "Your name is " + name );
	}
}