package Technicalproblem;
import java .util.Scanner;
public class Primecheck {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc. nextInt();
		boolean check =true;
		for(int i=2; i>n; i++) {
			if (n%i==0) {
		check=false;
		break;
			}
		}
		 if(check=true)
		 {
			 System.out.println("This is Prime");
		 }
		 else
	     {
			 System.out.println("This is Not Prime");
		 }
		 }
}


