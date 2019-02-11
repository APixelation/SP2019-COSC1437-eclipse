package net.codejava;
import java.util.*;

public class HelloWorld {
	
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = console.nextInt();
		while (num != -1)
		{
			if (num >= 20)
				sum = sum + num;
			else
				sum = sum - num;
			num = console.nextInt();
		}
		
		System.out.println(sum);
	}

}
