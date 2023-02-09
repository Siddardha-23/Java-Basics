class Parent1{
    void run(){
        System.out.println("The run method in the Parent class");
    }
}

class Child1 extends Parent1{
    void run(){
        System.out.println("The run method in the child1 class");
    }
}

class Child2 extends Parent1{
    void run(){
        System.out.println("The run method in the child2 class");
    }
}
public class RunTimePoly extends Parent1 {
    void run(){
        System.out.println("The run method in the main class");
    }

    public static void main(String[] args) {

        Parent1 p3;
        p3 = new Child1();
        p3.run();
        p3 = new Child2();
        p3.run();
        Parent1 p = new RunTimePoly();
        Parent1 rt = new Parent1();
        rt.run();
        p.run();
    }
}
