package no.linkmobility.mobilenumberprocessor.util;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidationUtilTest {
	
	@Test
	public void testIsValid() {
		assertFalse(ValidationUtil.isValid("+4670####345"));
		assertFalse(ValidationUtil.isValid("+46....234"));
		assertFalse(ValidationUtil.isValid("+4607012"));
		assertFalse(ValidationUtil.isValid("+460704550056701"));
		assertTrue(ValidationUtil.isValid("070-3306661"));
		assertTrue(ValidationUtil.isValid("+46709234893"));
	}

}