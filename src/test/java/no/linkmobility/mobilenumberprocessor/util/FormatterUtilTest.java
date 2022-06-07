package no.linkmobility.mobilenumberprocessor.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FormatterUtilTest {
	
	@Test
	public void testFormat() {
		assertEquals("+46703306661", FormatterUtil.format("7033-06661"));
		assertEquals("+46709234893", FormatterUtil.format("0046709234893"));
		assertEquals("+46709234893", FormatterUtil.format("+46 709 234893"));
		assertEquals("+46709234893", FormatterUtil.format("+46709234893"));
	}
}
