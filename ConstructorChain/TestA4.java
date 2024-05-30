package constrChain;

public class TestA4 {
	public static void main(String[] args) {
		B4 b = new B4();
	}

}
class A4 {
	protected int x;
	public A4(int x){
		this.x = x;
		System.out.println("class A4 constructor");;
	}
}
class B4 extends A4{
	public B4(){
		super(0);
		System.out.println("class B4 constructor");;
	}
}