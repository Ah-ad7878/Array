package pk.org.cas.ArryAssignment;

import java.util.Scanner;

public class CharArray {
     private char[] word;
      Scanner scanner = new Scanner(System.in);

      public void setLength(){
          System.out.print("Enter the length of an Array: ");
          int length = scanner.nextInt();
          word = new char[length];
      }

      public void setElement(){
          for (int i = 0; i < word.length; i++) {
              System.out.print("Enter the Element at index ["+i+"]: ");
              word[i] = scanner.next().charAt(0);
          }

          for (int j = 0;j<word.length;j++){
              System.out.println("The Element of an Array at index ["+j+"]"+word[j]);
          }
      }

    public static void main(String[] args) {
        CharArray charArray = new CharArray();
        charArray.setLength();
        charArray.setElement();
    }
}

