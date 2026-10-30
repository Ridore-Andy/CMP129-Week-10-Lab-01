public class VehicleTest 
{
    public static void main(String[] args) 
    {
        Car car = new Car("Chevy", "2003");
        Truck truck = new Truck("Ford", "2005");
        
        //display both car and truck information
        car.displayInfo();
        car.displayType();
        System.out.println();
        truck.displayInfo();
        truck.displayType();
    }    
}