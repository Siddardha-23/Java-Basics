interface LInterface{
    void calc(int x);
    default void normal(){
        System.out.println("Hello");
    }
}

class Lambda{
    public static void main(String[] args) {
        LInterface li = (int x) -> {
            System.out.println(x * 2);
        };
        li.calc(10);
    }
}