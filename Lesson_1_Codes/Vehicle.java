public interface Vehicle {
	default void print(){
		System.out.println("I am a vehicle!");
	}	
	static void stopNow(){
		System.out.println("Stop now!!!");
	}
}
