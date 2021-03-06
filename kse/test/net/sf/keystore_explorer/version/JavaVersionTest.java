package net.sf.keystore_explorer.version;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JavaVersionTest {

	@Test
	public void test() {
		assertEquals(JavaVersion.JRE_VERSION_160, new JavaVersion("1.6.0"));
		assertTrue(JavaVersion.JRE_VERSION_160.compareTo(new JavaVersion("1.6.0_45")) == 0);

		assertTrue(JavaVersion.JRE_VERSION_170.compareTo(new JavaVersion("1.6.0_45")) > 0);
		assertEquals(JavaVersion.JRE_VERSION_170, new JavaVersion("1.7.0"));
		assertTrue(JavaVersion.JRE_VERSION_170.compareTo(new JavaVersion("1.7.0_101")) == 0);

		assertTrue(JavaVersion.JRE_VERSION_180.compareTo(new JavaVersion("1.7.0_101")) > 0);
		assertEquals(JavaVersion.JRE_VERSION_180, new JavaVersion("1.8.0"));
		assertTrue(JavaVersion.JRE_VERSION_180.compareTo(new JavaVersion("1.8.0_20")) == 0);

		assertEquals(1, new JavaVersion("1.8.0_20-b62").getMajor());
		assertEquals(8, new JavaVersion("1.8.0_20-b62").getMinor());
		assertEquals(0, new JavaVersion("1.8.0_20-b62").getSecurity());


		assertEquals(9, new JavaVersion("9").getMajor());
		assertEquals(0, new JavaVersion("9").getMinor());
		assertEquals(9, new JavaVersion("9-ea").getMajor());
	}

}
