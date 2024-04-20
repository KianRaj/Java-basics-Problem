import java.util.Scanner;
public class loop {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
         int range = sc.nextInt();
         int sum = 0;
         int i = 1;

         while(i<=range){
            sum =sum+i;
            i++;
            

         }
         System.out.println(sum);
        }
    }

