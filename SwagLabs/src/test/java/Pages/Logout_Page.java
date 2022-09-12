package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout_Page extends Base_Page{
    public Logout_Page(WebDriver driver) {
        super(driver);
    }

    private By menu_button = By.id("react-burger-menu-btn");
    private By logout_button = By.id("logout_sidebar_link");

    public void click_on_menu_button(){
        base_page_driver.findElement(menu_button).click();
    }
    public void click_on_logout_button(){
        base_page_driver.findElement(logout_button).click();
    }


}
