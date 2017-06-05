package labFiveCPackage;

public class RocketShip {

			 public void drawTriangle()
			{
				System.out.println("    / \\")	;
				System.out.println("   /   \\" );
				System.out.println("  /     \\  "); 
			}
			
			
			public void drawBody()
			{
				int i =0;
				for(i = 0; i<3; i++)
					System.out.println(" |       |");
			}
			public void combination()
			{
				drawBody();
				drawBase();
			}
			public void drawBase()
			{
				System.out.println( "  -------");
			}	
				
	}


