// 11.	WAP to enter any String and count total number of 'a' in that String.

import java.util.Scanner;

public class StringCount {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a word");
        String string = scan.next();

        int count = 0;

        for(int i = 0; i < string.length(); i++) {
            if((string.charAt(i) == 'a')||(string.charAt(i) == 'A'))
                count++;
        }

        System.out.println("Total number of 'a' or 'A' in a sentence is : " + count);
    }
}
