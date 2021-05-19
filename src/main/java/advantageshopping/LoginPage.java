package advantageshopping;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage {

    /**
     * Login button
     */
    @AndroidFindBy(id="login_button")
    private MobileElement loginButton;

    public void tapLoginButton() {
        this.loginButton.click();
    }

    public void setUsername(String username) {
        this.usernameField.clear();
        this.usernameField.sendKeys(username);
    }

    public void setPassword(String password) {
        this.passwordField.clear();
        this.passwordField.sendKeys(password);
    }
}
