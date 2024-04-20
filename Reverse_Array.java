public class Reverse_Array 
{

    public static void Rvrselist(int numbers[]){
        int first = 0;
        int last = numbers.length-1;
        
        while(first < last){
            int temp = numbers[first];
            numbers[first] = numbers[last] ;
            numbers[last] = temp ;

            first++;
            last--;
        }

    }
    public static void main(String args[]){
        int numbers[] = {2,5,7,6,4,9,12,34,65};
        Rvrselist(numbers);
        for(int i = 0 ; i<numbers.length; i++){
            System.out.print(numbers[i] +" ");

        }
        System.out.println();
    }
}
