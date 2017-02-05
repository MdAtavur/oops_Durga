package oops_Durga;
class Animal{
	 String marry()
	{
		System.out.println("Subbu");
		return null;
	}
}

 class Monkey extends Animal{
	 String marry()
	{
		System.out.println("Subbu2");
		return null;
	}
}

public class Overriding {
	public static void main(String args[]){
		Animal a =new Animal();
		a.marry();
		Monkey m=new Monkey();
		m.marry();
		Animal aM=new Monkey();
		aM.marry();
		
	}

}
