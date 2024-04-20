public class Arpairs {
    public static void Printpairs(int numbers[]){
        for(int i = 0; i < numbers.length ;i++){
            int curr = numbers[i] ;
            for(int j = i+1 ; j< numbers.length ; j++){
                System.out.print("("+ curr +"," + numbers[j] +")");
            }
            System.out.println();
        }
    }
    public static void printSubarrays(int numbers[]){
        int ts = 0;

        for(int i = 0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total Subarrays : "+ts);

    }
    public static void PrintSumSubarrays(int numbers[]){
        int currsum = 0; int Subsum = Integer.MIN_VALUE;
        for(int i = 0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                currsum = 0;
                for(int k=i;k<=j;k++){
                    currsum += numbers[k];

                    System.out.println(""+currsum);
                }
                if(Subsum < currsum){
                    Subsum = currsum ;                }
                
            }
        }
        System.out.println("total Subsum : " + Subsum);
        
    }
    public static void kadans(int numbers[]){
        int cur = 0;
        int ms = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            cur = cur + numbers[i];
            if(cur<0){
                cur = 0;
            }
            ms = Math.max(cur,ms);
        }
        System.out.print("total Subarray sum is : " + ms);
    }
    public static void main (String args[]){
        int numbers[] ={-2,-3,4,-1,-2,1,5,-3};
        //Printpairs(numbers);
        //printSubarrays(numbers);
        //PrintSumSubarrays(numbers);
        kadans(numbers);
    }
    
}
