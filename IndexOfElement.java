package pk.org.cas.ArryAssignment;

import java.util.Scanner;

public class IndexOfElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of an Array: ");
        int length = scanner.nextInt();

        int[] Array = new int[length];

        for (int i = 0;i<length;i++){
            System.out.print("Enter Element ["+i+"] :");
            Array[i] = scanner.nextInt();
        }

        for (int i = 0;i<length;i++){
            System.out.println("Element of An Array= "+Array[i]);
        }
        boolean found = false;
        for (int i = 0;i<length;i++){
            System.out.print("Enter a number to check the index: ");
            int num = scanner.nextInt();
            if (Array[i] == num) {
                System.out.println("index of " + num + " = " + i);
                found = true;
                break;
            }   else {
                System.out.println("number not found");
            }
        }


    }
}
