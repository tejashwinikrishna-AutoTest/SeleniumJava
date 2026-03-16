package onlinejavatraining;

import org.testng.annotations.Test;

public class TestNG2 {
	
	//testng executes on the basis of alphanumeric order
	@Test
	public void a3() {
		System.out.println("hello a3 test method");
	}
	
	@Test
	public void z() {
		System.out.println("hello z test method");
	}
	
	@Test
	public void ab() {
		System.out.println("hello ab test method");
	}
	
	@Test
	public void a1() {
		System.out.println("hello a1 test method");
	}

}
