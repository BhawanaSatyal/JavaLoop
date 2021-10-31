// 5.	Finding factorial of a number entered by user

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {
        int number;
        System.out.println("Enter the number: ");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        scan.close();
        long fact = 1;
        int i = 1;
        while(i<=number)
        {
            fact = fact * i; i++;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
