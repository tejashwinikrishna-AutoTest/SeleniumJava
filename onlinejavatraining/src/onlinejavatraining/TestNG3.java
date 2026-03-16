package onlinejavatraining;

import org.testng.annotations.Test;

public class TestNG3 {
	
	//testng executes on the basis of alphanumeric order
	@Test(priority=-10)
	public void a() {
		System.out.println("hello a test method");
	}
	
	@Test(priority=2)
	public void b() {
		System.out.println("hello b test method");
	}
	
	@Test
	public void c() {
		System.out.println("hello c test method");
	}
	
	@Test(priority=0)
	public void d() {
		System.out.println("hello d test method");
	}

}
