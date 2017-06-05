
public class SchoolClassDemo {

	public static void main(String[] args) {
//		int x;
//		SchoooClass  school = new SchoooClass ( ) ;
//		x=7;
//		school.change(x);
//		System.out.println ( " x = " + x);
//		double y = Math.round ( 9.6);
//		Double z = new Double(9.6);
//		z.doubleValue();
//		System.out.println ( " y = " + y);
		
		Species  s1 = new Species ();
		Species  s2 = s1;

		s1. set ( "Klingon Ox", 5, 120);
		s2. set( "Ferengie Fur Ball",  40, 20);

		if ( s1 == s2)
		  System.out.println ( "yes" );
		else
		  System.out.println ( "no" );
	}

}
