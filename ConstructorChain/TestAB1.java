package constrChain;

public class TestAB1 {
	public static void main(String[] args) {
		B1 b = new B1();
	}

}
class A1 {
	public A1(){
		System.out.println("class A1 constructor");;
	}
}
class B1 extends A1{
}