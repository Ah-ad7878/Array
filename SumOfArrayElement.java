package pk.org.cas.ArryAssignment;

import java.util.Scanner;

public class SumOfArrayElement {
    private int[] array;
    int sum = 0;
    int average = 0;

    Scanner scanner = new Scanner(System.in);

    public void setLength(){
        System.out.print("Enter the length of an Array :");
        int length = scanner.nextInt();
        array = new int[length];
    }

    public void output(){
        for (int i = 0;i<array.length;i++){
            System.out.print("Enter the Element: ");
            array[i] = scanner.nextInt();
            sum+=array[i];
            average = sum/ array.length;

        }

        System.out.println("Sum of the Element of an Array = "+sum);
        System.out.println("The average of an Array = "+average);
    }
}
