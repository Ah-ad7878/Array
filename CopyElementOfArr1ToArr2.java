package pk.org.cas.ArryAssignment;

import java.util.Scanner;

public class CopyElementOfArr1ToArr2 {
    private int[] arr1;
    private int[] arr2;
    private int length;

    Scanner scanner = new Scanner(System.in);
    public void setLength(){
        System.out.print("Enter the length of an Array: ");
        length = scanner.nextInt();
        arr1 = new int[length];
        arr2 = new int[length];
    }

    public void setElement(){
        for (int i = 0; i < length; i++) {
            System.out.print("Enter the element of array1: ");
            arr1[i] = scanner.nextInt();
        }

        for (int i = 0; i < length; i++) {
            System.out.println("Element of array1 = " + arr1[i]);
        }

        System.out.println();
        for (int i = 0; i < length; i++) {
            arr2[i] = arr1[i];
            System.out.println("Element of array2 = "+arr2[i]);
        }

    }

}
