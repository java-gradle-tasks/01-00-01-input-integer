import java.io.PrintStream;
import java.util.Scanner;

public class MyYearOfBirth {

	public static void main(final String[] args) {
		// Write your solution here
		System.out.print("Adja meg a szuletesi evet:");
		Scanner in=new Scanner(System.in);
		int yearOfBirth=in.nextInt();
		System.out.println(yearOfBirth);
		in.close();
	}

}
