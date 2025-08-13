package java_project2;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter numbers (enter 0 to stop):");
        do {
            number = sc.nextInt();
            if (number != 0) {
                System.out.println("You entered: " + number);
            }
        } while (number != 0);
        System.out.println("Program stopped because you entered 0.");
	}

}
