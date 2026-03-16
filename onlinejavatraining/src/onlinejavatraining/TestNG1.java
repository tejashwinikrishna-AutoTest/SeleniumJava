package onlinejavatraining;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class TestNG1 {
	
	@Test
	public void a() {
		System.out.println("hello a2 test method");
	}
	
	@BeforeTest
	public void b() {
		System.out.println("hello before test method");
	}
	
	@BeforeSuite
	public void c() {
		System.out.println("hello before suite method");
	}
	
	@AfterMethod
	public void d() {
		System.out.println("hello after method");
	}
	
	@BeforeClass
	public void e() {
		System.out.println("hello before class method");
	}
	
	@AfterTest
	public void f() {
		System.out.println("hello After test method");
	}
    
	@AfterClass
	public void g() {
		System.out.println("hello after class method");
	}
	
	@BeforeMethod
	public void h() {
		System.out.println("hello before  method");
	}
	
	@AfterSuite
	public void i() {
		System.out.println("hello after suite method");
	}
	
	@Test
	public void a1() {
		System.out.println("hello a1 test method");
	}
	
	@Test
	public void B1() {
		System.out.println("hello B1 test method");
	}
	
}
