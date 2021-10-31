// 3.	Program to check whether input number is prime or not

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        int num;
        boolean isPrime = false;
        Scanner scan = new Scanner(System.in); //create a scanner object for input
        System.out.print("Enter a number: ");
        num = scan.nextInt();

        for (int i = 2; i <= num / 2; ++i) // condition for nonprime number
        {
            if (num % i == 0) {
                isPrime = true;
                break;
            }
        }
        if (!isPrime)
            System.out.println(num + " is a Prime number.");
        else
            System.out.println(num + " is not a Prime number.");
    }
}