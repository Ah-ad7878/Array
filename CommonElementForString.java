package pk.org.cas.ArryAssignment;

import java.util.Objects;
import java.util.Scanner;

public class CommonElementForString {
    private String[]arr1;
    private String[]arr2;

    Scanner scanner = new Scanner(System.in);

    public void setLengthArray1(){
        System.out.print("Enter a length for Array1: ");
        int length = scanner.nextInt();
        arr1 = new String[length];
    }

    public void setLengthArray2(){
        System.out.print("Enter a length for Array2: ");
        int length = scanner.nextInt();
        arr2 = new String[length];
    }

    public void setElementArray1(){
        for (int i = 0;i< arr1.length;i++){
            System.out.print("Enter element for array1 ["+i+"]: ");
            arr1[i] = scanner.next();
        }
    }

    public void setElementArray2(){
        for (int i = 0;i< arr2.length;i++){
            System.out.print("Enter element for array2 ["+i+"]: ");
            arr2[i] = scanner.next();
        }
    }

    public void showElementArray1(){
        for (int i = 0; i < arr1.length; i++) {
        System.out.println("Element of Array1 "+arr1[i]);
        }
    }

    public void showElementArray2(){
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Element of Array2 "+arr2[i]);
        }
    }

    public void checkCommonElement(){
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (Objects.equals(arr1[i], arr2[j])){
                    System.out.println("Common Element = "+arr1[i]);
                    break;
                }
            }
        }
    }

}
