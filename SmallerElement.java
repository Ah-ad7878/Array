package pk.org.cas.ArryAssignment;

import java.util.Scanner;

public class SmallerElement {
    private int[] array;

    Scanner scanner  = new Scanner(System.in);
    public void setLength(){
        System.out.print("Enter the length of an Array: ");
        int length = scanner.nextInt();
        array = new int[length];
    }

    public void setElement(){
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element of an Array: ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element in Array = "+array[i]);
        }
    }

    public void checkSmallerElement(){
        int max;
        for (int i = 0; i < array.length-1 ; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j]){
                    max = array[i];
                    array[i] = array[j];
                    array[j] = max;
                }
            }
        }
        System.out.println("Smaller Element = "+array[1]);
    }
}
