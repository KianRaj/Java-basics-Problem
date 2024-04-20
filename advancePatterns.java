public class advancePatterns {
    public static void Hollow_Rectangle(int totrows , int totcols){
        for(int i = 1 ;i <= totrows ; i++){
            for(int j = 1; j <= totcols ;j++){
                if(i == 1||i == totrows||j==1||j==totcols){
                    System.out.print("* ");}
                else {
                        System.out.print("  ");
                    }
            }
            System.out.println();

        }
    }
    public static void Inverted_Rotated_Half_Pyramid(int n){
        for(int i = 1;i <= n;i++){
            for(int j =1;j <= n-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void Inverted_HalfPyarmid_Nmb(int n){
        for(int i = 1;i <= n;i++){
            for(int j = 1;j<=n-i+1;j++){//keep j as a counter
                System.out.print(j);
                
            }
            System.out.println();
        }
    }
    public static void floyd_triangle(int n){
        int counter = 1;
        for (int i = 1;i<=n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void Butterfly(int n){
        //outer loop
        for(int i = 1; i<=n;i++){
            //stars
            for(int stars = 1;stars <= i;stars++){
                System.out.print("*");

            }
            //space
            for(int space =1;space <= 2*(n-i);space++){
                System.out.print(" ");

            }
            //stars
            for(int stars = 1; stars <=i;stars++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        //Second phase
        for(int i = n; i>=1;i--){
            //stars
            for(int stars = 1;stars <= i;stars++){
                System.out.print("*");

            }
            //space
            for(int space =1;space <= 2*(n-i);space++){
                System.out.print(" ");

            }
            //stars
            for(int stars = 1; stars <=i;stars++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Solid_Rhombus(int n){
        for(int i = 1; i <=n; i++){
            for(int j = 1; j<= n-i;j++){
                System.out.print(" ");
            }

            for(int k = 1 ; k<=n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Hollow_Rhombous(int n){
        for(int i = 1;i <= n; i++){
            for(int j = 1 ; j <= (n-i) ; j++){
                System.out.print(" ");
            }
                for(int j = 1; j <= n ;j++){
                    if(i == 1||i == n||j==1||j== n){
                        System.out.print("* ");}
                    else {
                            System.out.print("  ");
                        }
    
            }
            System.out.println();
        
        }
    }
    public static void Diamond(int n){
        for(int i = 1; i <= n ;i++){
            for(int spaces = 1;spaces <= n-i;spaces++){
                System.out.print(" ");

            }
            for(int stars = 1 ; stars <= 2*i-1 ; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
        for( int i = n; i>=1;i--){
            for(int spaces = 1;spaces <= n-i;spaces++){
                System.out.print(" ");

            }
            for(int stars = 1 ; stars <= 2*i-1 ; stars++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String args[]){
       // Hollow_Rectangle(6,6);
       //Inverted_Rotated_Half_Pyramid(6);
       //Inverted_HalfPyarmid_Nmb(5);
       //floyd_triangle(6);
       //Butterfly(6);
       //Solid_Rhombus(5);
       //Hollow_Rhombous(6);
       Diamond(8);

    }
    
}
