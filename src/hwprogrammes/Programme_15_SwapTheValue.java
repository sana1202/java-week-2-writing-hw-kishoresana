package hwprogrammes;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */
public class Programme_15_SwapTheValue {
    public static void main(String[] args) {
        // Scanner declaration for reading the input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the first variable value : ");
        int first = scanner.nextInt();
        System.out.print(" Enter the second variable value : ");
        int second = scanner.nextInt();
        Programme_15_SwapTheValue t = new Programme_15_SwapTheValue();
        t.swapTheValue( first, second);
        //closing the scanner object
        scanner.close();
    }
    //Swapping the value of variables
    public void swapTheValue( int a, int b){
        int c;
        System.out.println(" Before the swapping , The values of first variable is : " + a + " and second variable is : " + b);
        c = a;
        a = b;
        b = c;
        System.out.println(" After the swapping , The values of first variable is : " + a + " and second variable is : " + b);
    }
}
