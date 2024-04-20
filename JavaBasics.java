import java.util.Scanner;

public class JavaBasics{
    public static void main(String args[])
    {
       /*  Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int Average = (a+b+c)/3;
        System.out.println("average is :"+ Average);
    }
    Scanner sq = new Scanner(System.in);
    int side = sq.nextInt();

    int area = side * side;

    System.out.println("area of the square is :" + area);*/
    Scanner tax = new Scanner(System.in);
    float pencil  = tax.nextFloat();
    float pen = tax.nextFloat();
    float eraser = tax.nextFloat();

    float total = pencil + pen + eraser;
    System.out.println("Bill is :" + total);

    float newTotal = total + (0.18f * total);

    System.out.println("Bill with 18% GST :" +newTotal);
}
}