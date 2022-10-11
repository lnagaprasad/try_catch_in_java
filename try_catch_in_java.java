#Please suggest more catch blocks wherever required
#some times its getting exceptions,run time errors, sugges try catch blocks wherever required
import java.util.Scanner;
class exception 
{
  public static void main(String[ ] args) 
  {
    int a, b, result;
    Scanner input = new Scanner(System.in);
    System.out.println("Input two integers");
    a = input.nextInt( );
    b = input.nextInt( );
    result = a / b;
    System.out.println("Result = " + result);
  }
}
