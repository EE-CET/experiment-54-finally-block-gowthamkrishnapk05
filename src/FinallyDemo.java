import java.util.Scanner;

public class FinallyDemo {
    
        // TODO: Read a and b
        
        // TODO: try block
        // Perform division
        // Print "Result: " + result
        
        // TODO: catch ArithmeticException e
        // Print "Error: " + e.getMessage()
        
        // TODO: finally block
        // Print "Finally block executed"
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                try
                {
                        int quotient = num1/num2;
                        System.out.println("Result: "+quotient);
                }
                catch(ArithmeticException e)
                {
                        System.out.println("Divide by zero error");
                }
                finally
                {
                    System.out.println("Finally block executed");
                }
        }
    }

