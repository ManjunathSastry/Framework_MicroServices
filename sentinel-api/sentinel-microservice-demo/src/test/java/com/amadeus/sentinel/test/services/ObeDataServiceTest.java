package com.amadeus.sentinel.test.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.amadeus.sentinel.exceptions.ObeNotFoundException;
import com.amadeus.sentinel.models.Obe;
import com.amadeus.sentinel.services.impl.ObeDataServiceImpl;

/**
 * Unit test for simple App.
 */
@RunWith(MockitoJUnitRunner.class)
public class ObeDataServiceTest {

	@InjectMocks
	ObeDataServiceImpl obeDataServiceImpl;

	/**
	 * Testing getObeForObeName when valid obe name is given
	 */
	@Test
	public void testGetObeForObeNameForValidObe() {
		Obe testObe = obeDataServiceImpl.getObeForObeName("ABC");
		assertNotNull(testObe);
		assertEquals("ABC", testObe.getObeName());
		assertEquals("1234", testObe.getStartDate());
		assertEquals("5678", testObe.getEndDate());
	}

	/**
	 * Testing getObeForObeName when invalid obe name is given
	 */
	@Test
	public void testGetObeForObeNameForInvalidObe() {
		Obe testObe = obeDataServiceImpl.getObeForObeName("BBC");
		assertNull(testObe);
	}

	/**
	 * Testing getAllObe
	 */
	@Test
	public void testGetAllObe() {
		List<Obe> testObeList = obeDataServiceImpl.getAllObe();

		assertNotNull(testObeList);
		assertEquals(3, testObeList.size());

		assertNotNull(testObeList.get(0));
		assertEquals("ABC", testObeList.get(0).getObeName());
		assertEquals("1234", testObeList.get(0).getStartDate());
		assertEquals("5678", testObeList.get(0).getEndDate());

		assertNotNull(testObeList.get(1));
		assertEquals("DEF", testObeList.get(1).getObeName());
		assertEquals("91011", testObeList.get(1).getStartDate());
		assertEquals("1213", testObeList.get(1).getEndDate());

		assertNotNull(testObeList.get(2));
		assertEquals("GHI", testObeList.get(2).getObeName());
		assertEquals("141516", testObeList.get(2).getStartDate());
		assertEquals("171819", testObeList.get(2).getEndDate());
	}

	/**
	 * Testing addNewObe
	 */
	@Test
	public void testAddNewObe() {
		Obe testObe = new Obe("HIH", "111", "222");
		Boolean status = obeDataServiceImpl.addNewObe(testObe);
		assertTrue(status);
	}

	/**
	 * Testing update obe when valid obe name is given
	 * 
	 * @throws ObeNotFoundException
	 */
	@Test
	public void testUpdateObeForNameForValidName() throws ObeNotFoundException {
		String testObeName = "ABC";
		Map<String, String> testNewData = new HashMap<>();
		testNewData.put("startDate", "12345");
		testNewData.put("endDate", "67898");
		Boolean status = obeDataServiceImpl.updateObeForName(testObeName, testNewData);
		assertTrue(status);
	}

	/**
	 * Testing update obe when invalid obe name is given
	 * 
	 * @throws ObeNotFoundException
	 */
	@Test(expected = ObeNotFoundException.class)
	public void testUpdateObeForNameForInvalidName() throws ObeNotFoundException {
		String testObeName = "EEE";
		Map<String, String> testNewData = new HashMap<>();
		testNewData.put("startDate", "12345");
		testNewData.put("endDate", "67898");
		obeDataServiceImpl.updateObeForName(testObeName, testNewData);
	}

}
