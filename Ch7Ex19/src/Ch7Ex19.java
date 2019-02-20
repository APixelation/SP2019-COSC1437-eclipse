import javax.swing.*;
import java.awt.*;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.*;

public class Ch7Ex19 extends JFrame {
	
	// GUI Labels
	private JLabel membershipLabel;
	private JLabel trainingSessionLabel;
	private JLabel discountLabel;
	
	// Top Text Area
	private JTextArea informationTA;
	
	// Drop Down Menu Selection
	private JComboBox membershipMonthsCB;
	
	// List Items for Drop Down Menu
	String[] numOfMonths = { "1", "3", "6", "12", "18", "24" };
	
	// Prices
	double discount_rate = 1.00;
	double totalMembershipCost;
	int valueOfMonth = 1;
	int valueOfTrainingSessions = 0;
	private static final double MEMBERSHIP_COST = 500.00;
	private static final double TRAINING_SESSION_COST = 100.00;
	private static final double TRAINING_SESSION_DISCOUNT = .80;
	
	// Text Field for User # of Training Sessions
	private JTextField trainingSessionTF;
	
	// Check Box for Discounts
	private JCheckBox seniorDiscountCB;
	private JCheckBox studentDiscountCB;
	private JCheckBox militaryDiscountCB;
	private JCheckBox fullPayDiscountCB;
	
	// Buttons
	private JButton calculateB;
	private JButton exitB;
	
	// Location Constants
	private static final int WINDOW_WIDTH = 500;
	private static final int WINDOW_HEIGHT = 407;
	private static final int LABEL_WIDTH = 125;
	private static final int LABEL_HEIGHT = 20;
	private static final int BUTTON_WIDTH = (WINDOW_WIDTH / 2);
	private static final int BUTTON_HEIGHT = 50;
	private static final int ROW_1_HEIGHT = 10;
	private static final int ROW_2_HEIGHT = 150;
	private static final int ROW_3_HEIGHT = 200;
	private static final int ROW_4_HEIGHT = 250;
	private static final int ROW_5_HEIGHT = 320;
	private static final int SELECTOR_WIDTH = 200;
	private static final int SELECTOR_MARGIN = 250;
	private static final int CHECKBOX_WIDTH = 75;
	private static final int CHECKBOX_HEIGHT= 50;
	
	// ActionListeners
	private CalculateButtonHandler cbHandler;
	private ExitButtonHandler ebHandler;
	
	// Item Listeners
	private CheckBoxHandler chxboxHandler;
	private ComboBoxHandler comboxHandler;
	
