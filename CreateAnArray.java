package pk.org.cas.ArryAssignment;

import java.util.Scanner;

public class CreateAnArray {
    Scanner scanner = new Scanner(System.in);
    private int[] list;
    private int[] array;

    public void setLength() {
        System.out.print("Enter the length of array : ");
        int length = scanner.nextInt();
        list = new int[length];
    }

    public void output() {
        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter a value of an array: ");
            list[i] = scanner.nextInt();
        }

        for (int i = 0;i<list.length;i++){
            System.out.println("Element in array at index  [" + i + "] is " + list[i]);
        }
    }

    public void copyArray() {
        array = new int[list.length];
        for (int j = 0; j < list.length; j++) {
            array[j] = list[j];

            System.out.println("Element of Array2  ["+j+"] " + array[j]);
        }
    }
}
