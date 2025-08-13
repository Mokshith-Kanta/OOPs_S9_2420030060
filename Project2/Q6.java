package java_project2;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a number:");
		int n = sc.nextInt();

		for (int i = 1; i < 11; i++ ) {
			System.out.println(n + " X " + i + " = " + (n*i));
		}
	}

}
