public class Number_HappyNumber {

    /*
    write a function that can check if a number is a Happy Number
     */


    public static boolean happyNumber(int num){

        while(num != 1 && num != 4){
            int r = 0, sum = 0;

            while(num > 0){
                r = num%10;
                sum = sum + (r*r);
                num = num/10;
            }

            num = sum;
        }

        return num == 1;
    }

}
