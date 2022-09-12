package TestCases;

import Pages.Login_Page;
import Utilities.Read_Excel_Sheet;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class Base_Test {
   protected ChromeDriver base_test_driver;
   private final String URL = "https://www.saucedemo.com/";
   protected Login_Page login;

   @BeforeClass
   public void setUp() throws Exception{
       WebDriverManager.chromedriver().setup();
       base_test_driver = new ChromeDriver();
       new ChromeOptions();
       base_test_driver .manage().window().maximize();
       base_test_driver.get(URL);
       login = new Login_Page(base_test_driver);
   }

   @AfterClass
   public void teardown() throws Exception{
       base_test_driver.quit();
   }

    @DataProvider
    public Object[][] test_data() throws IOException, InvalidFormatException
    {
        Read_Excel_Sheet obj = new Read_Excel_Sheet();
        return obj.read_sheet();

    }
}
