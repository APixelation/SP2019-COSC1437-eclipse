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
	
	// Grade List for the purpose of testing the program automatically.
	// Comment out list if entering grades manually
	static double[] studentGrades = {85, 83, 77, 91, 76, 80, 90, 95, 93, 48, 78, 81, 11, 90, 73, 92, 83, 30, 69, 87, 23, 45, 96, 38, 59, 60, 85, 45, 39, 67, 77, 31, 52, 74, 83, 93, 94, 89, 77, 97, 79, 85, 28, 93, 82, 85, 72, 49, 75, 63};
	
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
		// Set Number of Tests
		numOfTests(5);
		generateTableHeader();
		generateGradeTwoDimList();
		
		// Input Grades
		inputGrades();
		
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
	
	// Creates the two dim array for student grades
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
	
	// Input Grades, used with for loop to iterate through the number of tests per student.
	private static void inputGrades() {
		// Index required for automation testing, comment out if manually entering grades.
		int index = 0;
		
		for (int row = 0; row < sizeOfClass; row++) {
			System.out.printf("%s, %s's ", studentFirstNames.get(row), studentLastNames.get(row));
				for (int column = 0; column < numOfTests; column++) {
					System.out.printf("%s: ", tableHeader[column + 2]);
					
					// Uncomment below code to manually enter grades for each test per student.
					
					// double grade = console.nextDouble();
					// listOfGrades[row][column] = grade;
					
					// End of manual code
					
					
					// Below is automation of student grades for testing.
					// Comment out if manually entering grades
					
					System.out.println(studentGrades[index]);
					listOfGrades[row][column] = studentGrades[index];
					index += 1;
					
					// End of automation code
				}
				System.out.println();
			}
			
		}
	
	// Calculates the row of the average test scores
	private static void calculateAverageTestGrade() {
		double sum = 0;
		for (int column = 0; column < sizeOfClass; column ++) {
			for (int row = 0; row < numOfTests; row++) {
				sum += listOfGrades[column][row];
			}
		// Inputs the average into the column
		listOfGrades[column][numOfTests] = (sum / numOfTests);
		
		// Resets Sum to Zero
		sum = 0;
		}
	}
	
	// Calculates grade letter for average
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
			System.out.print(Arrays.toString(listOfGrades[index]).replace("[", " |  ").replace("]", " \t |").replace(",", "  | "));
			System.out.println("    " + calculateLetterGrade(listOfGrades[index][numOfTests]) + "   |");
		}
	}
}

