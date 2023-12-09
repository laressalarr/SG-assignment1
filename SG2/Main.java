package car_dealler_ship;


public class Main {
    
    public static void main(String[] args){
    
        Car a1 = new Car();
      a1.setID(1);
      a1.setBrand("volkswagen");
      a1.setModel("golf");
      a1.setPrice(12000.0);
      a1.setColor("Blue");
      a1.setYear(2021);
      a1.setDistance(0);
      a1.setUsedStatus(false);
    
      a1.display();
    
    }
}
