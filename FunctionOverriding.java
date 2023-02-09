class Parent{
    void run() {
        System.out.println("Parent method is running");
    }

}

public class FunctionOverriding extends Parent {

    @Override
    void run(){
        super.run();
        System.out.println("Child method is running");
    }
    public static void main(String[] args) {

        FunctionOverriding mor = new FunctionOverriding();
        mor.run();

    }
}
