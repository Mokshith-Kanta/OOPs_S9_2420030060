package java_project2;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

System.out.print("Enter marks");
int marks = sc.nextInt();

if (marks >= 90 && marks <= 100) {
    System.out.println("Grade: A+");
} else if (marks >= 80) {
    System.out.println("Grade: A");
} else if (marks >= 70) {
    System.out.println("Grade: B");
} else if (marks >= 60) {
    System.out.println("Grade: C");
} else if (marks >= 50) {
    System.out.println("Grade: D");
} else if (marks >= 0) {
    System.out.println("Grade: F (Fail)");
} else {
    System.out.println("Invalid marks entered!");
}
	}

}
