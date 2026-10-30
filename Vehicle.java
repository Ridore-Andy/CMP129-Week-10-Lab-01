public class Vehicle 
{
    private String model;
    private String year;

    public Vehicle(String model, String year)
    {
        this.model = model;
        this.year = year;
    }
    
    //get and set for model
    public String getModel()
    {return model;}
    public void setModel(String model)
    {this.model = model;}

    //get and set for year
    public String getYear()
    {return year;}
    public void setYear(String year)
    {this.year = year;}
    
    //method to display vehicle info
    public void displayInfo()
    {
        System.out.println("Vehicle Model: "+model);
        System.out.println("Vehicle Year: "+year);
    }
}