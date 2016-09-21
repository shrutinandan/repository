abstract class Animal   //animal class is created
{
	public abstract void respirate();	//method respirate is created
	public abstract void talk();        ////method talk is created
	
}
class Cat extends Animal  // cat is created
{

	@Override
	public void respirate() {
		System.out.println("cat is respiring");
		
	}

	@Override
	public void talk() {
		System.out.println("cat is saying meao");
		
	}

}
class Dog extends Animal  //dog  class is created
{

	@Override
	public void respirate() {
		System.out.println("dog is respiring");
		
	}

	@Override
	public void talk() {
		System.out.println("dog is barking");
		
	}
	
}
class Lion extends Animal  //lion class overrides methods of animal class
{

	@Override
	public void respirate() {
		System.out.println("lion is respiring");
		
	}

	@Override
	public void talk() {
		System.out.println("lion is groning");
		
	}
	
}
public class Program {
	public static void main(String[] args) {
		
		 Animal arr[]={new Cat(),new Dog(),new Lion()}; //class Animal contain the references of other class
		 for (Animal animal : arr) {
			 animal.respirate();  //printing the values all override methods
			 animal.talk();       // //printing the values all override methods
	
		 						}
		}
	}


