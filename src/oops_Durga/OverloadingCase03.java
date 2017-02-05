package oops_Durga;

class Test{
	
	public void m1(String str){
		System.out.println("we are in String version");
	}
	public void m1(StringBuffer str){
		System.out.println("we are in String version");
	}
}

public class OverloadingCase03 {
	public static void main(String args[]){
		Test t=new Test();
		t.m1("atA");
		t.m1(new StringBuffer("jani"));
		//t.m1(null);  //--> compile time error
	}
	
}
