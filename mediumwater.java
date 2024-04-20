public class mediumwater {
   public static void trapwater(int height[]){
    //leftmax sub array
    int leftmax[] = new int[height.length];
    int n = height.length;
    leftmax[0] = height[0];
    for(int i=1; i<n;i++){
        leftmax[i] = Math.max(height[i],leftmax[i-1]);

    }
    //rightmax sub array
    int rightmax[] = new int[height.length];
    rightmax[n-1] = height[n-1];
    for(int i = n-2 ; i<0;i--){
        rightmax[i] = Math.max(height[i],rightmax[i+1]);
    }
    //loop
    int trapedwater = 0;
    for(int i= 0;i<n;i++){
         int waterlevel = Math.max(leftmax[i],rightmax[i]);
         trapedwater += waterlevel - height[i];

        } 
        System.out.println("total trapped water :" + trapedwater);
    //water level

   }
   public static int BuyAndSell(int prices[]){
    int Buyprice = Integer.MAX_VALUE;
    int Maxprice = 0;
    for(int i = 0; i<prices.length;i++){
        if(Buyprice < prices[i]){
            int profit = prices[i]- Buyprice;
             Maxprice = Math.max(profit,Maxprice);
         }else{
             Buyprice = prices[i];
         }
    }
    return Maxprice;
   }
   public static void main(String args[]){
    /*int height[] = {4,2,0,6,3,2,5};
    trapwater(height);*/
    int prices[] = {7,1,5,3,6,4};
    System.out.println( BuyAndSell(prices));

   }
}
