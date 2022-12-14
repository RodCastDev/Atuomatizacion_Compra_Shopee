package Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://shopee.com.co/")
public class Home extends PageObject {

    public static By tecnologiCategori = By.xpath("//div[@class='home-category-list__group']//*[text()='Tecnología']");

}
