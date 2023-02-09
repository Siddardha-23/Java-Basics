final class FinalMethod2{

}

//The final method can not be overridden
class FinalMethod{
    final void run(){
        System.out.println("Final Method is declared");
    }
}

//The final class can not be inherited

//public class Final extends FinalMethod2 {
public class Final extends FinalMethod {
    final int num = 3;

    static void change(){
        int num = 6;
    }
    void run(){
        System.out.println("Run method in the main class");
    }
    public static void main(String[] args) {
        Final.change();
        Final f = new Final();
        f.run();
    }
}
