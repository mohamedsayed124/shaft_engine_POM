import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase_01 {
    SHAFT.GUI.WebDriver driver;
    SHAFT.TestData.JSON data_file;


    @BeforeClass
    public void setup(){
        driver=new SHAFT.GUI.WebDriver();
        data_file = new SHAFT.TestData.JSON("data_info_register.json");
        driver.browser().navigateToURL("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
    }
    @Test
    public void create(){
    new P01_Sign_Up(driver).createacc(data_file.getTestData("email"),data_file.getTestData("pass"));
    }
    @AfterClass
    public void tearDown() throws InterruptedException {
            Thread.sleep(2000);
        driver.quit();
    }
}
