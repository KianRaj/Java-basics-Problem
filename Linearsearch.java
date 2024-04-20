public class Linearsearch {
    public  static int linrsearch(int number[] , int key){
        for(int i = 0;i < number.length; i++){
            if(number[i] == key){
                return i; }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[] = {2,4,6,8,10,13,15};
        int key = 10;
        int index = linrsearch(number,key);
        if (index == -1){
            System.out.println("not found");
        }
        else {
            System.out.println("index is found at :"+ index);
        }
    }
}
