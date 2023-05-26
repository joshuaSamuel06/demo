package com;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	
	@Test(dataProvider = "Data")
	public void Alphafirst(String a,String b) {
		int x=Integer.parseInt(a);
		int y=Integer.parseInt(b);
		System.out.println(x*y);
		System.out.println("added");
		System.out.println("git master code");
		
	}
	
	@DataProvider 
	public Object[][] Data() {
		Object[][] a= new Object[3][2];
		a[0][0]="3";
		a[0][1]="3";
		a[1][0]="2";
		a[1][1]="2";
		a[2][0]="4";
		a[2][1]="4";
		return a;
	}
	
	

}
