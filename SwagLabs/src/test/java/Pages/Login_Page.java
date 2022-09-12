package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page extends Base_Page{

    public Login_Page(WebDriver driver) {
        super(driver);
    }
    private By user_name = By.id("user-name");
    private By password = By.id("password");
    private By login_button = By.id("login-button");

    public void enter_user_name(String name){
        base_page_driver.findElement(user_name).sendKeys(name);
    }

    public void enter_password(String pas){
        base_page_driver.findElement(password).sendKeys(pas);
    }

    public void click_on_login_button(){
        base_page_driver.findElement(login_button).click();
    }
}
