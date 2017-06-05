package cookieWinner;
import java.util.Arrays;
import java.util.Collections;
public class CookiesWinnerDemo{
	  public static void main(String[] args){
		  int[] allAscii = new int[95];
		  for(int i=32; i<=126; i++){
			  allAscii[i-32]=i;
		  }
		  Character[] original = new Character[95];
		  Character[] encrypted = new Character[95];
		  for(int i=0; i<allAscii.length; i++){
			  original[i]=(char)allAscii[i];
		  }
		  //System.out.println(Arrays.toString(original));
		  Collections.shuffle(Arrays.asList(original));
		  System.out.println(Arrays.toString(original));
//		  String a="";
//		  for(int i=0; i<original.length; i++){
//			  a+=original[i];
//		  }
//		  System.out.println(a);
		  for(int i=0; i<original.length; i++){
			  if (original[i]>123)
				  encrypted[i]= (char)(original[i]+32 - 124);
			  else
				  encrypted[i]= (char)(original[i]+3);
		  }
		  System.out.println(Arrays.toString(encrypted));
//		  String b="";
//		  for(int i=0; i<encrypted.length; i++){
//			  b+=encrypted[i];
//		  }
//		  System.out.println(b);
	  }
}