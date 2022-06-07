package no.linkmobility.mobilenumberprocessor.util;

import org.apache.commons.lang3.StringUtils;

public class ValidationUtil {
	
	public static boolean isValid(String number) {
		 number = number.replaceAll("[\\s-+]*", "");
		 if(!StringUtils.isNumeric(number)) {
       	 return false;
        }
        if(number.length() < 10 || number.length() > 12 ) {
		   return false;
        }
        return true;
	}

}
