import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Ch6Ex1 extends JFrame {
	
	private JLabel testScoreL, weightL, calculatedAverageL;
	
	private JTextField testScoreTF, weightTF, calculatedAverageTF;
	
	private JButton enterB, calculateB, exitB;
	
	private CalculateButtonHandler cbHandler;
	private ExitButtonHandler ebHandler;
	private EnterButtonHandler enbHandler;
	
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	
	ArrayList<Integer> testScoresList = new ArrayList<Integer>();
	ArrayList<Double> weightedValueList = new ArrayList<Double>();
	
	public Ch6Ex1() {
		
		
		// Labels
		testScoreL = new JLabel("Enter a test score: ", SwingConstants.RIGHT);
		weightL = new JLabel("Enter the score weight: ", SwingConstants.RIGHT);
		calculatedAverageL = new JLabel("Average of Test Score(s): ", SwingConstants.RIGHT);

		
		// Text Fields
		testScoreTF = new JTextField(1);
		weightTF = new JTextField(1);
		calculatedAverageTF = new JTextField(1);
		
		// Enter Button
		enterB = new JButton("Enter Score");
		enbHandler = new EnterButtonHandler();
		enterB.addActionListener(enbHandler);
		
		// Calculate Button
		calculateB = new JButton("Calculate Average");
		cbHandler = new CalculateButtonHandler();
		calculateB.addActionListener(cbHandler);
		
		// Exit Button
		exitB = new JButton("Exit");
		ebHandler = new ExitButtonHandler();
		exitB.addActionListener(ebHandler);
		
		// Title
		setTitle("Weighted Average Calculator");
		
		// Pane Container
		
		Container pane = getContentPane();

		// Layout
		pane.setLayout(new GridLayout(5, 3));
		
		// Pane Components
		pane.add(testScoreL);
		pane.add(testScoreTF);
		pane.add(weightL);
		pane.add(weightTF);
		pane.add(calculatedAverageL);
		pane.add(calculatedAverageTF);
		pane.add(enterB);
		pane.add(calculateB);
		pane.add(exitB);
		
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
			System.out.println("Current test scores: " + testScoresList);
			System.out.println("Current weighted values: " + weightedValueList);
		}
	}
	
	private class CalculateButtonHandler implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			int i, sizeOfList;
			double weightedAverage = 0;
			i = 0;
			sizeOfList = testScoresList.size();
			
			while (i < sizeOfList) {
				weightedAverage += (testScoresList.get(i) * weightedValueList.get(i));
				i++;
			}
			calculatedAverageTF.setText("" + weightedAverage);
			
		}
	}
	
	private class ExitButtonHandler implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		Ch6Ex1 rectObject = new Ch6Ex1();
		
	}
	
}
