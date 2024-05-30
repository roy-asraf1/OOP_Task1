package interfaces;
//
interface Polygon {
    public void display();
}
// that implements the Polygon interface.
public class AnonymousDemo {
    public void createClass() {
        // anonymous class implementing interface
        Polygon p1 = new Polygon() {
            public void display() {
                System.out.println("Inside an anonymous class.");
            }
        };
        p1.display();
    }
}
