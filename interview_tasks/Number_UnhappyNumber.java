public class Number_UnhappyNumber {

    /*
    1. write a function that can check if a number is an unhappy number

     */
    public static boolean unhappyNumber(int n){

        while(n != 1 && n != 4){
            int r = 0, sum = 0;

            while(n > 0){
                r = n%10;
                sum = sum + (r*r);
                n = n/10;
            }

            n = sum;
        }

        return n ==4;
    }


}
