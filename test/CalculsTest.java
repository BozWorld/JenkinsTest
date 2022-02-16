

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author test
 * 
 */
class CalculsTest {

	private Calculs c1 = null;
	private Calculs c2 = null;
	private Calculs c3 = null;
	private Calculs c4 = null;
	private Calculs c5 = null;
	private Calculs c6 = null;
	/**
	 * Initialise les valeurs avant chaque test 
	 */
	@BeforeEach // Déclencher cette méthode avant l'ex�cution
	void setUp() throws Exception 
	{
		c1 = new Calculs(1,2);
		c2 = new Calculs(10,20);
		c3 = new Calculs(100,200);
		c4 = new Calculs(6,6);
		c5 = new Calculs(10,2);
		c6 = new Calculs(40,4);
	}

	

	/**
	 * Test method for {@link Calculs#multiplier()}.
	 */
	@Test
	void testMultiplier() 
	{
		if (c1.multiplier() != 2)
		{
			fail("Methode multiplier non conforme 1*2=2 ne fonctionne pas.");
		}
		if (c2.multiplier() != 200)
		{
			fail("Methode multiplier non conforme 10*20=200 ne fonctionne pas.");			
		}
		if (c3.multiplier() != 20000)
		{
			fail("Methode multiplier non conforme 100*200=20000 ne fonctionne pas.");			
		}
		// Est ce que (2 == 42) ? non donc : test en Erreur
		assertEquals(c1.multiplier(), 2, "Methode multiplier non conforme 1*2=2 ne fonctionne pas.");

	}

	/**
	 * Test method for {@link Calculs#additionner()}.
	 */
	@Test
	void testAdditionner() {
		if ( c1.additionner() != 3)
		{
			fail("methode additionner non conforme 1+2=3 ne fonctionne pas.");
		}
		if ( c2.additionner() != 30)
		{
			fail("methode additionner non conforme 10+20=30 ne fonctionne pas.");
		}
		if ( c3.additionner() != 300)
		{
			fail("methode additionner non conforme 100+200=300 ne fonctionne pas.");
		}
		
		assertEquals(c1.additionner(),3, "methode additionner non conforme 1+2 = 3 ne fonctionne pas");
	}

	/**
	 * Test method for {@link Calculs#diviser()}.
	 */
	@Test
	void testDiviser() {
		if (c4.diviser() != 1)
		{
			fail("methode diviser non conforme 6/6=1 ne fonctionne pas");
		}
		if (c5.diviser() != 5)
		{
			fail("methode diviser non conforme 10/2 = 5 ne fonctionne pas");
		}
		if (c6.diviser() != 10)
		{
			fail("methode diviser non conforme 100/200 = 0.5 ne fonctionne pas");
		}
		assertEquals(c4.diviser(),1, "methode diviser non conforme 1/2 = 0.5 ne fonctionne pas");
	}

	/**
	 * Test method for {@link Calculs#soustraire()}.
	 */
	@Test
	void testSoustraire() {
		if (c1.soustraire() != -1)
		{
			fail("methode soustraire non conforme 1-2 = -1 ne fonctionne pas");
		}
		if (c2.soustraire() != -10)
		{
			fail("methode soustraire non conforme 10-20 = -10 ne fonctionne pas");
		}
		if (c3.soustraire() != -100)
		{
			fail("methode soustraire non conforme 100-200 = -100 ne fonctionne pas");
		}
		assertEquals(c1.soustraire(),-1, "methode soustraire non conforme 1-2 = -1 ne fonctionne pas");
	}
	

}
