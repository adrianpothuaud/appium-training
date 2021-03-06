package scenarios;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;

public class AdditionTest extends AndroidSetup {

    @BeforeClass
    public void setUp() throws Exception {

        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() {

        driver.quit();
    }

    @Test
    @Parameters({ "a", "b", "res" })
    public void AdditionTests(String a, String b, String res) {

        BasePage myPage = new BasePage(driver);

        myPage.Addition(a, b);

        String result = myPage.GetResult();

        Assert.assertEquals(res, result);
    }

}