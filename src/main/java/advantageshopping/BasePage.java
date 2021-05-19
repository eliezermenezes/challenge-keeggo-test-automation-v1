package advantageshopping;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class BasePage {

    /**
     * Side menu icon
     */
    @AndroidFindBy(id="com.Advantage.aShopping:id/imageViewMenu")
    protected MobileElement sideMenu;

    /**
     * Login option side menu
     */
    @AndroidFindBy(id="com.Advantage.aShopping:id/linearLayoutLogin")
    protected MobileElement loginOptionSideMenu;

    /**
     * User name input
     */
    @AndroidFindBy(id="login_button")
    protected MobileElement usernameField;

    /**
     * Password input
     */
    @AndroidFindBy(id="login_button")
    protected MobileElement passwordField;

    protected void tapMenu() {
        this.sideMenu.click();
    }

    protected void tapLoginOption() {
        this.loginOptionSideMenu.click();
    }

    protected void goToLoginScreen() {
        System.out.println(this.sideMenu.getText());
        this.tapMenu();
        this.tapLoginOption();
    }
}
