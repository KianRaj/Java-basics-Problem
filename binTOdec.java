public class binTOdec {
    public static void bintodec(int bin){
        int Newno = bin;
        int pow =0;
        int Decn = 0;

        while(bin>0){
            int Lastdigit = bin%2;
            Decn =Decn +(Lastdigit*(int)Math.pow(2,pow));

            pow++;

            bin = bin/10;


        }
        System.out.println("decimal of"+ Newno + "= " + Decn);}

        public static void DectoBin(int DecN){
            int Newno = DecN;
            int BinN = 0;
            int Pow = 0;

            while(DecN > 0){
                int rem = DecN % 2;
                BinN = BinN + (rem * (int)Math.pow(10, pow));

                pow++ ;

                DecN = Dec/2 ;

            }
            System.out.println("Binary of a "+ Newno +"= "+ BinN);
        }
        public static void main(String args[]){
            DectoBin(7);
        }
    
    }
