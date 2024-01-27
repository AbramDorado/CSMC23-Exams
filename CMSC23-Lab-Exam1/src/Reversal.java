import java.util.Scanner;

public class Reversal {

    public static String reverse (String aString) {
        String newAString = "";

        for (int i=0; i<aString.length(); i++) {
            char getCharacter = aString.charAt(i);
            newAString = getCharacter + newAString;
        }
        return newAString;
    }

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String aString = input.next();

        System.out.println("Reversed string: " + reverse(aString));
    }
}
