abstract class Vehicle   //Vehicle class is created
{
	public abstract void move();	//method respirate is created
	
	
}
class Car extends Vehicle  // Car is created overides method of Vehicle class
{

	@Override
	public void move() {
		System.out.println("Car is moving");
		
	}

	

}
class Motorbike extends Vehicle  // Motorbike   class is created overides method of Vehicle class
{

	@Override
	public void move() {
		System.out.println("Morotbike is moving");
		
	}

	
	
}
class Truck extends Vehicle  //Truck class overrides methods of Vehicle class
{

	@Override
	public void move() {
		System.out.println("Truck is moving");
		
	}

	
	
}
public class Program {
	public static void main(String[] args) {
		
		Vehicle arr[]={new Car(),new Motorbike(),new Truck()}; //class Vehicle contain the references of other class
		 for (Vehicle veh : arr) {
			 veh.move();  //printing the values all override methods
			 
	
		 						}
		}
	}


