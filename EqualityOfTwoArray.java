package pk.org.cas.ArryAssignment;

import java.util.Scanner;

public class EqualityOfTwoArray {
    private String[] arr1;
    private String[] arr2;
    private int length;

    public void setLengthArr1(){
        System.out.print("Enter the length of an Array1: ");
        length = new Scanner(System.in).nextInt();
        arr1 = new String[length];
    }

    public void setLengthArr2(){
        System.out.print("Enter the length of an Array2: ");
        length = new Scanner(System.in).nextInt();
        arr2 = new String[length];
    }

    public void setElementArr1(){
        for (int i = 0; i < length; i++) {
            System.out.print("Enter the Element for Array1: ");
            arr1[i] = new Scanner(System.in).nextLine();
        }

        for (int i = 0; i < length; i++) {
            System.out.println("Element in Array1 = "+arr1[i]);
        }
    }

    public void setElementArr2(){
        for (int i = 0; i < length; i++) {
            System.out.print("Enter the Element for Array2: ");
            arr2[i] = new Scanner(System.in).nextLine();
        }

        for (int i = 0; i < length; i++) {
            System.out.println("Element in Array2 = "+arr2[i]);
        }
    }

    public void checkEquality(){
        boolean isFound  = true;
        for (int Array1 = 0; Array1 < length; Array1++) {
                if (!arr1[Array1].equals(arr2[Array1])) {
                   isFound = false;
                   break;
                }

        }
        if (isFound){
            System.out.println("Array Element are Equal");
        }else {
            System.out.println("Array Element are not equal");
        }
    }
}
