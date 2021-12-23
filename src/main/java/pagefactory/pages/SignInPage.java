package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignInPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class, 'header-bottom')]/i[@class='icon icon-user-big']")
    private WebElement userIcon;

    @FindBy(xpath = "//a[@class='btn-offers']")
    private WebElement buttonGoToRegistration;

    //Reregistration xpath
    @FindBy(xpath = "//div[@class='sign-holder clearfix']//input[@name='phone']")
    private WebElement inputReregistrationPhone;
    @FindBy(xpath = "//div[@class='sign-holder clearfix']//input[@name='email']")
    private WebElement inputReregistrationEmail;
    @FindBy(xpath = "//div[@class='sign-holder clearfix']//input[@class='validate password show-password']")
    private WebElement inputReregistrationPassword;
    @FindBy(xpath = "//div[@class='sign-holder clearfix']//input[@class='validate password_1 show-password']")
    private WebElement inputReregistrationPasswordValidate;
    @FindBy(xpath = "//div[@class='form-field ']//button[contains(@class, 'button-reset')]")
    private WebElement buttonPreRegistration;
    @FindBy(xpath = "//div[@class='ttl js_title' ")
    private WebElement popUpRegistration;
    @FindBy(xpath = "//button[@class='fancybox-button fancybox-close-small']")
    private WebElement pupUpClosePreRegistration;
    @FindBy(xpath = "//input[@name='code']")
    private WebElement inputCodeOTPRegistration;
    @FindBy(xpath = "//div[@class='sign-holder clearfix']//button[contains(@class, 'button-reset')]")
    private WebElement buttonRegistration;


    //Logging xpath
    @FindBy(xpath = "//div[@class='sign-holder clearfix']//input[@name='login']")
    private WebElement inputLogging;
    @FindBy(xpath = "//div[@class='sign-holder clearfix']//input[@name='password']")
    private WebElement inputLoggingPassword;
    @FindBy(xpath = "//div[@class='row']/div[@class='col-xs-12 js_message' ")
    private WebElement popUpLogIn;

    //Profile
    @FindBy(xpath = "//ul[@class='table-profile table-profile-user']//input[@value= '")
    private WebElement typeTel;
    @FindBy(xpath = "//a[@class='category-box-item-profile' ")
    private WebElement buttonMineProfile;







    public SignInPage(WebDriver driver) {
        super(driver);
    }

    //Reregistration methods

    public void clickUserIcon(){
        userIcon.click();
    }
    public void clickButtonGoToRegistration(){
        buttonGoToRegistration.click();
    }
    public void writingInputReregistrationPhone(final String keyword) {
        inputReregistrationPhone.sendKeys(keyword);
    }
    public void writingInputReregistrationEmail(final String keyword) {
        inputReregistrationEmail.sendKeys(keyword);
    }
    public void writingInputReregistrationPassword(final String keyword) {
        inputReregistrationPassword.sendKeys(keyword);
    }
    public void writingInputReregistrationPasswordValidate(final String keyword) {
        inputReregistrationPasswordValidate.sendKeys(keyword);
    }
    public void clickButtonPreRegistration(){
        buttonPreRegistration.click();
    }
    public void checkPopUpRegistration(String keyword ) {
        driver.getPageSource().contains(popUpRegistration + "and text()='" + keyword + "']");
    }
    public void clickClosePopUpRegistration(){
        pupUpClosePreRegistration.click();
    }
    public void writingButtonCodeOTPRegistration(final String keyword) {
        inputCodeOTPRegistration.sendKeys(keyword);
    }
    public void clickButtonRegistration(){
        buttonRegistration.click();
    }

    //Logging methods
    public void clickLoggingOnUserIconButton() {
        userIcon.click();
    }
    public void writingLoggingUserLogin(final String keyword) {
        inputLogging.sendKeys(keyword);
    }
    public void writingLoggingUserPassword(final String keyword) {
        inputLoggingPassword.sendKeys(keyword);
    }
    public void clickButtonSingIn(){
        buttonRegistration.click();
    }
    public void checkPopUpLogIn(String keyword ) {
        driver.getPageSource().contains(popUpLogIn + "and text()='" + keyword + "']");
    }
    public void checkTypeTel(String keyword ) {
        driver.getPageSource().contains(typeTel + keyword + "']");
    }
    public void clickButtonsMineProfile(String keyword ) {
        driver.getPageSource().contains(buttonMineProfile + "and text()='" + keyword + "']");
    }


}
