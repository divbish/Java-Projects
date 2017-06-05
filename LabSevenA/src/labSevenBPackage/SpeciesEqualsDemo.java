package labSevenBPackage;

public class SpeciesEqualsDemo
{
    public static void main(String[] args)
    {
        SpeciesClass first = new SpeciesClass(), second = new SpeciesClass();
 
        first.set("Klingon Ox", 10, 15);
        second.set("Klingon Ox", 10, 15);

        if (first == second)
            System.out.println("Matches with ==.");
        else
            System.out.println("Does Not match with ==.");

        if (first.equals(second))
            System.out.println("Matches with the method equals.");
        else
            System.out.println("Does Not match with the method equals.");

        System.out.println("Now we change one Klingon Ox to all lowercase.");
        second.set("klingon ox", 10, 15);
        if (first.equals(second))
            System.out.println("Still matches with the method equals.");
        else
            System.out.println("Does Not match with the method equals.");
    }
}