package pk.org.cas.ArryAssignment;

import java.util.Scanner;

public class CommonElement {
    private int[] array1;
    private int[] array2;

    Scanner scanner = new Scanner(System.in);

    public void setLengthOfArray1(){
        System.out.print("Enter the length of first Array: ");
        int length1 = scanner.nextInt();
        array1 = new int[length1];
    }

    public void setLengthArray2(){
        System.out.print("Enter the length of Array2: ");
        int length2 = scanner.nextInt();
        array2 = new int[length2];
    }

    public void setElementArray1(){
        for (int value = 0;value< array1.length;value++){
            System.out.print("Enter the Element for array1 ["+value+"]: ");
            array1[value] = scanner.nextInt();
        }
    }

    public void showArray1(){
        for (int value = 0;value< array1.length;value++){
            System.out.println("Element of Array1 = "+array1[value]);
        }
    }

    public void setElementArray2(){
        for (int value = 0;value< array2.length;value++){
            System.out.print("Enter the Element for array2 ["+value+"]: ");
            array2[value] = scanner.nextInt();
        }
    }

    public void showArray2(){
        for (int value = 0;value< array2.length;value++){
            System.out.println("Element of Array2 = "+array2[value]);
        }
    }

    public void checkCommonElement(){
        for (int value = 0;value< array1.length;value++){
            for (int i = 0;i< array2.length;i++){
            if (array1[value] == array2[i]) {
                System.out.println("common element = "+array1[value]);
                break;
            }
            }
        }
    }
}
