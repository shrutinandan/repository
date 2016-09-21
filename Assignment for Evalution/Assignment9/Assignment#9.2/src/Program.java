


public class Program {
	public static void main(String[] args) {
	
				JointAccount acc = new JointAccount(1001, "shruti",10000);//jointaccount object is created
				
				
				HolderType h1=new HolderType("user1", acc, 3000.0);		//holdertype object is created
				HolderType h2=new HolderType( "user2",acc, 5000.0);		//holdertype object is created
				
				h1.start();//start the thread
				h2.start();

	}

}
