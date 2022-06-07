package no.linkmobility.mobilenumberprocessor.util;

public class FormatterUtil {
	
	public static final String ISD_CODE = "+46";
	public static final String SPACE_HYPHEN_PATTERN = "[\\s-]*"; 
	
	public static String format(String number) {
		number = number.replaceAll(SPACE_HYPHEN_PATTERN, ""); 
	    if(number.startsWith("0046"))
	    	number = number.replaceFirst("0046", ISD_CODE);
	    if(!number.startsWith(ISD_CODE))
	    	number = ISD_CODE+number;
		return number;
	}

}
