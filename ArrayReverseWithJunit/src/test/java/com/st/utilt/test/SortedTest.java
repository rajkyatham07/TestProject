package com.st.utilt.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.st.util.Sorter;

public class SortedTest {
	private int[] inPosArray;
	private int[] inNevArray;
	private int[] expectedPosArray;
	private int[] expectedNevArray;
	private Sorter sorter;

	@Before
	public void init() {
		inPosArray = new int[] {  0, 1, 2, 3, 10 };
		expectedPosArray = new int[] { 0, 1, 2, 3, 10 };
		inNevArray = new int[] { -4, -11, -10, -2, -1 };
		expectedNevArray = new int[] { -11, -10, -4, -2, -1 };
		sorter = new Sorter();
	}

	@Test
	public void testSortWithPosNumbers() {
		int[] actualPostNumbers = null;

		actualPostNumbers = sorter.sort(inPosArray);
		Assert.assertArrayEquals(expectedPosArray, actualPostNumbers);
	}

	@Test
	public void testSortWithNevNumbers() {
		int[] actualNevNumbers = null;

		actualNevNumbers = sorter.sort(inNevArray);
		Assert.assertArrayEquals(expectedNevArray, actualNevNumbers);
	}

	@After
	public void cleaup() {
		sorter = null;
	}

}
