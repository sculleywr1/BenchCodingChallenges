package regexPinValidation;

public class Validation {
	
	public static boolean validate(String input)
	{
		// Returns true if the operation was successful false otherwise.
		boolean result = false;
		// Generates a regular expression pattern for the first acceptable character pattern.
		String pattern1 = "^\\d{6}$";
		// Returns true if the input matches the pattern defined by the regular expression in pattern1.
		boolean pattern1Match = input.matches(pattern1);
		
		String pattern2 = "^\\d{4}$";
		boolean pattern2Match = input.matches(pattern2);
		
		// Checks if at least one pattern matches. If they do, change the boolean to true
		if (pattern1Match || pattern2Match)
		{
			result = true;
		}
		
		return result;
	}

}
