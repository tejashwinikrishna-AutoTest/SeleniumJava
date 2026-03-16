package onlinejavatraining;

import org.testng.annotations.Test;

public class TestNG7 {
	
	@Test(groups="Regression")
	public void a() {
		System.out.println("hello a test method");
	}

	@Test(groups="Regression")
	public void b() {
		System.out.println("hello b test method");
	}
	
	@Test(groups="Regression")
	public void c() {
		System.out.println("hello c test method");
	}

	@Test(groups="Regression")
	public void d() {
		System.out.println("hello d test method");
	}
	
	@Test(groups={"Regression","Sanity"})
	public void e() {
		System.out.println("hello e test method");
	}
	
	@Test(groups={"Regression","Smoke"})
	public void f() {
		System.out.println("hello f test method");
	}




}
