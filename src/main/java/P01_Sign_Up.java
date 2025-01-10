import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P01_Sign_Up {
    SHAFT.GUI.WebDriver driver ;
    public P01_Sign_Up(SHAFT.GUI.WebDriver driver){this.driver =driver;}

    //locatoes
    By account = By.xpath("//input[@id=\"email_create\"]");
    By btnsign_in=  By.xpath("//a[@title=\"Log in to your customer account\"]");
    By submt = By.id("SubmitCreate");
    By gender = By.xpath("//label[@for=\"id_gender1\"]");
    By first_name = By.id("customer_firstname");
    By last_name = By.id("customer_lastname");
    By passw  =     By.xpath("//input[@data-validate=\"isPasswd\"]");
    By day = By.id("days");
    By months = By.id("months");
    By year = By.id("years");
    By checksign =By.id("newsletter");
    By register = By.id("submitAccount");




    public void createacc(String email_r , String pass_r){
        driver.element().click(btnsign_in)
                .click(account).type(account, email_r)
                .click(submt)
                .click(gender)
                .click(first_name).type(first_name, "mohamed")
                .click(last_name).type(last_name,"sayed")
                .click(passw).type(passw,pass_r)
                .select(day, "12")
                .select(months,"4")
                .select(year, "2001")
                .click(checksign)
                .click(register);


    }


}
