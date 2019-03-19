import java.util.*;

public class Tests {
	
	static Scanner console = new Scanner(System.in);
	
	// List of Students
	static Vector<String> studentFirstNames = new Vector<String>();
	static Vector<String> studentLastNames = new Vector<String>();
	
	// Initial Variables
	static int sizeOfClass;
	static int numOfTests;
	static double[][] listOfGrades;
	static String[] tableHeader;
	
	public static void main(String[] args) {
		setName("Kaven", "Chanthaphy");
		getClassSize();
		numOfTests(4);
		generateTableHeader();
		System.out.println(Arrays.toString(tableHeader).replace("[", "| ").replace("]", " |").replace(",", " | "));
	}
	
	private static void setName(String firstName, String lastName) {
		studentFirstNames.addElement(firstName);
		studentLastNames.addElement(lastName);
	}
	
	private static int getClassSize() {
		sizeOfClass = studentFirstNames.size();
		return sizeOfClass;
	}
	
	private static int numOfTests(int testQty) {
		numOfTests = testQty;
		return numOfTests;
	}
	
	private static void generateTableHeader() {
		// Additionally two columns to count for the 'Average' and 'Grade'
		tableHeader = new String[numOfTests + 4];
		for (int i = 0; i < (numOfTests + 4); i++) {
			if (i == 0)
				tableHeader[i] = "\tFirst Name\t";
			else if (i == 1)
				tableHeader[i] = "\tLast Name\t";
			else if (i == (numOfTests + 2))
				tableHeader[i] = "Average";
			else if (i == (numOfTests + 3))
				tableHeader[i] = "Grade";
			else {
				String testNumber = Integer.toString(i - 1);
				tableHeader[i] = "Test" + testNumber; 
			}	
		}
		
	}
	private static void generateGradeTable() {
		listOfGrades = new double[sizeOfClass][numOfTests];
	}
	
	private static void inputGrades() {
		
	}
}

