public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            int i = 100 / 0;
            System.out.println("The immediate line after the error statement");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        //System.out.println("The rest of the code is executed"); //For this line to be executed the exception in the try class should be handled
        finally {
            System.out.println("Everytime this should be executed");
        }
    }
}
