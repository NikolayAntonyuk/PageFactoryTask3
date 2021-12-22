package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MacBookPage extends BasePage {

    @FindBy(xpath = "//a[contains(@data-ecomm-cart, ':240710')]")
    private WebElement iphoneButton;

    public MacBookPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnIphoneButton() {
        iphoneButton.click();
    }

}
