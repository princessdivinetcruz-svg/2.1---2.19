
package myfirstProgram;
import java.util.Scanner;
public class UserInputs {
    
    public static void main(String[] args)
{
    Scanner user_input = new Scanner(System.in);
    String user_name;
    System.out.print("Enter your name: ");
    user_name = user_input.next();
    System.out.println("Hello, " + user_name);
}
}
