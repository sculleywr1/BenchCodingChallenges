package regexPinValidation;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] pins = {"121317", "1234", "45135", "89abc1", "900876", " 4983"};
		
		// Cycles through the pins and says which pins are valid.
		for (int i = 0; i < pins.length; i++) 
		{
			boolean isValid = Validation.validate(pins[i]);
			System.out.println("Result is " + isValid);
		}
	}

	

}
