package testPages;

import org.testng.annotations.Test;

import BaseUtil.BaseClass;

public class HomePageTest extends BaseClass {

@Test
public void logoTest() throws InterruptedException {
	homePage.logoDisplayed();
	Thread.sleep(3000);
}
}
