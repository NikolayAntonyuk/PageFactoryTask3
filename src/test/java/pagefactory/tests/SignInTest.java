package pagefactory.tests;

import org.testng.annotations.Test;


public class SignInTest extends BaseTest{

    private String PHONE_KEYWORD = "0667884517";
    private String PHONE_KEYWORD2 = "380674459584";
    private String EMAIL_KEYWORD = "query@gmail.com";
    private String PASSWORD = "qwerty123";
    private String PHONE_EMAIL = "query@gmail.com";
    private String RESULT_ERROR = "Ошибка";
    private String RESULT_SUCCESSFULLY = "Успешно!";
    private String PHONE_OTP = "580541";
    private String RESULT_LOGGED = "Вы успешно авторизовались!";
    private String EXIT = "Выход";




    @Test
    public void checkRegistrationUser() {
        getSignInPage().clickUserIcon();
        getSignInPage().clickButtonGoToRegistration();
        getSignInPage().writingInputReregistrationPhone(PHONE_KEYWORD);
        getSignInPage().writingInputReregistrationEmail(PHONE_EMAIL);
        getSignInPage().writingInputReregistrationPassword(PASSWORD);
        getSignInPage().writingInputReregistrationPasswordValidate(PASSWORD);
        getSignInPage().clickButtonPreRegistration();
        getMacBookPage().waitForPageLoadComplete(30);
        getSignInPage().checkPopUpRegistration(RESULT_SUCCESSFULLY);
        getSignInPage().clickClosePopUpRegistration();
        getSignInPage().writingButtonCodeOTPRegistration(PHONE_OTP);
        getSignInPage().clickButtonRegistration();
        getMacBookPage().waitForPageLoadComplete(30);
        getSignInPage().checkPopUpRegistration(RESULT_ERROR);
        getSignInPage().clickClosePopUpRegistration();
    }

    @Test
    public void checkSingInUser() {
        getSignInPage().clickLoggingOnUserIconButton();
        getSignInPage().writingLoggingUserLogin(PHONE_KEYWORD2);
        getSignInPage().writingLoggingUserPassword(PASSWORD);
        getSignInPage().clickButtonSingIn();
        getSignInPage().checkPopUpLogIn(RESULT_LOGGED);
        getSignInPage().clickClosePopUpRegistration();
        getSignInPage().clickLoggingOnUserIconButton();
        getSignInPage().checkTypeTel(PHONE_KEYWORD2);
        getSignInPage().clickButtonsMineProfile(EXIT);
    }
}
