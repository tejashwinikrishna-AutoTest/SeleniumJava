package onlinejavatraining;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG4 {

	// every test method is a scenario in testng
	// @Test -1st way
	public void a() {
		System.out.println("hello a test method");
	}

	// 2nd Way - widely used in market
	@Test(enabled = false)
	public void b() {
		System.out.println("hello b test method");
	}

	@Test(enabled = true)
	public void c() {
		System.out.println("hello c test method");
	}

	// Rerun Script -2 times
	@Test(invocationCount = 2)
	public void d() {
		System.out.println("hello d test method");
	}

	// if we keep invocation count =0 then the test will get skipped
	@Test(invocationCount = 0)
	public void e() {
		System.out.println("hello e test method");
	}

	// conditional skipping
	@Test
	public void f() {
		System.out.println("hello f test method");
		throw new SkipException("skipping f test method");
	}
}
