// 4.	Reverse a number using for Loop

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        int number = 0;
        int reverseNumber = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println( "Enter Number:");
        int num = scan.nextInt();

        for (;num !=0;)
        {
            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + num%10;
            num = num/10;
        }

        System.out.println("Reverse of specified Number is: "+reverseNumber);
    }

}
