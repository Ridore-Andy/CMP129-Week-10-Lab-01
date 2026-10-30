public class Car extends Vehicle
{
    public Car(String model, String year)
    //shares the information with Vehicle
    {super(model,year);}

    //method to display type of vehicle
    public void displayType()
    {System.out.println("This is a Car");}
}