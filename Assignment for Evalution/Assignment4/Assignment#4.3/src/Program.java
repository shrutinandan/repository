
public class Program {
public static void main(String[] args) {
	
int num;

		int a[]=new int[20];
		int j,temp,i;
		for(i=0;i<args.length;i++)
		{
		//a[i]=Integer.valueOf(args[i]);
		a[i]=Integer.parseInt(args[i]);   //taking input from command line
		}
		System.out.println("Elements in the unsorted array are: ");
		for(i=0;i<args.length;i++)
		{
		System.out.println(a[i]);  //printing unsorted elements
		}
		for(i=0;i<args.length;i++)             //sorting the elements in an array
		{
			for(j=0;j<args.length-i-1;j++)
				{
					if(a[j]>a[j+1])
					{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					}
				}
			
		}
		
		System.out.println("Sorted array elements are: ");
		for(i=0;i<args.length;i++)
			{
				System.out.println(a[i]);        //printing sorted elements
			}
		
		

}
}


