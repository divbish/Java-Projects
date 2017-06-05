package labFivePackage;
public class stickFigures
{  
	 public void drawCircle()
	{
		System.out.println("     *         ");
		System.out.println("   *   * "  );
		System.out.println("    * * ");
	}
	
	public void drawTriangle()
	{
		drawIntersect();
		drawBase();
	}
	
	public void drawIntersect()
	{
		System.out.println("    / \\")	;
		System.out.println("   /   \\" );
		System.out.println("  /     \\  ");
	}
	
	public void drawBase()
	{
		System.out.println( "  -------");
	}	
}			