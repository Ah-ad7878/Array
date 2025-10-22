package pk.org.cas.ArryAssignment;

import java.util.Scanner;

public class DuplicateElement {
    private int[] arr;
    private int length;

    Scanner sc = new Scanner(System.in);
    public void setLength(){
        System.out.print("Enter the length of an Array: ");
        length = sc.nextInt();
        arr = new int[length];
    }

    public void setElement(){
        for (int i = 0; i < length; i++) {
            System.out.print("Enter the Element of an Array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.println("Element in Array = "+arr[i]);
        }
    }

    public void findDuplicate(){
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if (arr[i] == arr[j]){
                    System.out.println("Duplicate Element = "+arr[j]);
                }
            }
        }
    }
}
