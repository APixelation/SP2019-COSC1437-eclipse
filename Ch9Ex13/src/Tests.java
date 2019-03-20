import java.util.*;

public class Tests {
	
	static Scanner console = new Scanner(System.in);
	
	// Student Lists
	static Vector<String> studentFirstNames = new Vector<String>();
	static Vector<String> studentLastNames = new Vector<String>();
	
	// Initial Variables
	static int sizeOfClass;
	static int numOfTests;
	static double[][] listOfGrades;
	static String[] tableHeader;
	
	public static void main(String[] args) {
		
		// List of Students
		setName("Jack", "Johnson");
		setName("Lisa", "Aniston");
		setName("Andy", "Cooper");
		setName("Ravi", "Gupta");
		setName("Bonny", "Blair");
		setName("Danny", "Clark");
		setName("Sam", "Kennedy");
		setName("Robin", "Bronson");
		setName("Sheila", "Sunny");
		setName("Kiran", "Smith");
		
		// Required Functions
		getClassSize();
		numOfTests(5);
		generateTableHeader();
		generateGradeTwoDimList();
		
		// Set Number of Tests
		// Input Grades
		//inputGrades();
		
		// Generates Table
		calculateAverageTestGrade();
		printTable();
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
	
	private static void generateGradeTwoDimList() {
		listOfGrades = new double[sizeOfClass][numOfTests + 1];
	}
	
	// Produces Header that can scale with number of tests inputed by user.
	// Includes columns for first names, last names, average, and grade.
	private static void generateTableHeader() {
		tableHeader = new String[numOfTests + 4];
		for (int i = 0; i < (numOfTests + 4); i++) {
			if (i == 0)
				tableHeader[i] = "First Name\t";
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
		// Test Header Generation
		// System.out.println(Arrays.toString(tableHeader));
	}
	private static void inputGrades() {
		for (int row = 0; row < sizeOfClass; row++) {
			System.out.printf("%s, %s's", studentFirstNames.get(row), studentLastNames.get(row));
				for (int column = 0; column < numOfTests; column++) {
					System.out.printf(" %s: ", tableHeader[column + 2]);
					double currentGrade = console.nextDouble();
					listOfGrades[row][column] = currentGrade;
				}
			}
			
		}
	
	private static void calculateAverageTestGrade() {
		double sum = 0;
		for (int column = 0; column < sizeOfClass; column ++) {
			for (int row = 0; row < numOfTests; row++) {
				sum += listOfGrades[column][row];
			}
		// Inputs the average into the column
		listOfGrades[column][numOfTests] = (sum / numOfTests);
		}
	}
	
	private static String calculateLetterGrade(double averageGrade) {
		String letterGrade = "F";
			if (averageGrade >= 90.00)
				letterGrade = "A";
			else if (averageGrade >= 80.00)
				letterGrade = "B";
			else if (averageGrade >= 70.00)
				letterGrade = "C";
			else if (averageGrade >= 60.00)
				letterGrade = "D";
			else
				return letterGrade;
			return letterGrade;
	}
	private static void printTable() {
		System.out.println(Arrays.toString(tableHeader).replace("[", "| ").replace("]", " |").replace(",", " | "));
		for (int index = 0; index < sizeOfClass; index++) {
			System.out.print(studentFirstNames.get(index) + "\t\t\t" + studentLastNames.get(index) + "\t\t");
			System.out.print(Arrays.toString(listOfGrades[index]).replace("[", "| ").replace("]", " |").replace(",", " | "));
			System.out.println("\t" + calculateLetterGrade(listOfGrades[index][numOfTests]));
		}
	}
}

