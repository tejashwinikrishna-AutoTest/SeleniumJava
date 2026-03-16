package onlinejavatraining;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG6 {

	@Test
	public void a() {
		Assert.assertTrue(3<12);//false the next line will not get executed
		System.out.println("hello a test method");
	}
	
	@Test
	public void b() {
		Assert.assertFalse(3>12);
		System.out.println("hello b test method");
	}
	
	@Test
	public void c() {
		Assert.assertTrue(3>12);
		System.out.println("hello c test method");
	}
	
	@Test(dependsOnMethods= {"a","b","c"},priority=-1)
	public void d() {
		System.out.println("hello d test method");
	}
	
	@Test
	public void e() {
		int actualInteger=2;
		int expectedInteger=2;
		Assert.assertEquals(expectedInteger, actualInteger);
		System.out.println("hello equal assertion");
	}

}
