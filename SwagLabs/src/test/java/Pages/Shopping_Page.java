package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Shopping_Page extends Base_Page{
    public Shopping_Page(WebDriver driver) {
        super(driver);
    }
    private By sauce_lab_bike_light = By.id("item_0_title_link");
    private By add_cart_bike_light = By.id("add-to-cart-sauce-labs-bike-light");

    private By sauce_lab_backpack = By.id("item_4_title_link");
    private By add_cart_backpack =By.id("add-to-cart-sauce-labs-backpack");
    private By sauce_bolt_shirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");

    private By back_to_products = By.id("back-to-products");
    private By cart_icon = By.id("shopping_cart_container");

    public void click_on_bike_light(){

        base_page_driver.findElement(sauce_lab_bike_light).click();
    }
    public void click_on_add_bike_lite(){

        base_page_driver.findElement(add_cart_bike_light).click();
    }
    public void click_on_add_bolt_shirt(){

        base_page_driver.findElement(sauce_bolt_shirt).click();
    }

    public void click_on_back_to_products(){

        base_page_driver.findElement(back_to_products).click();
    }
    public void click_on_backpack(){

        base_page_driver.findElement(sauce_lab_backpack).click();
    }
    public void click_on_add_backpack(){

        base_page_driver.findElement(add_cart_backpack).click();
    }

    public void click_on_cart_icon(){

        base_page_driver.findElement(cart_icon).click();
    }



}
