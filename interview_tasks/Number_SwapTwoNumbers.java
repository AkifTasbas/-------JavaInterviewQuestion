public class Number_SwapTwoNumbers {

    /*
    Swap two variable' values without using a third variable
     */

    //solution 1
    public void swap1(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }


    //solution 2
    public void swap2(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }


}
