public class ArrayCC {
    public static int BinarySearch(int numbers[],int key){
        int start = 0;
        int end = numbers.length - 1;

        
        
        while(start<=end){
            int mid = (start + end)/2;

            if(numbers[mid]==key){
                return mid;
            }

            if(numbers[mid] < key){
            start = mid + 1;
            }
            else{
            start = mid - 1;
             }
        }
        return -1 ;
    }
    public static void main (String args[]){
        int numbers[] = {2,4,6,8,10,12,14,16,18};
        int key = 16 ;

        System.out.print("keys are at index : " + BinarySearch(numbers, key));
    }
    
}
