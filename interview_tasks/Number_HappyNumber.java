public class Number_HappyNumber {

    /*
    write a function that can check if a number is a Happy Number
     */

    public static boolean happyNumber(int n){

        while(n != 1 && n != 4){
            int r = 0, sum = 0;

            while(n > 0){
                r = n%10;
                sum = sum + (r*r);
                n = n/10;
            }

            n = sum;
        }

        return n == 1;
    }

}
