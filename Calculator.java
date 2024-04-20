import java.util.Scanner;
public class Calculator {
    public static void main(String args[]){
        Scanner Calc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = Calc.nextInt();
        System.out.println("Enter b :");
        int b = Calc.nextInt();
        System.out.println("Enter operator :");
        char Operator =Calc.next().charAt(0);

        switch(Operator){
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : System.out.println(a%b);
            break;
            default : System.out.println("Wrong Operator");

        }


    }
    
    
}
