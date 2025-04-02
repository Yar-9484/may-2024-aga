package lessons.lesson1;

import org.testng.annotations.*;

public class FirstTest {
    @BeforeGroups(groups = {"first group"})
    public void beforeGroup(){
        System.out.println("This is before group method");
    }
    @BeforeClass(groups = {"first group"})
    public void openURL(){
        System.out.println("Open URL");
    }

    @BeforeMethod
    public void login() {
        System.out.println("The user logged in");
    }
    @Test(groups = {"first group"})
    public void firstTest(){
        System.out.println("This is our first test");

    }
    @Test
    public void secondTest(){
        System.out.println("This our second test from FirstTest class");
    }
    @AfterMethod
    public void logout(){
        System.out.println("The user logged out");
    }
    @AfterClass
    public void closeBrowser(){
        System.out.println("Browser closed");
    }
}
