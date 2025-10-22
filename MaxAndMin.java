package pk.org.cas.ArryAssignment;

import java.util.Scanner;

public class MaxAndMin {
    private int[] array;

    Scanner sc = new Scanner(System.in);
    public void setLength(){
        System.out.print("Enter the length of an Array: ");
        int length = sc.nextInt();
        array = new int[length];
    }

    public void setElement(){
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element for an Array: ");
            array[i] = sc.nextInt();
        }
        for (int i = 0;i< array.length;i++){
            System.out.println("Element in an Array = "+array[i]);
        }
    }

    public void maxAndMin(){
        int max;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1;j< array.length;j++){
                if (array[i]<array[j]){
                   max = array[i];
                   array[i] = array[j];
                   array[j] = max;
                }
            }
        }
            System.out.println("Max element in an Array = "+array[0]);
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1;j< array.length;j++){
                if (array[i]>array[j]){
                    max = array[i];
                    array[i] = array[j];
                    array[j] = max;
                }
            }
        }
        System.out.println("Min element in an Array = "+array[0]);
    }
}
