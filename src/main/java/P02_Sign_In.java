import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P02_Sign_In {
    SHAFT.GUI.WebDriver driver ;
    public P02_Sign_In(SHAFT.GUI.WebDriver driver){this.driver =driver;}

    //locatoes
    By btnsign_in=  By.xpath("//a[@title=\"Log in to your customer account\"]");
    By account = By.xpath("//input[@id=\"email\"]");
    By passw  =     By.xpath("//input[@data-validate=\"isPasswd\"]");
    By getBtnsign_in = By.id("SubmitLogin");
    By women = By.xpath("//a[@title=\"Women\"]");
//    By te_shirt = By.cssSelector();






    public void sign_in(String email , String pass){
        driver.element().click(btnsign_in)
                .click(account).type(account, email)
                .click(passw).type(passw,pass)
                .click(getBtnsign_in)
                .hover(women);



    }


}
