package regexPinValidation;

public class Validation {
	
	public static boolean validate(String input)
	{
		System.out.println(input);
		boolean result = false;
		String pattern1 = "^\\d{6}$";
		boolean pattern1Match = input.matches(pattern1);
		System.out.println(pattern1Match);
		
		String pattern2 = "^\\d{4}$";
		boolean pattern2Match = input.matches(pattern2);
		
		System.out.println(pattern2Match);
		
		if (pattern1Match || pattern2Match)
		{
			result = true;
		}
		
		return result;
	}

}