	public Ch7Ex19() {
		
		// Create Information Area
		informationTA = new JTextArea("\tMembership Cost: $500.\n" 
		+ "\tTraining Sessions Cost: $100 per session.\n" 
		+ "\t30% Senior discount off membership total.\n"
		+ "\t15% military/veteran discount.\n"
		+ "\t20% discount per training session after the purchase of 5.\n"
		+ "\t15% full payment discount.\n"
		+ "\t15% student discount.\n", 7, 2);
		
		// Create GUI Labels
		membershipLabel = new JLabel("Number of Months: ", SwingConstants.RIGHT);
		trainingSessionLabel = new JLabel("Training Sessions: ", SwingConstants.RIGHT);
		discountLabel = new JLabel("Choose Discounts: ", SwingConstants.RIGHT);
		
		// Create Text Fields
		trainingSessionTF = new JTextField(3);
		trainingSessionTF.setText("0");
		
		// Create Combo Box
		membershipMonthsCB = new JComboBox(numOfMonths);
		
		// Create Check Box
		seniorDiscountCB = new JCheckBox("Senior");
		studentDiscountCB = new JCheckBox("Student");
		militaryDiscountCB = new JCheckBox("Military");
		fullPayDiscountCB = new JCheckBox("Full Pay");
		
		// Check Box Handler
		chxboxHandler = new CheckBoxHandler();
		seniorDiscountCB.addItemListener(chxboxHandler);
		studentDiscountCB.addItemListener(chxboxHandler);
		militaryDiscountCB.addItemListener(chxboxHandler);
		fullPayDiscountCB.addItemListener(chxboxHandler);
		
		// Combo Box Handler
		comboxHandler = new ComboBoxHandler();
		membershipMonthsCB.addItemListener(comboxHandler);
		
	
		// Create Calculate Button
		calculateB = new JButton("Estimate");
		cbHandler = new CalculateButtonHandler();
		calculateB.addActionListener(cbHandler);
		
		// Create Exit Button
		exitB = new JButton("Exit");
		ebHandler = new ExitButtonHandler();
		exitB.addActionListener(ebHandler);
		
		// Window Title
		setTitle("Membership Estimator");
		
		// Container
		Container pane = getContentPane();
		
		// Layout
		pane.setLayout(null);
		informationTA.setLocation(40,ROW_1_HEIGHT);
		membershipLabel.setLocation(0, ROW_2_HEIGHT);
		trainingSessionLabel.setLocation(0, ROW_3_HEIGHT);
		discountLabel.setLocation(0, ROW_4_HEIGHT);
		calculateB.setLocation(0, ROW_5_HEIGHT);
		exitB.setLocation((WINDOW_WIDTH / 2), ROW_5_HEIGHT);
		membershipMonthsCB.setLocation(SELECTOR_MARGIN, ROW_2_HEIGHT);
		trainingSessionTF.setLocation(SELECTOR_MARGIN, ROW_3_HEIGHT);
		seniorDiscountCB.setLocation((WINDOW_WIDTH / 2), (ROW_3_HEIGHT + 20));
		studentDiscountCB.setLocation((WINDOW_WIDTH / 2) + 80, (ROW_3_HEIGHT + 20));
		militaryDiscountCB.setLocation((WINDOW_WIDTH / 2), (ROW_3_HEIGHT + 60));
		fullPayDiscountCB.setLocation((WINDOW_WIDTH / 2) + 80, (ROW_3_HEIGHT + 60));
		
		// Sizes
		informationTA.setSize(400, 120);
		membershipLabel.setSize(LABEL_WIDTH, LABEL_HEIGHT);
		trainingSessionLabel.setSize(LABEL_WIDTH, LABEL_HEIGHT);
		discountLabel.setSize(LABEL_WIDTH, LABEL_HEIGHT);
		membershipMonthsCB.setSize(SELECTOR_WIDTH, LABEL_HEIGHT);
		trainingSessionTF.setSize(SELECTOR_WIDTH, LABEL_HEIGHT);
		seniorDiscountCB.setSize(CHECKBOX_WIDTH, CHECKBOX_HEIGHT);
		studentDiscountCB.setSize(CHECKBOX_WIDTH, CHECKBOX_HEIGHT);
		militaryDiscountCB.setSize(CHECKBOX_WIDTH, CHECKBOX_HEIGHT);
		fullPayDiscountCB.setSize(CHECKBOX_WIDTH, CHECKBOX_HEIGHT);
		calculateB.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
		exitB.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
		
		// Pane Components
		pane.add(informationTA);
		pane.add(membershipLabel);
		pane.add(membershipMonthsCB);
		pane.add(trainingSessionLabel);
		pane.add(trainingSessionTF);
		pane.add(discountLabel);
		pane.add(seniorDiscountCB);
		pane.add(studentDiscountCB);
		pane.add(militaryDiscountCB);
		pane.add(fullPayDiscountCB);
		pane.add(calculateB);
		pane.add(exitB);
		
		// Window Dimensions
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	// Calculates the cost of the membership
	private class CalculateButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double trainingSessionTotal;
			String trainingSession = trainingSessionTF.getText();
			
			// Converts the text in JTextField to an integer for calculations.
			valueOfTrainingSessions = Integer.parseInt(trainingSession);
			
			// Training Sessions discount for greater than 5
			if (valueOfTrainingSessions > 5) {
				trainingSessionTotal = (TRAINING_SESSION_COST * 5);
				
				// This applies 20% discount per training session about 5 and not the cumulative total. 
				for (valueOfTrainingSessions -= 5; valueOfTrainingSessions > 0; valueOfTrainingSessions--) {
					trainingSessionTotal += (TRAINING_SESSION_COST * TRAINING_SESSION_DISCOUNT);
				}
			}
			
			// For training sessions less than or equal to 5
			else
				trainingSessionTotal = (TRAINING_SESSION_COST * valueOfTrainingSessions);
			
			// Total membership cost calculations
			totalMembershipCost = ((MEMBERSHIP_COST * valueOfMonth) + trainingSessionTotal) * discount_rate;
			
			// Outputs total in a pop up menu
			JOptionPane.showMessageDialog(null, String.format("The total membership costs is: $%.2f", totalMembershipCost));
		}
	}
	
	private class ExitButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	private class CheckBoxHandler implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			
			//Troubleshooting
			//System.out.println(discount_rate);
			
			// Senior Discount
			if (e.getSource() == seniorDiscountCB) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					discount_rate -= .30;
				if (e.getStateChange() == ItemEvent.DESELECTED)
					discount_rate += .30;
			}
			
			// Other discounts
			if (e.getSource() == studentDiscountCB || e.getSource() == militaryDiscountCB || e.getSource() == fullPayDiscountCB) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					discount_rate -= .15;
				if (e.getStateChange() == ItemEvent.DESELECTED)
					discount_rate += .15;
			}
			
			// Troubleshooting
			//System.out.println(discount_rate);
		}
	}
	
	// Gets the value from the JComboBox
	private class ComboBoxHandler implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			String currentMonth;
			if (e.getSource() == membershipMonthsCB) {
				currentMonth = numOfMonths[membershipMonthsCB.getSelectedIndex()];
				
				// Troubleshooting
				//System.out.println(valueOfMonth);
				
				// Switch assigns the integer equivalent to valueOfMonth
				switch(currentMonth) {
				case "3" :
					valueOfMonth = 3;
					break;
				case "6" :
					valueOfMonth = 6;
					break;
				case "12" :
					valueOfMonth = 12;
					break;
				case "18" :
					valueOfMonth = 18;
					break;
				case "24" :
					valueOfMonth = 24;
					break;
				default :
					valueOfMonth = 1;
					break;
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		Ch7Ex19 membershipProgram = new Ch7Ex19();
	}
}

