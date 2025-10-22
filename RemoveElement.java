package pk.org.cas.ArryAssignment;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        int[] array;
        int length;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of an Array: ");
        length = scanner.nextInt();
        array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the element for an Array at index ["+i+"]: ");
            array[i] = scanner.nextInt();
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element in Array = "+array[i]);
        }

        System.out.print("Enter a location of a number which you want to delete: ");
        int location = scanner.nextInt();


        if (location < 0 || location >= length) {
            System.out.println("Invalid index!");
        } else {
            for (int i = location; i < length - 1; i++) {
                array[i] = array[i + 1];
            }
            length--;


            for (int i = 0; i < length; i++) {
                System.out.println("Array After remove an Element "+array[i]);
            }
        }

    }
}
