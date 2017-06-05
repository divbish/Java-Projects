package labEightBPackage;

import java.io.*;
public class Lab8BDemo
{
  public static void main (String [] args) throws IOException
  {
    BookTwoClass favoriteBooks = new BookTwoClass(35);
    BufferedReader input = new BufferedReader( new FileReader( "/Users/divyabishnoi/Documents/Eclipse2015/LabEight/books.txt"));
    for ( int i = 1; i <=3; i++)
    {
      favoriteBooks.getInput(input);
      favoriteBooks.writeOutput();
    }
  }
}