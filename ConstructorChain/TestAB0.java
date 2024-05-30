package constrChain;

public class TestAB0 {

	public static void main(String[] args) {
		A0 a = new A0();
		B0 b = new B0();
	}

}
class A0 {
	public A0(){
		System.out.println("class A0 constructor");;
	}
}
class B0 extends A0{
	public B0(){
		System.out.println("class B0 constructor");;
	}
}
