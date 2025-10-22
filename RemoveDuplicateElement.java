package pk.org.cas.ArryAssignment;

import java.util.Scanner;

public class RemoveDuplicateElement {

       private int[] array;
       private int length;
       Scanner sc  = new Scanner(System.in);

        public void setLength(){
            System.out.print("Enter the length of an Array: ");
            length = sc.nextInt();
            array = new int[length];
        }

        public void setElement(){
            for (int i = 0;i<length;i++){
                System.out.print("Enter the element ["+i+"]: ");
                array[i] = sc.nextInt();
            }
            for (int i = 0; i <length; i++) {
                System.out.println("The element in an Array = "+array[i]);
            }
        }

        public void removeDuplicateElement(){
            for (int i = 0; i <length; i++) {
                for (int j = i+1; j <length; j++) {
                    if (array[i] == array[j]){
                        for (int k = j; k <length-1; k++) {
                            array[k] = array[k+1];
                        }
                        length--;
                        j--;
                    }
                }
            }

            for (int i = 0; i <length; i++) {
                System.out.println("Array After delete duplicate element = "+array[i]);
            }
        }



}
