public class Truck extends Vehicle
{
    public Truck(String model, String year)
    //shares the information with Vehicle
    {super(model,year);}

    public void displayType()
    //method to display type of vehicle
    {System.out.println("This is a Truck");}
}