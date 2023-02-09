class Arithmetic{

    // Overloading using number of parameters
    public int add(int a , int b){
        return a + b ;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    //Overloading using different types of data

    public double add(double a, double b){
        return a + b;
    }

    //Overloading using order of Parameters
    public void display(String a,int b){
        System.out.println(b + " " + "Hello" + " " + a);
    }

    public void display(int a,String b){
        System.out.println(a + " " + "Hello" + " " + b);
    }
}

public class FunctionOverloading {
    public static void main(String[] args) {
        Arithmetic a = new Arithmetic();
        System.out.println(a.add(2,3));
        System.out.println(a.add(2.0,3.0));
        System.out.println(a.add(2,3,6));
        a.display("Backflipt",1);
        a.display(1,"Backflipt");
    }
}
