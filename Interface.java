interface interface1{
    void show();
}

class Child3 implements interface1{
    public void show(){
        System.out.println("Child3 method running successfully");
    }
}

class Child4 implements interface1{
    public void show(){
        System.out.println("Child4 method running successfully");
    }
}

class Child5 implements interface1{
    public void show(){
        System.out.println("Child5 method running successfully");
    }
}
public class Interface extends Child3 {
    public static void main(String[] args) {
        interface1 in = new Child3();
        in.show();
        interface1 in2 = new Child4();
        in2.show();
        interface1 in3 = new Child5();
        in3.show();
    }
}
