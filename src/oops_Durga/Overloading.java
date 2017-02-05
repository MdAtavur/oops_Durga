package oops_Durga;

 class A 
{
	public void m1(){
		System.out.println("\nwe are in m1 method\n this is a dummy method dude.. \n\t if you want anythign it's your job to extend this");
	}
//	public void m1(int i){
//		System.out.println("ye tho int hai baba:"+i);
//	}
	public void m1(float f){
		System.out.println("ye tho Float hai baba"+f);
	}
} 
public class Overloading extends  A {
	public static void main(String args[]){
	System.out.print("we are going to travel to A.M1()");
	A a=new A();
	a.m1(3);
	a.m1(10.5f);
	}

}

