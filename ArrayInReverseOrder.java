package pk.org.cas.ArryAssignment;

import java.util.Scanner;

public class ArrayInReverseOrder {
    private int[] array;
    private int length;

    Scanner scanner = new Scanner(System.in);
    public void setLength(){
        System.out.print("Enter the length of an Array: ");
        length = scanner.nextInt();
        array = new int[length];
    }

    public void setElement(){
        for (int i = 0; i < length; i++) {
        System.out.print("Enter the element for an Array: ");
        array[i] = scanner.nextInt();
        }
        for (int i = 0; i < length ; i++) {
            System.out.println("Element in an Array = "+array[i]);
        }
    }

    public void elementInReverse(){
        for (int i = length-1; i>=0 ; i--) {
            System.out.println("Element in reverse order: "+array[i]);
        }
    }
}
