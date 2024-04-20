public class basicsorting {
    public static void BubbleSorting(int arr[]){
        for(int turn = 0 ; turn < arr.length-1;turn++){
            for(int i = 0;i < arr.length-1-turn;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;


                }
            }
        
        }

    }
    public static void Printarr(int arr[]){
        for(int j = 0; j< arr.length; j++){
            System.out.print(arr[j] + "");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] =  {5,4,1,3,2};
        BubbleSorting(arr);
        Printarr(arr);
    }
    
}
