interface Printable			//interface printable is created
{
	public  void print();
}
class Animal implements Printable  		//class animal is created and implemtented by printable interface
{

	@Override
	public void print() 				//print method is override
	{
		System.out.println("animal is called");
		
	}
	
}
class Shape implements Printable		//class shape is created and implemtented by printable interface
{

	@Override
	public void print()					//print method is override
	{
		
	
		System.out.println("shape is called");
		
	}
	
}
class Utility 				//class utility is created
{

	
	public void printAll( Printable[] p)  	//printable interface is passed asa na array
	{
		for(int i=0;i<p.length;i++)
		{
			p[i].print();					//print method is called
		}
	}
	
}
public class Program {
	public static void main(String[] args) {
		

Shape s=new Shape();			//object of shape class is made
Animal a=new Animal();			//object of animal class is made
Printable p1[]={s,a};			//interface contain the objects of array
Utility u1=new Utility();		//object of utility class is made
u1.printAll(p1);				//printAll method is called of both class
		}
	}
	
	


