abstract class Example{
    Example(){
        System.out.println("Non abstract method");
    }
    abstract void run();
    void show2(){
        System.out.println("Non abstract method again");
    }
}

public class Abstract extends Example{
    void run(){
        System.out.println("Implementation for the run method of the abstract class");
    }

    public static void main(String[] args) {
        Example e = new Abstract();
        //Abstract a = new Abstract();
        e.run();
        e.show2();
    }
}
