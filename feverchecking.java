import java.util.Scanner;
public class feverchecking {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter patient details");

        int temp = sc.nextInt();

        if (temp>=100){
            System.out.println("Patient is facing fever");

        }
        else{
            System.out.println("patient is out of danger");
        }

    }
    
}
