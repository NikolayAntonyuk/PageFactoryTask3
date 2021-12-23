package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MacBookPage extends BasePage {


    @FindBy(xpath = "//div[@class='brand-box__title']/a[contains(text(), 'MacBook')]")
    private WebElement panelMacBook;

    @FindBy(xpath = "//div[@class='prod-cart height']")
    private List<WebElement> catalogProduct;

    @FindBy(xpath = "//a[@class='main-btn main-btn--green main-btn--large']")
    private WebElement cartAdd;

    @FindBy(xpath = "//div[@class='btns-cart-holder']//a[contains(@class,'btn--orange')]")
    private WebElement continueShoppingButton;

    @FindBy(xpath = "//span[contains(@class,'count--plus')]")
    private WebElement countPlus;

    @FindBy(xpath = "//div[contains(@class,'header-bottom__cart')]//div[contains(@class,'cart_count')]")
    private WebElement amountOfProductsInCart;

    @FindBy(id = "js_cart")
    private WebElement addToCartPopup;

    public MacBookPage(WebDriver driver) {
        super(driver);
    }
    public void clickOnPanelMacBook() {
        panelMacBook.click();
    }

    public void clickOnMacBookButton() {
         catalogProduct.get(4).click();
    }

    public void clickOnMacBookCartAdd() {
        cartAdd.click();
    }

    public void clickOnContinueShoppingButton() {
        continueShoppingButton.click();
    }

    public void clickCountPlus() {
        countPlus.click();
    }

    public WebElement getAddToCartPopup() {
        return addToCartPopup;
    }

    public String getTextOfAmountProductsInCart() {
        return amountOfProductsInCart.getText();
    }


}
