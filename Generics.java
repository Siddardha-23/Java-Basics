class Test<T>{
    T obj;
    Test(T obj){
        this.obj = obj;
    }
    public T getObj(){
        return this.obj;
    }
}

public class Generics {
    public static void main(String[] args) {

        Test<Integer> it = new Test<Integer>(2);
        System.out.println(it.getObj());

        Test<String> st = new Test<String>("Siddu");
        System.out.println(st.getObj());

    }
}
