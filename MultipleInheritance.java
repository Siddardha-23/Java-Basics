class ParentInheritance2{
    void display(){
        System.out.println("ParentInheritance1 Behaviour");
    }
}

class ParentInheritance1{
    void display(){
        System.out.println("ParentInheritance1 Behaviour");
    }
}
public class MultipleInheritance extends ParentInheritance1, ParentInheritance2 {
    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.display();
    }
}
