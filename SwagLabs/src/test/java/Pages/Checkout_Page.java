package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout_Page extends Base_Page{
    public Checkout_Page(WebDriver driver) {
        super(driver);
    }

    private By checkout_button = By.id("checkout");
    private By first_name = By.id("first-name");
    private By last_name = By.id("last-name");
    private By postal_code = By.id("postal-code");

    private By continue_button = By.id("continue");
    private By finish_button = By.id("finish");
    private By back_home = By.id("back-to-products");


    public void click_on_checkout_button(){
        base_page_driver.findElement(checkout_button).click();
    }

    public void insert_first_name(String f_name){
        base_page_driver.findElement(first_name).sendKeys(f_name);
    }
    public void insert_last_name(String l_name){
        base_page_driver.findElement(last_name).sendKeys(l_name);
    }
    public void insert_postal_code(String pos_code){
        base_page_driver.findElement(postal_code).sendKeys(pos_code);
    }
    public void click_on_continue_button(){
        base_page_driver.findElement(continue_button).click();
    }
    public void click_on_finish_button(){
        base_page_driver.findElement(finish_button).click();
    }
    public void click_on_back_home(){

        base_page_driver.findElement(back_home).click();
    }


}
