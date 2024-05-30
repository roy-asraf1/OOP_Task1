package inheritance;
class Animal {
	public static void testClassMethod() {
        System.out.println("The class" + " static  method in Animal.");
    }
    public void testInstanceMethod() {
        System.out.println("The instance " + " method in Animal.");
    }
}
class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The class static method" + " in Cat.");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method" + " in Cat.");
    }
}
public class TestZoo {
	public static void main(String[] args) {
		Animal myAnimal = new Cat();
		Animal.testClassMethod();
		myAnimal.testInstanceMethod();
		Cat.testClassMethod();
		myAnimal.testClassMethod();
        if (myAnimal instanceof Cat) System.out.println("myAnimal is instance of Cat");
        if (myAnimal instanceof Animal) System.out.println("myAnimal is instance of Animal");
	}

}
