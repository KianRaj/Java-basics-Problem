import java.util.Scanner;

public class leapyear  {
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);

        
        System.out.println("about which year you want to check for :");
        int year = sc.nextInt();
    


        boolean x = (year % 4)==0;
        boolean y = (year % 100)!=0;
        boolean z = (year%100)==0 && (year % 400)==0;

        if(x&&(y||z)){
            System.out.println("it is a leap year");

        }
        else{
            System.out.println("non leap Year");
        }


    }
    
    
}
