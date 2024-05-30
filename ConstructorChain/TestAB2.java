package constrChain;

public class TestAB2 {
	public static void main(String[] args) {
		B2 b = new B2();
		B2 b1 = new B2(22);
	}
}
class A2 {
}
class B2 extends A2{
	int x;
	public B2(){
		System.out.println("class B2 constructor");;
	}
	public B2(int x){
		this.x = x;
		System.out.println("class B2X constructor");;
	}
}
