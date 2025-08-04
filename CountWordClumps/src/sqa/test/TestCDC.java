package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sqa.main.CountWordClumps;

class TestCDC {

	@Test
	public void TC16() {
	    assertEquals(0, CountWordClumps.countClumps(null));
	}

	@Test
	public void TC17() {
	    assertEquals(0, CountWordClumps.countClumps(new int[] {}));
	}

	@Test
	public void TC18() {
	    assertEquals(1, CountWordClumps.countClumps(new int[] {4, 4}));
	}

	@Test
	public void TC19() {
	    assertEquals(0, CountWordClumps.countClumps(new int[] {1, 2}));
	}


}
