package labSevenCPackage;
public class ParametersDemo
{
    public static void main(String[] args)
    {
        DemoSpeciesClass first = new DemoSpeciesClass(),
                    second = new DemoSpeciesClass();

        first.set("Klingon Ox", 10, 15);
        System.out.println("Value of first after initialization with set method");
        first.writeOutput();
        System.out.println();

        second.set("Ferengie Fur Ball", 90, 56);
        System.out.println("Value of second after initialization with set method");
        second.writeOutput();
        System.out.println();


        //first.makeEqual( second);
        second=first;
        System.out.println("Value of first after second = first");
        first.writeOutput();
        System.out.println();

        System.out.println( "Value of second after second = first");
        second.writeOutput();
        System.out.println();


        int aPopulation = 42;
        System.out.println("Value of aPopulation before the call to method tryToMakeEqual: "
                                                     + aPopulation);
        first.tryToMakeEqual(aPopulation);
        System.out.println("Value of aPopulation after the call to method tryToMakeEqual: "
                                                    + aPopulation);
    }
}