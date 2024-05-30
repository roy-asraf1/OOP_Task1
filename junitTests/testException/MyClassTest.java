package testException;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MyClassTest {
	//This test case fails because it was expecting ArithmeticException
	@Test(expected = ArithmeticException.class)
	public void expectArithmeticException(){
		System.out.println("Everything was fine here !!");
	}

	//This test case passes because it was expecting NullPointerException
	@Test(expected = NullPointerException.class)
	public void expectNullPointerException(){
		//some code which throw NullPointerException in run time
		String s = null;
		MyClass.fun2(s);
	}

	//This test case passes because it was expecting IndexOutOfBoundsException
	@Test(expected = IndexOutOfBoundsException.class)
	public void IndexOutOfBoundsException(){
		//some code which throw IndexOutOfBoundsException in run time
		MyClass.fun1();
	}
	@Test(timeout = 1000)
	public void infinityLoop() {
		MyClass.fun3();
	}
}


