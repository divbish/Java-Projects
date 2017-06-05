package labFiveBPackage;
public class stickFiguresTwo
{  
	
	 public void drawCircle(String ch)
  	{
	  	System.out.println("     "+ch        );
	  	System.out.println("   "+ch+ "   " +ch  );
	  	System.out.println("    "+ch+" " +ch );
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

