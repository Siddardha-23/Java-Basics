class GrandParentInheritance{
    void show(){
        System.out.println("Inheriting the grand parent method which is the multilevel inheritance");
    }
}
class ParentInheritance extends GrandParentInheritance{
    void display(){
        System.out.println("Inheriting the parent method which is the single level inheritance");
    }
}

public class Inheritance extends ParentInheritance{

    void displayinfo(){
        System.out.println("The main class method");
    }

    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        obj.displayinfo();
        obj.display();
        obj.show();
    }
}

