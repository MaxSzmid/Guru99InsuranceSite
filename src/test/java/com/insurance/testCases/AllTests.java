package com.insurance.testCases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ HomePageTestCase.class, LoginPageTestCase.class, RegisterPageTestCase.class })
public class AllTests {

}
