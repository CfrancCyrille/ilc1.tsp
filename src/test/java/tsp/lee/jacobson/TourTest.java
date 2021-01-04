package tsp.lee.jacobson;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TourTest {

	City city1=new City(1,-1);
	City city2=new City(1,1);
	ArrayList<City> voyage = new ArrayList<City>();
	
	
	
	
	
	@Test
	public void getDistance_City1_City2_True() {
		voyage.add(city1);
		voyage.add(city2);
		Tour t1= new Tour(voyage);
		double nombre_expected =4;
		boolean expected=true;
		boolean actual;
		double nombre_actual=t1.getDistance();
		if(nombre_actual==nombre_expected) {
			actual=true;
		}
		else {
			actual=false;
		}
		assertEquals(expected, actual);
		
	}

	
	@Test
	public void getDistance_City1_City2_False() {
		voyage.add(city1);
		voyage.add(city2);
		Tour t1= new Tour(voyage);
		double nombre_expected =2;
		boolean expected=false;
		boolean actual;
		double nombre_actual=t1.getDistance();
		if(nombre_actual!=nombre_expected) {
			actual=false;
		}
		else {
			actual=true;
		}
		assertEquals(expected, actual);
		
	}
	
	
}
