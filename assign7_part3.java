public class NOMATCHEXCP extends Exception{
	
	public NOMATCHEXCP(int lineNumber, String input) {
        super("Error at line " + lineNumber + ": Input '" + input + "' does not match 'India'");
    }

}


import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        try {
            if (!userInput.equals("India")) {
                throw new NOMATCHEXCP(getLineNumber(), userInput);
            } else {
                System.out.println("Input matched successfully!");
            }
        } catch (NOMATCHEXCP e) {
            System.out.println(e.getMessage());
        }
    }

    private static int getLineNumber() {
        // Getting the line number where the exception occurred
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

}
