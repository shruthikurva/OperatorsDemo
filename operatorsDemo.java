import java.util.Scanner;

public class operatorsDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first number");
        int num1=scanner.nextInt();
        System.out.println("Enter second number");
        int num2=scanner.nextInt();
        System.out.println("sum:"+(num1+num2));
        System.out.println("Difference:"+(num1-num2));
        System.out.println("product:"+(num1*num2));
        System.out.println("Quotient:"+(num1/num2));
        System.out.println("Remainder:"+(num1%num2));
        System.out.print("Equal:"+(num1==num2));
        System.out.print("Greater:"+(num1>num2));
        System.out.println("less:"+(num1<num2));
        System.out.println("Both positive:"+(num1>0 && num2>0));
        scanner.close();
    }
}
