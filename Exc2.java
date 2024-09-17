public class Exc2 {
    public static void main(String[] args) {
        int d,a;
        try{
            d=0;
            a=42/d;
            System.out.println("this will not be printed.");
        }catch(ArithmeticException e)
        {
            //catch divide-by-zero error
            System.out.println("divide by zero ");

        }
        System.out.println("after catch statement");
        }
    }
    
}
