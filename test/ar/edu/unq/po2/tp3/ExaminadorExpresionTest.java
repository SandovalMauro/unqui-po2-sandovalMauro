package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExaminadorExpresionTest {
	private String a = "abc";
	private String s = a;
	private String t;
	
	
	@BeforeEach
	public void setUp() throws Exception{
		
	}
	
	@Test
	public void sLengthTest() {
		assertEquals(3,s.length());	
	}
	
//	@Test
//	public void tLengthTest() {
//		org.junit.jupiter.api.Assertions.assertThrows(t.length());
//	}
	
	@Test
	public void numeroMasTextoTest() {
		assertEquals("1abc",1+a);	
	}
	
	@Test
	public void upperCaseTest() {
		assertEquals("ABC",a.toUpperCase());	
	}
	
	@Test
	public void indiceTextoTest() {
		assertEquals(4,"Libertad".indexOf("r"));	
	}
	
	@Test
	public void lasrIndiceTextoTest() {
		assertEquals(7,"Universidad".lastIndexOf("i"));	
	}
	
	@Test
	public void subStringTest() {
		assertEquals("il","Quilmes".substring(2,4));	
	}
	
	@Test
	public void lengthYStartsWithTest() {
		assertFalse((a.length() + a).startsWith("a"));
		//assertEquals(false,(a.length() + a).startsWith("a"));	
	}
	
	@Test
	public void textosIgualesTest() {
		assertTrue(s==a);
	}
	
	@Test
	public void substringDistintoTest() {
		assertTrue(a.substring(1,3).equals("bc"));
	}
}
