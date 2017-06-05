import java.io.*;
public class Lab8BDemo
{
  public static void main (String [] args) throws IOException
  {
    BookTwoClass favoriteBooks = new BookTwoClass();
    BufferedReader input = new BufferedReader( new FileReader( "books.txt"));
    for ( int i = 1; i <=3; i++)
    {
      favoriteBooks.getInput(input);
      favoriteBooks.writeOutput();
    }

  }
}