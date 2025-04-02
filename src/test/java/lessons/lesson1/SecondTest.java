package lessons.lesson1;

import org.testng.annotations.Test;

public class SecondTest {

    @Test(groups = {"first group"})
    public void secondTest(){
        System.out.println("This our second test from FirstTest class");
    }
}
