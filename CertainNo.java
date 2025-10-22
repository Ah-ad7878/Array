package pk.org.cas.ArryAssignment;

import java.util.Scanner;

public class CertainNo {
    private int[] array;

    Scanner sc = new Scanner(System.in);

    public void setLength(){
        System.out.print("Enter the length of an Array: ");
        int length = sc.nextInt();
        array = new int[length];
    }

    public void putValueInArray(){
        for (int i = 0;i< array.length;i++){
        System.out.print("Enter name for an Array ["+i+"] : ");
        array[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0;i< array.length;i++){
            System.out.println("The Element in an Array = "+array[i]);
        }
    }

    public void setCertainNo(){
        for (int i = 0;i< array.length;i++){
            System.out.print("Enter a number which want you in Array: ");
            int certainNumber = sc.nextInt();
            boolean found = false;
            if (array[i] == certainNumber){
                System.out.println("Number found in Array");
               boolean found1 = found;
                break;
            }else {
                System.out.println("Number not found in Array");
            }
        }
    }
}
