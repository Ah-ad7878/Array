package pk.org.cas.ArryAssignment;

import java.util.Scanner;

public class InsertElementInArray {
    private int[] a;
    private int length;
    private int loc;
    private int item;

    Scanner scanner = new Scanner(System.in);
    public void setLength(){
        System.out.print("Enter the length of an array: ");
        length = scanner.nextInt();
        a = new int[length+1];
    }

    public void setElement(){
        for (int i = 0; i < length; i++) {
            System.out.print("Enter the element for an Array: ");
            a[i] = scanner.nextInt();
        }
        for (int i = 0;i<length;i++){
            System.out.println("Element in Array = "+a[i]);
        }
    }

    public void insertElement(){
        System.out.print("Enter the new item: ");
        item = scanner.nextInt();
        System.out.print("Enter location where you insert item: ");
        loc = scanner.nextInt();

        for (int i = length; i > loc; i--) {
                a[i] = a[i-1];
        }
        a[loc] = item;
        length++;
        for (int i = 0;i<length;i++){
            System.out.println("Element in Array = "+a[i]);
        }

    }
}
