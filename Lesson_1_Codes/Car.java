class Car implements Vehicle, FourWheeler {
	public void print(){
		Vehicle.super.print();
		FourWheeler.super.print();
		Vehicle.stopNow();
		System.out.println("I am a car!");
	}
	public String toString() {
		return "I am a car";
	}
}
