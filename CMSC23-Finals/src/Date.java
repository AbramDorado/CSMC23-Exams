import java.util.Scanner;

public class Date {
	public static void execute() {
		System.out.println("input a string Date");
		System.out.println("should be in the form of MM/DD/YYYY");
		Scanner keyboardInput = new Scanner(System.in);

		try {
			System.out.print("input: ");
			String str = keyboardInput.nextLine();

			if (str.charAt(1) == '1' && str.charAt(2) == '/')
				System.out.print("January");
			else if (str.charAt(1) == '2' && str.charAt(2) == '/')
				System.out.print("February");
			else if (str.charAt(1) == '3' && str.charAt(2) == '/')
				System.out.print("March");
			else if (str.charAt(1) == '4' && str.charAt(2) == '/')
				System.out.print("April");
			else if (str.charAt(1) == '5' && str.charAt(2) == '/')
				System.out.print("May");
			else if (str.charAt(1) == '6' && str.charAt(2) == '/')
				System.out.print("June");
			else if (str.charAt(1) == '7' && str.charAt(2) == '/')
				System.out.print("July");
			else if (str.charAt(1) == '8' && str.charAt(2) == '/')
				System.out.print("August");
			else if (str.charAt(1) == '9' && str.charAt(2) == '/')
				System.out.print("September");
			else if (str.charAt(1) == '0' && str.charAt(2) == '/')
				System.out.print("October");
			else if (str.charAt(0) == '1' && str.charAt(1) == '1' && str.charAt(2) == '/')
				System.out.print("November");
			else if (str.charAt(0) == '1' && str.charAt(1) == '2' && str.charAt(2) == '/')
				System.out.print("December");

			if (str.charAt(2) != '/' && str.charAt(5) != '/') {
				System.out.print("Throw an InvalidDateFormatException");
				System.exit(0);
			}

			System.out.print(" ");
			System.out.print(str.charAt(3));
			System.out.print(str.charAt(4));
			System.out.print(" ,");
			System.out.print(str.charAt(6));
			System.out.print(str.charAt(7));
			System.out.print(str.charAt(8));
			System.out.print(str.charAt(9));

		}
		catch(Exception e){
			System.out.print("Throw an InvalidDateFormatException");
		}
	 }

	 public static void main(String[] args) {
		 execute();
	 }
}