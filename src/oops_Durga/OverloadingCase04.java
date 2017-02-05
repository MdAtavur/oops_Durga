package oops_Durga;

class Test2{
	
	public void m1(int i,float f){
		System.out.println("we are in String version");
	}
	public void m1(float f,int i){
		System.out.println("we are in String version");
	}
}

public class OverloadingCase04 {
	public static void main(String args[]){
		Test2 t=new Test2();
		t.m1('a',10f);
		
		//t.m1(null);  //--> compile time error
	}
	
}
