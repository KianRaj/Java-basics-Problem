public class functions {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }

    public static void primesInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+"");

            }
            System.out.println();
        }
    }
    public static  void main(String[]args){
        primesInRange(5);



    }
   
    }
    /*public static int calculatesum(int num1 ,int num2){
    int sum = num1 + num2 ;
    return sum;}
    public static int factorial(int n){
        int f = 1;
        for(int i =1;i<=n;i++){
            f = i*f;
        }
        return f;

    }
    public static int bincoeff(int n,int r){
    int factn = factorial(n);
    int rem = factorial(r);
    int fmr = factorial(n-r);
    int result = factn/(rem*fmr);
    return result;
}

    
} */
