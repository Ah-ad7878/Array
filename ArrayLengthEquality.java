package pk.org.cas.ArryAssignment;

import java.util.Scanner;

public class ArrayLengthEquality {
    private int[] array1;
    private int[] array2;
    private int length;

    Scanner sc = new Scanner(System.in);
    public void setLengthA1(){
        System.out.print("Enter the length of an Array1: ");
        length = sc.nextInt();
        array1 = new int[length];
    }

    public void setLengthA2(){
        System.out.print("Enter the length of an Array2: ");
        length = sc.nextInt();
        array2 = new int[length];
    }

    public void setElementA1(){
        for (int i = 0; i < length; i++) {
            System.out.print("Enter element for Array1["+i+"]: ");
            array1[i] = sc.nextInt();
        }
        for (int i = 0; i < length; i++) {
            System.out.println("Element in an Array = "+array1[i]);
        }
    }

    public void setElementA2(){
        for (int i = 0; i < length; i++) {
            System.out.print("Enter element for Array2["+i+"]: ");
            array2[i] = sc.nextInt();
        }
        for (int i = 0; i < length; i++) {
            System.out.println("Element in an Array = "+array2[i]);
        }
    }

    public void checkLengthEquality(){
        if (array1.length == array2.length){
            System.out.println("length of Both Array is Equal");
        }
        else {
            System.out.println("length of Both Array is not Equal");
        }
    }
}
