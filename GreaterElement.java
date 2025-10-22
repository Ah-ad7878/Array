package pk.org.cas.ArryAssignment;

import java.util.Scanner;

public class GreaterElement {
    private int[] a;

    Scanner sc = new Scanner(System.in);

    public void setLength(){
        System.out.print("Enter a length of an Array: ");
        int length = sc.nextInt();
        a = new int[length];
    }

    public void setElement(){
        for (int i = 0;i<a.length;i++){
            System.out.print("Enter the Element of an Array: ");
            a[i] = sc.nextInt();
        }
    }

    public void checkMaxElement(){
        int max;
        for (int i = 0;i<a.length-1;i++){
            for (int j = i+1; j <a.length ; j++) {
             if (a[i]<a[j]){
                 max = a[i];
                 a[i] = a[j];
                 a[j] = max;
             }
            }
        }
        System.out.println("Second max element = "+a[1]);
    }
}
