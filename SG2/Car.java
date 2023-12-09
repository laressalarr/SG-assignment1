package car_dealler_ship;


public class Car {
    private int ID;
    private String Brand;
    private String Model;
    private double Price;
    private int Year;
    private int Distance;
    private boolean UsedStatus;
    private String Color;
 
    
    public void setID(int id)
    {
       
        ID=id;
    }
    
    public int getID(){
        return ID;
    }
      public void setBrand(String brand)
    {
       
       Brand =brand;
    }
    
    public String getBrand(){
        return Brand ;
    }
     public void setModel(String model)
    {
       
        Model = model;
    }
    
    public String  getMOdel(){
        return Model;
    }
     public void setPrice (double price)
    {
       
        Price = price;
    }
    
    public double getPrice(){
        return Price;
    }
     public void setYear(int year)
    {
       
       Year = year;
    }
    
    public int getYear(){
        return Year;
    }
     public void setDistance(int distance)
    {
       
        Distance=distance;
    }
     
     public double getDistance(){
        return Distance;
    }
     
     
     public void setUsedStatus(boolean usedstatus )
    {
       
        UsedStatus = usedstatus;
    }
    
    public boolean getUsedStatus(){
        return UsedStatus;
    }
     public void setColor(String color)
    {
       
        Color= color ;
    }
    
    public String getColor(){
        return Color;
    }
    
   
    
    public void display(){
        System.out.println("car ID is:"+getID()+"\n"+"brand of the car is:"+getBrand()+"\n"+
                "model of the car is:"+getMOdel()+"\n"+" price of the car is :"+getPrice()+
                "\n"+"year of the car is :"+getYear()+"\n"+"km of the car is :"+getDistance()+
                "\n"+"used status of the car is :"+getUsedStatus()+"\n"+"color of the car is :"+getColor()+"\n");
        
    }
    
   
    
    
    
    
}





