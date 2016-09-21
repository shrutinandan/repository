interface Signalling							//interface is made for storing the objects
{
	
   public static Object way1 = new Object();
	   public static Object way2 = new Object();
	   public static Object way3=new Object();
	   
}
class Way1 extends Thread implements Signalling			//class way1 is created
{
	 
	 public void run()
	 {
		
	         synchronized (way1) 					//locking  way 1 by thread 1
	         {
	            System.out.println("way 1: signal is green");
	            try 
	            {
	            	Thread.sleep(1000);
	            }
	            catch (InterruptedException e)
	            {}
	       
	         synchronized (way2) 				//way2 is synchonised
	         {
	        	  System.out.println("way2 is stop"); 
		            for(int i=0;i<2;i++)
		        	   {
		        		   System.out.println("way 2 is red ");
		        		   try
		        		   {
		        			   Thread.sleep(1000);
		        		   }
		        		   catch(Exception e)
		        		   {
		        			   
		        		   }
		        	   }
	            }
	         synchronized (way3)				//way3 is synchonised
	         {
	        	  System.out.println("way3 is ready"); 
		            for(int i=0;i<2;i++)
		        	   {
		        		   System.out.println("way 3 is orange ");
		        		   try
		        		   {
		        			   Thread.sleep(1000);
		        		   }
		        		   catch(Exception e)
		        		   {
		        			   
		        		   }
		        	   }
	            }
	         }
	      }
	
}


class Way2 extends Thread implements Signalling				//class way2 is created
{
		

	 public void run()
	 {

         synchronized (way1) 								//locking  way 2 by thread 2
         {
            System.out.println("way 2: signal is green for way2");
            try 
            {
            	Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {}
           
         synchronized (way2) 								//way2 is synchonised
         {
        	  System.out.println("way1 is stop "); 
	            for(int i=0;i<2;i++)
	        	   {
	        		   System.out.println("way 1 is red");
	        		   try
	        		   {
	        			   Thread.sleep(1000);
	        		   }
	        		   catch(Exception e)
	        		   {
	        			   
	        		   }
	        	   }
            }
         synchronized (way3)								//way3 is synchonised
         {
       	  System.out.println("way3 is waiting"); 
	            for(int i=0;i<2;i++)
	        	   {
	        		   System.out.println("way 3 is orange");
	        		   try
	        		   {
	        			   Thread.sleep(1000);
	        		   }
	        		   catch(Exception e)
	        		   {
	        			   
	        		   }
	        	   }
           }
         }
		
	 }
	 
}
class Way3 extends Thread implements Signalling						//class way3 is created
{
	 
	 public void run()
	 {
		
	         synchronized (way1) 									//locking  way3  by thread 3
	         {
	            System.out.println("way 3: signal is green");
	            try 
	            {
	            	Thread.sleep(1000);
	            }
	            catch (InterruptedException e)
	            {}
	         
	         synchronized (way2)									//way2 is synchonised
	         {
	        	  System.out.println("way1 is stop"); 
		            for(int i=0;i<2;i++)
		        	   {
		        		   System.out.println("way 1 is red signal");
		        		   try
		        		   {
		        			   Thread.sleep(1000);
		        		   }
		        		   catch(Exception e)
		        		   {
		        			   
		        		   }
		        	   }
	            }
	         synchronized (way3) 									//way3 is synchonised
	         {
	        	  System.out.println("way2 is ready"); 
		            for(int i=0;i<2;i++)
		        	   {
		        		   System.out.println("way 2 is orange");
		        		   try
		        		   {
		        			   Thread.sleep(1000);
		        		   }
		        		   catch(Exception e)
		        		   {
		        			   
		        		   }
		        	   }
	            }
	         }
	      }
	
}

public class SignalingDemo {
	
	public static void main(String[] args) {

		
		Way1 w=new Way1();			//thread1 is created
		Way2 w1=new Way2();			//thread2 is created
		Way3 w2=new Way3();			//thread3 is created
		w.start();					//starting thread 1
		w1.start();					//starting thread 2
		w2.start();				    //starting thread 3
		
		
	}

}
