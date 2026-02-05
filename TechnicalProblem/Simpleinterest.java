package Technicalproblem;
import java .util.Scanner;
public class Simpleinterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P;
		int R;
		int T;
		System.out.println("Enter the principal amount (P): ");
		P= sc.nextInt();
		System.out.println("Enter the rate(R):");
		R= sc.nextInt();
		System.out.println("Enter the time(T):");
		T= sc.nextInt();
		int s1=P*R*T/100;
		System.out.println(s1);	
	}
}
