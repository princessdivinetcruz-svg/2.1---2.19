
package helloworld;

public class FormatOutput {
    public static void main(String[] args)
{
    int age = 23;
    double money = 123;
    System.out.println("Age is " + age);
    System.out.println("Money is Php" + money);
    System.out.println("After format:");
    System.out.printf("Age is %d and money is Php%.2f", age, money);
}
}
