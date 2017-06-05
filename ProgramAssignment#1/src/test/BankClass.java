package test;
public class BankClass 
{  private String list [ ] ;
   private int count;

   public void insertInOrder ( String newName )
   {   int a, point, b;
        boolean found;
        found = false;
        a = 0;
        while ( ! found && a < count )
         { 
             if (newName.compareTo(list[a] ) < 0)
                a++; //  (1)
             else
                found = true; //(2)
         } // end while loop

         point = a;
         if ( found == true )
         {
           for ( b = count; b > point; b--)
               list[b]=list[b-1]; // (3)
         }
         // actually insert
         list[a] = newName;//__________________________________ (4)
          
         count+=1;//___________________________________ (5)  
   }// end of method insertInOrder
}// end of listClass