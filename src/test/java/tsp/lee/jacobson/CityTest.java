package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	City v1=new City(1,-1);
	City v2=new City(1,1);
	City v3=new City();
	
	@Test
	public void distanceTo_V3ToV3_0() {
		int expected=0;
		int actual=(int)v3.distanceTo(v3);
		assertEquals(expected, actual);
	}
	@Test
	public void distanceTo_V1ToV2_2() {
		int expected=2;
		int actual=(int)v1.distanceTo(v2);
		assertEquals(expected, actual);
	}
	
	@Test
	public void distanceTo_V2ToV1_2() {
		int expected=2;
		int actual=(int)v2.distanceTo(v1);
		assertEquals(expected, actual);
	}
	
	@Test
	public void distanceTo_V1ToNull_Null() {
		Class<NullPointerException> expected=NullPointerException.class;
		int actual=(int)v1.distanceTo(null);
		//assertEquals(expected, actual);
	}

}
