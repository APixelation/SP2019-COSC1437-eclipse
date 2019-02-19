package net.codejava;
import java.util.*;

public class HelloWorld {
	
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a value: ");
		int num = console.nextInt();
		
		if (num > 0)
			num = num + 13;
		else
			if (num >= 3)
				num = num +15;
		System.out.println(num);
	}
	
}
