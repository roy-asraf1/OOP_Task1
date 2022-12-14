package observer;

public class ConcreteMember implements Member{
    GroupAdmin admin;

    public void update(UndoableStringBuilder usb){
        System.out.println("new update:");
        System.out.println(usb);
    }
    public  ConcreteMember (GroupAdmin admin) {
        this.admin=admin;

    }

}
