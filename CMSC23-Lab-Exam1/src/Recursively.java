import java.util.Scanner;

public class Recursively {
    static Integer number;

    public static Integer getNumberOfDivisions(Integer number){
        if (number == 1)
            return 0;
        else {
            if(number % 2 == 0)
                return 1 + getNumberOfDivisions(number / 2);
            else
                return 1 + getNumberOfDivisions(number-1)/2;
        }
    }

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your desired number: ");
        number = input.nextInt();

        getNumberOfDivisions(number);
        System.out.println("The method returns:");
        System.out.print(getNumberOfDivisions(number) + " divisions performed.");
    }
}
