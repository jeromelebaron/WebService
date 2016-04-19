package fr.afcepf.atod26.webservice.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import fr.afcepf.atod26.webservice.api.IMonService;

public class MonServiceimplTest {

	private IMonService monService;

	@Before
	public void init() {
		monService = new MonServiceimpl();
	}

	@Test
	public void testAdd() {
		int resultatGenere = monService.add(10, 10);
		int resultatAttendu = 20;

		Assert.assertEquals("Vérification du résultat de l'addition",
				resultatAttendu, resultatGenere);
	}

	@Test
	public void testPuissance() {
		double resultatGenere = monService.puissance(10, 10);
		double resultatAttendu = 100;

		Assert.assertEquals(resultatAttendu, resultatGenere, 0.00);
	}

}
