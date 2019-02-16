import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Ch6Ex1 extends JFrame {
	// Labels
	private JLabel testScoreL, weightL;
	
	// Text Fields
	private JTextField testScoreTF, weightTF;
	
	// Buttons
	private JButton enterB, calculateB; // exitB;
	
	// Handlers
	private CalculateButtonHandler cbHandler;
//	private ExitButtonHandler ebHandler;
	private EnterButtonHandler enbHandler;
	
	// Window Size
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	
	ArrayList<Integer> testScoresList = new ArrayList<Integer>();
	ArrayList<Double> weightedValueList = new ArrayList<Double>();
	
	public Ch6Ex1() {
		
		
		// Labels
		testScoreL = new JLabel("Enter a test score: ", SwingConstants.RIGHT);
		weightL = new JLabel("Enter the score weight: ", SwingConstants.RIGHT);


		// Text Fields
		testScoreTF = new JTextField(5);
		weightTF = new JTextField(5);
		
		// Enter Button
		enterB = new JButton("Enter Score");
		enbHandler = new EnterButtonHandler();
		enterB.addActionListener(enbHandler);
		
		// Calculate Button
		calculateB = new JButton("Calculate Average");
		cbHandler = new CalculateButtonHandler();
		calculateB.addActionListener(cbHandler);
		
		// Exit Button
//		exitB = new JButton("Exit");
//		ebHandler = new ExitButtonHandler();
//		exitB.addActionListener(ebHandler);
		
		// Title
		setTitle("Weighted Average Calculator");
		
		// Pane Container
		
		Container pane = getContentPane();

		// Layout
		pane.setLayout(new GridLayout(3, 3));
		
		// Pane Components
		pane.add(testScoreL);
		pane.add(testScoreTF);
		pane.add(weightL);
		pane.add(weightTF);
		pane.add(enterB);
		pane.add(calculateB);
//		pane.add(exitB);
		
		// Window Size
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class EnterButtonHandler implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			testScoresList.add(Integer.parseInt(testScoreTF.getText()));
			weightedValueList.add(Double.parseDouble(weightTF.getText()));
			testScoreTF.setText("");
			weightTF.setText("");
		}
	}
	
	private class CalculateButtonHandler implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			int i, sizeOfList;
			double weightedAverage = 0;
			String outputMessage;
			
			i = 0;
			sizeOfList = testScoresList.size();
			
			// Used for troubleshooting
//			System.out.println("Current test scores: " + testScoresList);
//			System.out.println("Current weighted values: " + weightedValueList);
			
			while (i < sizeOfList) {
				weightedAverage += (testScoresList.get(i) * weightedValueList.get(i));
				i++;
			}
			
			outputMessage = "Test scores: " + testScoresList + "\n" +
							"Weighted Values: " + weightedValueList + "\n" +
							"Weighted Average: " + weightedAverage;
			
			//Used for troubleshooting
//			System.out.println("Total weighted Average: " + weightedAverage);
//			calculatedAverageTF.setText("" + weightedAverage);
			
			JOptionPane.showMessageDialog(null, outputMessage, "Your Weighted Average", JOptionPane.INFORMATION_MESSAGE);
			
		}
	}
	
//	private class ExitButtonHandler implements ActionListener {
//		
//		public void actionPerformed(ActionEvent e) {
//			
//			System.exit(0);
//		}
//	}
	
	public static void main(String[] args) {
		Ch6Ex1 calculator = new Ch6Ex1();
		
	}
	
}
