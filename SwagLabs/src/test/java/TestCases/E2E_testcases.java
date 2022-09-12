package TestCases;

import Pages.Checkout_Page;
import Pages.Login_Page;
import Pages.Logout_Page;
import Pages.Shopping_Page;
import org.testng.annotations.Test;

public class E2E_testcases extends Base_Test {
    Login_Page login;
    Shopping_Page shopping;
    Checkout_Page checkout;
    Logout_Page logout;
    @Test
    public void E2E_testcase_001() throws InterruptedException {


        login= new Login_Page(base_test_driver);
        login.enter_user_name("standard_user");
        login.enter_password("secret_sauce");
        login.click_on_login_button();
        Thread.sleep(4000);

        shopping = new Shopping_Page(base_test_driver);
        shopping.click_on_add_backpack();
        shopping.click_on_add_bike_lite();
        shopping.click_on_add_bolt_shirt();
        shopping.click_on_cart_icon();
        Thread.sleep(4000);

        checkout = new Checkout_Page(base_test_driver);
        checkout.click_on_checkout_button();
        checkout.insert_first_name("Nada");
        checkout.insert_last_name("Kandil");
        checkout.insert_postal_code("0000");
        Thread.sleep(3000);
        checkout.click_on_continue_button();
        Thread.sleep(3000);
        checkout.click_on_finish_button();
        Thread.sleep(3000);
        checkout.click_on_back_home();
        Thread.sleep(2000);

        logout = new Logout_Page(base_test_driver);
        logout.click_on_menu_button();
        Thread.sleep(3000);
        logout.click_on_logout_button();
        Thread.sleep(3000);


    }
}
