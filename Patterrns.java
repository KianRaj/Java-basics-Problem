import java.util.Scanner;

public class Patterrns {
    public static void main(String args[]){

       /*  for(int line =1;line<=4;line++){
            System.out.println("* * * *");
        }*/
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if (n == 2){
            System.out.println("n is a prime number");
        }
        else{
           boolean isPrime = true;
            //for( int i=2;i<=n-1;i++)
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n % i==0){
                    isPrime =false;
                }



            }
            if (isPrime == true){
            System.out.println("n is a prime number");}
            else{
                System.out.println("composite number");
            }
        }
    /*    int n = sc.nextInt();
        int rev=0;

    while(n>0){
    int lastdigit = n % 10;
    //System.out.print(lastdigit);
    rev = (rev*10)+lastdigit;

    n = n / 10 ;

    }
System.out.println(rev); */
 }

}
