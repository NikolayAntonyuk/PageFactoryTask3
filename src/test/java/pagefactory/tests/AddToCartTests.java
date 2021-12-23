package pagefactory.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddToCartTests extends BaseTest {

    private String EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART = "2";



    @Test
    public void checkAddToCart() {
        getHomePage().clickOnProductCatalogButton();
        getHomePage().clickOnAppleStoreButton();
        getMacBookPage().clickOnPanelMacBook();
        getMacBookPage().waitForPageLoadComplete(30);
        getMacBookPage().clickOnMacBookButton();
        getMacBookPage().clickOnMacBookCartAdd();
        getMacBookPage().waitVisibilityOfElement(30, getMacBookPage().getAddToCartPopup());
        getMacBookPage().clickCountPlus();
        getMacBookPage().clickOnContinueShoppingButton();
        assertEquals(getMacBookPage().getTextOfAmountProductsInCart(), EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART);
    }
}
