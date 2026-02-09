package Technicalproblem;

public class smallatoz {

	public static void main(String[] args) {
		printLetters();
    }
    static void printLetters() {
        for(char ch = 'a'; ch <= 'z'; ch++) {
            showAscii(ch);
        }
    }
    static void showAscii(char ch) {
        int ascii = ch;
        System.out.println(ch + " = " + ascii);
	}}