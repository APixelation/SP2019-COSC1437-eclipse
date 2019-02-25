
public class Roman {
	
	private String romanNumber;
	private int decimalNumber;
	
	public Roman() {
		romanNumber = "";
		decimalNumber = 0;
	}
	
	public void convertRoman(String romNum) {
		for (int i = 0; i < romNum.length(); i++) {
			char currentChar = romNum.charAt(i);
			switch(currentChar) {
			case 'M' :
				decimalNumber += 1000;
				break;
			case 'D' :
				decimalNumber += 500;
				break;
			case 'C' : 
				decimalNumber += 100;
				break;
			case 'L' :
				decimalNumber += 50;
				break;
			case 'X' :
				decimalNumber += 10;
				break;
			case 'V' :
				decimalNumber += 5;
				break;
			case 'I' :
				decimalNumber += 1;
				break;
			default :
				System.out.printf("%c is not a roman numeral.", currentChar);
			}
				
		}
	}
	
}
